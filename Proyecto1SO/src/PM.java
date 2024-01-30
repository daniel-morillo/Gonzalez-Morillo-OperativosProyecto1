
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
    private Semaphore mutex;
    
    public PM(int dayDuration, Company company, Semaphore mutex){
       this.dayDuration = dayDuration;
       this.hour = dayDuration/24;
       this.timeIdle = dayDuration/48;
       this.company = company;
       this.countHour = 0;
       this.changeDay = false;
       this.idle = false;
       this.hourCheck = false;
       this.mutex = mutex;
        
    }
    
    @Override
    public void run(){
        while (true){
            try {
                if(changeDay){
                    changeDayFunc();
                    sleep(getDayDuration());
                }else if(countHour == 23){
                    changeDay = true;
                }else if (countHour <= 16){
                    if(idle){
                        Thread.sleep(timeIdle);
                        idle = !idle;
                        if(hourCheck){
                            hourCheck = !hourCheck;
                            countHour =+1;
                        }else{
                            hourCheck = !hourCheck;
                        }
                    }else{
                        Thread.sleep(timeIdle);
                        idle = !idle;
                        if(hourCheck){
                            hourCheck = !hourCheck;
                            countHour =+1;
                        }else{
                            hourCheck = !hourCheck;
                        }
                    }
                }else{
                    Thread.sleep(hour);
                    countHour =+1;
                }
                
            }catch (InterruptedException ex) {
               Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    }
    
    public void changeDayFunc() {
        changeDay = false;
        idle = false;
        try {
            getMutex().acquire();
            if (company.getCommitDay()!= 0){                      
                company.setCommitDay(company.getCommitDay() -1);
                        
            }
            System.out.print("\nDIAS PARA ENTREGAR" + company.getCommitDay());
            getMutex().release();
            } catch (InterruptedException ex) {
                Logger.getLogger(PM.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
    }

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

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
    
    
}
