
import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Morillo
 */
public class Developer extends Thread {
    
    private int type; //Tipo de trabajador
    private int salary;
    private float accSalary; //Salario acomulado
    private int dayDuration; 
    private float workContent; //Cantidad de trabajo listo
    private Semaphore mutex;

    public Developer(int type, int salary, float accSalary, int dayDuration, float workContent, Semaphore mutex) {
        this.type = type;
        this.salary = salary;
        this.accSalary = accSalary;
        this.dayDuration = dayDuration;
        this.workContent = workContent;
        this.mutex = mutex;
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
     * @return the workContent
     */
    public float getWorkContent() {
        return workContent;
    }

    /**
     * @param workContent the workContent to set
     */
    public void setWorkContent(float workContent) {
        this.workContent = workContent;
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
    
    
    
}
