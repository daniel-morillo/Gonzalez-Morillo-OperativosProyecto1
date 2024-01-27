

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel Gonzalez
 */
public class assemblerCN extends Thread{
    
    private int Assemblerquantity;//Cantidad de ensambladores
    private int salary;
    private float accSalary; //Salario acomulado
    private int dayDuration; 
    private int daysWorking; //Cantidad de dias despues de la ultima entrega
    private int daysToWork; //Cantidad de dias a trabajar para entregar
    private int countPlot;
    private boolean makePlot;
    private Semaphore mutex;
    private Drive drive; //El drive a usar
    
    public assemblerCN(int quantity , int salary, int dayDuration, Semaphore mutex, int daysToWork, Drive drive) {
        this.salary = salary;
        this.accSalary = 0;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.Assemblerquantity = quantity;
        this.daysWorking = 0;
        this.daysToWork = daysToWork;
        this.countPlot = 0;
        this.makePlot = false;
        this.drive = drive;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                checkDrive();
                obtainSalary();
                System.out.println("\nEnsamblador gano: gano $" + getAccSalary()+"\n");
                sleep(getDayDuration());
            } catch (InterruptedException Err){
                System.out.println(Err);
            }
        }
    }
    
    
      public void checkDrive(){
        if (getDrive().getGuiones() >=1 && getDrive().getEscenarios() >= 2 && 
            getDrive().getAnimaciones() >= 6 && getDrive().getDoblajes() >= 5) {
            if(this.countPlot >= 3 && getDrive().getPlotwist() >= 1){
                this.setMakePlot(true);
                Work();
            }else{
               Work(); 
            }
        }
    }

    public void Work() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            createChapter();
            setDaysWorking(0);
        }
     }
    
    public void createChapter() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            try {
                getMutex().acquire();
                getDrive().addChapter(1, this.makePlot);
                delate();
                this.setMakePlot(false);
                getMutex().release();
                System.out.print("\n Capitulos en Drive: \nCapitulos: "+getDrive().getFinishedChapter()+"\n Capitulos con plotwist: "+getDrive().getFinishedPlotChapter());
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        obtainSalary();
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*getAssemblerquantity());
    }
    
    public void delate() {
        getDrive().setGuiones(getDrive().getGuiones() -1);
        getDrive().setEscenarios(getDrive().getEscenarios() - 2);
        getDrive().setAnimaciones(getDrive().getAnimaciones() - 6);
        getDrive().setDoblajes(getDrive().getMaxdoblajes() - 5);
        setCountPlot(getCountPlot() + 1);
        if(this.makePlot){
            getDrive().setPlotwist(getDrive().getPlotwist() -1);
            setCountPlot(0);
        }
     }
            
    public int getAssemblerquantity() {
        return Assemblerquantity;
    }

    public void setAssemblerquantity(int Assemblerquantity) {
        this.Assemblerquantity = Assemblerquantity;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getAccSalary() {
        return accSalary;
    }

    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public int getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(int daysWorking) {
        this.daysWorking = daysWorking;
    }

    public int getDaysToWork() {
        return daysToWork;
    }

    public void setDaysToWork(int daysToWork) {
        this.daysToWork = daysToWork;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getCountPlot() {
        return countPlot;
    }

    public void setCountPlot(int countPlot) {
        this.countPlot = countPlot;
    }

    public boolean isMakePlot() {
        return makePlot;
    }

    public void setMakePlot(boolean makePlot) {
        this.makePlot = makePlot;
    }
    
    
}
