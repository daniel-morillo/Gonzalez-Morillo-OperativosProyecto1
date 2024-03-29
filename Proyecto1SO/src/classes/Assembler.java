package classes;




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
public class Assembler extends Thread{
    
    private int Assemblerquantity;//Cantidad de ensambladores
    private int salary; 
    private float accSalary; //Salario acomulado
    private int dayDuration; 
    private int daysWorking; //Cantidad de dias despues de la ultima entrega
    private int daysToWork; //Cantidad de dias a trabajar para entregar
    private int nextPlot; // Capitulos antes del capitulo con plot twist
    private int countPlot; // Contador antes del capitulo con plot twist
    private boolean makePlot; //Crear capitulo con plot twist
    private Semaphore mutex;
    private Drive drive; //El drive a usar
    private Company company;
    
    private int numGuiones; //Numero minimo de guiones para un capitulo
    private int numEscenarios; //Numero minimo de escenarios para un capitulo
    private int numAnimaciones; //Numero minimo de animaciones para un capitulo
    private int numDoblajes; //Numero minimo de doblajes para un capitulo
    private int numPlotTwist; //Numero minimo de plot twist para un capitulo con plot twist
    
    private JLabel[] ContablesLabel;
    
    public Assembler(int quantity , int salary, int dayDuration, Semaphore mutex, int daysToWork, Company company, 
            int numGuiones, int numEscenarios, int numAnimaciones, int numDoblajes, int numPlotTwist, int nextPlot) {
        this.salary = salary;
        this.accSalary = 0;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.Assemblerquantity = quantity;
        this.daysWorking = 0;
        this.daysToWork = daysToWork;
        this.countPlot = 0;
        this.makePlot = false;
        this.company =  company;
        this.drive = company.getDrive();
        
        
        this.numGuiones = numGuiones; 
        this.numEscenarios = numEscenarios; 
        this.numAnimaciones = numAnimaciones; 
        this.numDoblajes = numDoblajes; 
        this.numPlotTwist = numPlotTwist;
        
        this.nextPlot = nextPlot;
        this.countPlot = 0;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                checkDrive();
                obtainSalary();
                sleep(getDayDuration());
            } catch (InterruptedException Err){
                System.out.println(Err);
            }
        }
    }
    
    
      public void checkDrive(){
        if (getDrive().getGuiones() >= getNumGuiones() && getDrive().getEscenarios() >= getNumEscenarios() && 
            getDrive().getAnimaciones() >= getNumAnimaciones() && getDrive().getDoblajes() >= getNumDoblajes()) {
            if(getCountPlot() >= getNextPlot() && getDrive().getPlotwist() >= getNumPlotTwist()){
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
                setMakePlot(false);
                getMutex().release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        obtainSalary();
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*getAssemblerquantity()*24);
        getCompany().setGastos(getCompany().getGastos()+getSalary()*getAssemblerquantity()*24);
        this.ContablesLabel[1].setText(String.valueOf(getCompany().getGastos()+getSalary()*getAssemblerquantity()*24));
    }
    
    public void delate() {
        getDrive().setGuiones(getDrive().getGuiones() - getNumGuiones());
        getDrive().setEscenarios(getDrive().getEscenarios() - getNumEscenarios());
        getDrive().setAnimaciones(getDrive().getAnimaciones() - getNumAnimaciones());
        getDrive().setDoblajes(getDrive().getDoblajes() - getNumDoblajes());
        setCountPlot(getCountPlot() + 1);
        if(this.makePlot){
            getDrive().setPlotwist(getDrive().getPlotwist() - getNumPlotTwist());
            setCountPlot(0);
        }
        getDrive().actParts();
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

    public int getNumGuiones() {
        return numGuiones;
    }

    public void setNumGuiones(int numGuiones) {
        this.numGuiones = numGuiones;
    }

    public int getNumEscenarios() {
        return numEscenarios;
    }

    public void setNumEscenarios(int numEscenarios) {
        this.numEscenarios = numEscenarios;
    }

    public int getNumAnimaciones() {
        return numAnimaciones;
    }

    public void setNumAnimaciones(int numAnimaciones) {
        this.numAnimaciones = numAnimaciones;
    }

    public int getNumDoblajes() {
        return numDoblajes;
    }

    public void setNumDoblajes(int numDoblajes) {
        this.numDoblajes = numDoblajes;
    }

    public int getNumPlotTwist() {
        return numPlotTwist;
    }

    public void setNumPlotTwist(int numPlotTwist) {
        this.numPlotTwist = numPlotTwist;
    }

    /**
     * @return the nextPlot
     */
    public int getNextPlot() {
        return nextPlot;
    }

    /**
     * @param nextPlot the nextPlot to set
     */
    public void setNextPlot(int nextPlot) {
        this.nextPlot = nextPlot;
    }

    /**
     * @return the ContablesLabel
     */
    public JLabel[] getContablesLabel() {
        return ContablesLabel;
    }

    /**
     * @param ContablesLabel the ContablesLabel to set
     */
    public void setContablesLabel(JLabel[] ContablesLabel) {
        this.ContablesLabel = ContablesLabel;
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * @param ContablesLabel the ContablesLabel to set
     */
    
    
    
}
