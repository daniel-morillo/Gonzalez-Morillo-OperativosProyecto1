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
    
    private int maxguiones;
    private int maxanimaciones;
    private int maxescenarios;
    private int maxdoblajes;
    private int maxplotwist;
    
    public int finishedChapter;
    public int finishedPlotChapter;
            

public Drive(int maxguiones, int maxanimaciones, int maxescenarios, int maxdoblajes, int maxplotwist){
    this.animaciones = 0;
    this.guiones = 0;
    this.escenarios = 0;
    this.plotwist = 0;
    this.doblajes = 0;
    this.maxanimaciones = maxanimaciones;
    this.maxdoblajes = maxdoblajes;
    this.maxescenarios = maxescenarios;
    this.maxguiones = maxguiones;
    this.maxplotwist = maxplotwist;
    this.finishedChapter = 0;
    this.finishedPlotChapter = 0;
         
}    
//Función para añadir una parte al drive 
public void addPart (int employeType, int contentToSend){
    switch (employeType) {
        
        case 0 -> { if (getGuiones()+contentToSend > getMaxguiones()) {
            setGuiones(getMaxguiones());
        } else {
            setGuiones(getGuiones()+contentToSend);}}
        
        case 1 -> { if (getAnimaciones()+contentToSend > getMaxanimaciones()) {
            setAnimaciones(getMaxanimaciones());
        } else {
            setAnimaciones(getAnimaciones()+contentToSend);}}
        
        case 2 -> { if (getEscenarios()+contentToSend > getMaxescenarios()) {
            setEscenarios(getEscenarios());
        } else {
            setEscenarios(getEscenarios()+contentToSend);}}
        
        case 3 -> { if (getDoblajes()+contentToSend > getMaxdoblajes()) {
            setDoblajes(getMaxdoblajes());
        } else {
            setDoblajes(getDoblajes()+contentToSend);}}
        
        case 4 -> { if (getPlotwist()+contentToSend > getMaxplotwist()) {
            setPlotwist(getMaxplotwist());
        } else {
            setPlotwist(getPlotwist()+contentToSend);}}
        
        default -> System.out.println("No hay empleado con ese codigo");
         
    }
}

public void addChapter (int newChapter, boolean isPlot){
    if(isPlot){
        this.setFinishedPlotChapter(finishedPlotChapter + newChapter);
    }else{
        this.setFinishedChapter(finishedChapter + newChapter);
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

    /**
     * @return the maxguiones
     */
    public int getMaxguiones() {
        return maxguiones;
    }

    /**
     * @param maxguiones the maxguiones to set
     */
    public void setMaxguiones(int maxguiones) {
        this.maxguiones = maxguiones;
    }

    /**
     * @return the maxanimaciones
     */
    public int getMaxanimaciones() {
        return maxanimaciones;
    }

    /**
     * @param maxanimaciones the maxanimaciones to set
     */
    public void setMaxanimaciones(int maxanimaciones) {
        this.maxanimaciones = maxanimaciones;
    }

    /**
     * @return the maxescenarios
     */
    public int getMaxescenarios() {
        return maxescenarios;
    }

    /**
     * @param maxescenarios the maxescenarios to set
     */
    public void setMaxescenarios(int maxescenarios) {
        this.maxescenarios = maxescenarios;
    }

    /**
     * @return the maxdoblajes
     */
    public int getMaxdoblajes() {
        return maxdoblajes;
    }

    /**
     * @param maxdoblajes the maxdoblajes to set
     */
    public void setMaxdoblajes(int maxdoblajes) {
        this.maxdoblajes = maxdoblajes;
    }

    /**
     * @return the maxplotwist
     */
    public int getMaxplotwist() {
        return maxplotwist;
    }

    /**
     * @param maxplotwist the maxplotwist to set
     */
    public void setMaxplotwist(int maxplotwist) {
        this.maxplotwist = maxplotwist;
    }

    public int getFinishedChapter() {
        return finishedChapter;
    }

    public void setFinishedChapter(int finishedChapter) {
        this.finishedChapter = finishedChapter;
    }

    public int getFinishedPlotChapter() {
        return finishedPlotChapter;
    }

    public void setFinishedPlotChapter(int finishedPlotChapter) {
        this.finishedPlotChapter = finishedPlotChapter;
    }
    
    
    
}
