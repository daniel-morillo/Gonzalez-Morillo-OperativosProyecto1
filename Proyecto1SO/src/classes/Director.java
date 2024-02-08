package classes;


import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel Gonzalez
 */
public class Director extends Thread{
    
    private int salary;
    private int accSalary;
    private int dayDuration;
    private int idle; //0: entregando capitulos, 1: trabajando 2: viendo al PM
    private int watchTime; //Tiempo que vigila al PM
    private int timeLeft; //Tiempo que falta despues de la vigilancia para completar la hora
    private int hour;
    private Semaphore mutex;
    private Company company;
    private PM pm;
    private Drive drive;
    
    //Los labels que el director manipula
    private JLabel[] labels;
    
    
    public Director(int dayDuration, int salary, Company company, PM pm, Semaphore mutex, Drive drive){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.watchTime = dayDuration/41;
       this.timeLeft = this.hour - this.watchTime;
       this.salary = salary;
       this.accSalary = 0;
       this.company = company;
       this.pm = pm;
       this.mutex = mutex;
       this.drive = drive;
       this.idle = 1;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                setIdle(1);
                int randHour = (int)Math.floor(Math.random()*24+1);
                checkDay();
                actState();
                for (int contTime = 0;contTime < 24;contTime++){
                    sleep(hour);
                    obtainSalary();
                    if(contTime == randHour){
                        setIdle(2);
                        actState();
                        sleep(watchTime);
                        if(getPm().isIdle()){
                            getPm().setSanctioned(true);
                            getPm().setSanctions(getPm().getSanctions() + 1);
                        }
                        setIdle(1);
                        sleep(timeLeft);
                    }
                }
            }catch (InterruptedException ex) {
               Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    //Actuaaliza los labels del estado del director
    public void actState() {
        switch(this.getIdle()){
            
            case 0: 
                this.labels[6].setText("Entregando Capitulos");
                break;
            case 1:
                this.labels[6].setText("Trabajando");
                break;
            case 2:
                this.labels[6].setText("Vigilando");
                break;
            default:
                break;
        }
    }
    
    public void checkDay() throws InterruptedException{
        this.labels[3].setText(String.valueOf(getPm().getCommitDay()));
        if (getPm().getCommitDay() == 0){
            sendChapters();   
        }
    }
    
    public void sendChapters() throws InterruptedException{
        setIdle(0);
        actState();
        mutex.acquire();
        getCompany().setIngresos(getCompany().getIngresos() + getDrive().getFinishedChapter()*getCompany().getChapterProfit() + getDrive().getFinishedPlotChapter()*getCompany().getPlotProfit());
        getCompany().setBeneficios(getCompany().getIngresos() - getCompany().getGastos());
        getDrive().setFinishedChapter(0);
        getDrive().setFinishedPlotChapter(0);
        mutex.release();
        sleep(dayDuration);
        this.labels[0].setText(String.valueOf(getCompany().getIngresos()));
        this.labels[2].setText(String.valueOf(getCompany().getBeneficios()));
        
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*24);
        this.getCompany().setGastos(getCompany().getGastos() + getSalary()*24);
        this.getCompany().setBeneficios(getCompany().getIngresos() - getCompany().getGastos());
        this.labels[1].setText(String.valueOf(getCompany().getGastos()));
        this.labels[2].setText(String.valueOf(getCompany().getBeneficios()));
    }
    
    
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(int accSalary) {
        this.accSalary = accSalary;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }


    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore Mutex) {
        this.mutex = Mutex;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public PM getPm() {
        return pm;
    }

    public void setPm(PM pm) {
        this.pm = pm;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    /**
     * @return the labels
     */
    public JLabel[] getLabels() {
        return labels;
    }

    /**
     * @param labels the labels to set
     */

    /**
     * @param labels the labels to set
     */
    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    /**
     * @return the idle
     */
    public int getIdle() {
        return idle;
    }

    /**
     * @param idle the idle to set
     */
    public void setIdle(int idle) {
        this.idle = idle;
    }

   
    
}
