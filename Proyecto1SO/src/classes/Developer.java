package classes;


import classes.Drive;
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
 * @author Daniel Morillo
 */
public class Developer extends Thread {
    
    
    private int Developersquantity;//Cantidad de trabajadores por tipo
    private int type; //Tipo de trabajador 0: guionistas 1: escenarios 2: animadores 3: doblajes 4: plotwist
    private int salary;
    private float accSalary; //Salario acomulado
    private int dayDuration; 
    private int daysWorking; //Cantidad de dias despues de la ultima entrega
    private int daysToWork; //Cantidad de dias a trabajar para entregar
    private int contentToSend; //Contenido a entregar el dia de la entrega
    private Semaphore mutex;
    private Drive drive; //El drive a usar
    private JLabel[] ContablesLabel;
    private Company company;

    public Developer(int quantity , int type, int salary, int dayDuration, Semaphore mutex, int daysToWork, int contentToSend, Company company) {
        this.type = type;
        this.salary = salary;
        this.accSalary = 0;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.Developersquantity = quantity;
        this.daysWorking = 0;
        this.daysToWork = daysToWork;
        this.contentToSend = contentToSend;
        this.company = company;
        this.drive = company.getDrive();
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Work();
                obtainSalary();
                //System.out.println("\nTrabajadores de tipo: "+ getType()+ " ganaron $" + getAccSalary()+"\n");
                sleep(getDayDuration());
            } catch (InterruptedException Err){
                System.out.println(Err);
            }
        }
    }
    
    
    
            
    public void Work() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            addPart();
            setDaysWorking(0);
        }
    }
    
    public void addPart() {
        setDaysWorking(getDaysWorking()+1);
        if (getDaysWorking() >= getDaysToWork()) {
            try {
                getMutex().acquire();
                getDrive().addPart(getType(), getContentToSend() * getDevelopersquantity());
                getMutex().release();
                //System.out.print("\nContenido del Drive: \nAnimaciones: "+getDrive().getAnimaciones()+"\n Doblajes: "+getDrive().getDoblajes()+
                //"\nEscenarios: "+getDrive().getEscenarios()+"\nGuiones: "+getDrive().getGuiones()+"\nPlotwist: "+getDrive().getPlotwist());
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        obtainSalary();
    }
    
    public void obtainSalary() {
        setAccSalary(getAccSalary() + getSalary()*getDevelopersquantity()*24);
        getCompany().setGastos(getCompany().getGastos()+getSalary()*getDevelopersquantity()*24);
        this.ContablesLabel[1].setText(String.valueOf(getCompany().getGastos() + getSalary()*24*getDevelopersquantity()));
    }

    /**
     * @return the Developersquantity
     */
    public int getDevelopersquantity() {
        return Developersquantity;
    }

    /**
     * @param Developersquantity the Developersquantity to set
     */
    public void setDevelopersquantity(int Developersquantity) {
        this.Developersquantity = Developersquantity;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
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
    public float getAccSalary() {
        return accSalary;
    }

    /**
     * @param accSalary the accSalary to set
     */
    public void setAccSalary(float accSalary) {
        this.accSalary = accSalary;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the daysWorking
     */
    public int getDaysWorking() {
        return daysWorking;
    }

    /**
     * @param daysWorking the daysWorking to set
     */
    public void setDaysWorking(int daysWorking) {
        this.daysWorking = daysWorking;
    }

    /**
     * @return the daysToWork
     */
    public int getDaysToWork() {
        return daysToWork;
    }

    /**
     * @param daysToWork the daysToWork to set
     */
    public void setDaysToWork(int daysToWork) {
        this.daysToWork = daysToWork;
    }

    /**
     * @return the contentToSend
     */
    public int getContentToSend() {
        return contentToSend;
    }

    /**
     * @param contentToSend the contentToSend to set
     */
    public void setContentToSend(int contentToSend) {
        this.contentToSend = contentToSend;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the drive
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     * @param drive the drive to set
     */
    public void setDrive(Drive drive) {
        this.drive = drive;
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




    

    
    
    
}
