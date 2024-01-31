
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
public class PM extends Thread{
    
    private boolean changeDay; //Estado para cambiar el dia
    private boolean idle; //Estado para verificar que esta viendo anime (Si: True, No:False)
    private int timeIdle; //Tiempo en que dura viendo anime
    private int dayDuration; //Duracion de un dia entero
    private int hour; //Duracion de una hora
    private boolean hourCheck; //Verificar que paso una hora
    private int countHour; //Contador de horas
    private Company company; //Empresa asociada
    private int salary;
    private int accSalary;
    private boolean sanctioned; //true: falta; false: no falta
    private int sanctions; //numero de sanciones
    
    public PM(int dayDuration, Company company, int salary){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.timeIdle = dayDuration/48;
       this.company = company;
       this.countHour = 0;
       this.changeDay = false;
       this.idle = false;
       this.hourCheck = false;
       this.salary = salary;
       this.accSalary = 0;
       this.sanctions = 0;
       this.sanctioned = false;
        
    }
    
    @Override
    public void run(){
        while (true){
            try {
                for (int contTime = 0;contTime < 16;contTime++){
                    //System.out.println("\nPM trabajando");
                    sleep(getTimeIdle());
                    setIdle(true);
                    //System.out.println("\nPM Flojeando");
                    sleep(getTimeIdle());
                    setIdle(false);
                }
                setIdle(false);
                System.out.println("\nPM trabajando (cambiando dia)");
                if (company.getCommitDay()!= 0) {
                    company.setCommitDay(company.getCommitDay()-1);
                    System.out.print("\nDIAS PARA ENTREGAR: " + company.getCommitDay());
                } else {
                    System.out.println("\nYA ES EL DIA DE LA ENTREGA");
                    company.setCommitDay(company.getFixCommitDay());
                }
                obtainSalary();
                sleep(8*getHour());
            }catch (InterruptedException ex) {
               Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    }
    
    public void obtainSalary() {
        if (isSanctioned()){
        setAccSalary(getAccSalary() + getSalary() - 100);
            setSanctions(getSanctions()+1);
    } else {
            setAccSalary(getAccSalary() + getSalary());
        }}
    
    

    public boolean isChangeDay() {
        return changeDay;
    }

    public void setChangeDay(boolean changeDay) {
        this.changeDay = changeDay;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getTimeIdle() {
        return timeIdle;
    }

    public void setTimeIdle(int timeIdle) {
        this.timeIdle = timeIdle;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isHourCheck() {
        return hourCheck;
    }

    public void setHourCheck(boolean hourCheck) {
        this.hourCheck = hourCheck;
    }

    public int getCountHour() {
        return countHour;
    }

    public void setCountHour(int countHour) {
        this.countHour = countHour;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the accSalary
     */
    public int getAccSalary() {
        return accSalary;
    }

    /**
     * @param accSalary the accSalary to set
     */
    public void setAccSalary(int accSalary) {
        this.accSalary = accSalary;
    }

    /**
     * @return the sanctioned
     */
    public boolean isSanctioned() {
        return sanctioned;
    }

    /**
     * @param sanctioned the sanctioned to set
     */
    public void setSanctioned(boolean sanctioned) {
        this.sanctioned = sanctioned;
    }

    /**
     * @return the sanctions
     */
    public int getSanctions() {
        return sanctions;
    }

    /**
     * @param sanctions the sanctions to set
     */
    public void setSanctions(int sanctions) {
        this.sanctions = sanctions;
    }
    
    
}
