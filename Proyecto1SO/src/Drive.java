/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Morillo
 */
public class Drive {
    
    private int guiones; //type 0
    private int animaciones; //type 1
    private int escenarios; //type 2
    private int doblajes; //type 3
    private int plotwist; //type 4

public Drive(){
    this.animaciones = 0;
    this.guiones = 0;
    this.escenarios = 0;
    this.plotwist = 0;
    this.doblajes = 0;    
}    
//Función para añadir una parte al drive 
public void addPart (int employeType){
    switch (employeType) {
        case 0 -> {setGuiones(getGuiones()+1);}
        case 1 -> {setAnimaciones(getAnimaciones()+1);}
        case 2 -> {setEscenarios(getEscenarios()+1);}
        case 3 -> {setDoblajes(getDoblajes()+1);}
        case 4 -> {setPlotwist(getPlotwist()+1);}
        default -> System.out.println("No hay empleado con ese codigo");
         
    }
}

    /**
     * @return the guiones
     */
    public int getGuiones() {
        return guiones;
    }

    /**
     * @param guiones the guiones to set
     */
    public void setGuiones(int guiones) {
        this.guiones = guiones;
    }

    /**
     * @return the animaciones
     */
    public int getAnimaciones() {
        return animaciones;
    }

    /**
     * @param animaciones the animaciones to set
     */
    public void setAnimaciones(int animaciones) {
        this.animaciones = animaciones;
    }

    /**
     * @return the escenarios
     */
    public int getEscenarios() {
        return escenarios;
    }

    /**
     * @param escenarios the escenarios to set
     */
    public void setEscenarios(int escenarios) {
        this.escenarios = escenarios;
    }

    /**
     * @return the doblajes
     */
    public int getDoblajes() {
        return doblajes;
    }

    /**
     * @param doblajes the doblajes to set
     */
    public void setDoblajes(int doblajes) {
        this.doblajes = doblajes;
    }

    /**
     * @return the plotwist
     */
    public int getPlotwist() {
        return plotwist;
    }

    /**
     * @param plotwist the plotwist to set
     */
    public void setPlotwist(int plotwist) {
        this.plotwist = plotwist;
    }
    
}
