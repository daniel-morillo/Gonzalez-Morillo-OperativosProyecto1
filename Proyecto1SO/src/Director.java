
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Director extends Thread{
    
    private int salary;
    private int accSalary;
    private int dayDuration;
    private int watchTime; //Tiempo que vigila al PM
    private int timeLeft; //Tiempo que falta despues de la vigilancia para completar la hora
    private int hour;
    private Semaphore mutex;
    private Company company;
    private PM pm;
    private Drive drive;
    
    
    public Director(int dayDuration, int salary, Company company, PM pm, Semaphore mutex, Drive drive){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.watchTime = dayDuration/41;
       this.timeLeft = this.dayDuration - this.watchTime;
       this.salary = salary;
       this.accSalary = 0;
       this.company = company;
       this.pm = pm;
       this.mutex = mutex;
       this.drive = drive;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                int randHour = (int)Math.floor(Math.random()*24+1);
                checkDay();
                for (int contTime = 0;contTime < 24;contTime++){
                    sleep(hour);
                    obtainSalary();
                    if(contTime == randHour){
                        sleep(watchTime);
                        if(getPm().isIdle()){
                            System.out.println("\n PM AMONESTADO");
                            getPm().setSanctions(getPm().getSanctions() + 1);
                        }
                        sleep(timeLeft);
                    }
                }
            }catch (InterruptedException ex) {
               Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    
    public void checkDay() throws InterruptedException{
        if (pm.getCommitDay() == 0){
            sendChapters();   
        }
    }
    
    public void sendChapters() throws InterruptedException{
        System.out.println("\nENVIANDO CAPITULOS LISTOS");
        sleep(dayDuration);
        mutex.acquire();
        getCompany().setIngresos(getCompany().getIngresos() + getDrive().getFinishedChapter()*getCompany().getChapterProfit() + getDrive().getFinishedPlotChapter()*getCompany().getPlotProfit());
        getDrive().setFinishedChapter(0);
        getDrive().setFinishedPlotChapter(0);
        System.out.println("\nINGRESOS " + getCompany().getIngresos() + "K");
        mutex.release();      
        
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary());
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

   
    
}
