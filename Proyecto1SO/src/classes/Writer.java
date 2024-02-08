/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase para guardar los valores ingresados en un txt
 * @author Gabriel Gonzalez
 */
public class Writer {
    
    private int segundosEnSimulacion; //Tiempo de la simulacion a guardar
    
    // Valores para la primera empresa
    private int diasAntesDelDeadline1;
    private int numGuionistas1;
    private int numAnimadores1;
    private int numDobladores1;
    private int numEscenografos1;
    private int numPlotwist1;
    private int numEnsambladores1;

    //Valores para la segunda empresa
    private int diasAntesDelDeadline2;
    private int numGuionistas2;
    private int numAnimadores2;
    private int numDobladores2;
    private int numEscenografos2;
    private int numPlotwist2;
    private int numEnsambladores2;


    /**
     * Constructor
     * @param segundosEnSimulacion
     * @param diasAntesDelDeadline1
     * @param numGuionistas1
     * @param numAnimadores1
     * @param numDobladores1
     * @param numEscenografos1
     * @param numPlotwist1
     * @param numEnsambladores1
     * @param diasAntesDelDeadline2
     * @param numGuionistas2
     * @param numAnimadores2
     * @param numDobladores2
     * @param numEscenografos2
     * @param numPlotwist2
     * @param numEnsambladores2
     */
    public Writer(int segundosEnSimulacion, int diasAntesDelDeadline1, int numGuionistas1, int numAnimadores1, int numDobladores1, int numEscenografos1, int numPlotwist1, int numEnsambladores1, int diasAntesDelDeadline2, int numGuionistas2, int numAnimadores2, int numDobladores2, int numEscenografos2, int numPlotwist2, int numEnsambladores2) {
        this.segundosEnSimulacion = segundosEnSimulacion;
        this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
        this.numGuionistas1 = numGuionistas1;
        this.numAnimadores1 = numAnimadores1;
        this.numDobladores1 = numDobladores1;
        this.numEscenografos1 = numEscenografos1;
        this.numPlotwist1 = numPlotwist1;
        this.numEnsambladores1 = numEnsambladores1;
        this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
        this.numGuionistas2 = numGuionistas2;
        this.numAnimadores2 = numAnimadores2;
        this.numDobladores2 = numDobladores2;
        this.numEscenografos2 = numEscenografos2;
        this.numPlotwist2 = numPlotwist2;
        this.numEnsambladores2 = numEnsambladores2;
    }


    /**
     * Se guarda los valores extraidos en el txt
     */
    public void guardar(){
        try {
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("Segundos en la simulación:" + segundosEnSimulacion + "\n");
            
            pw.print("Días antes del Deadline1:" + diasAntesDelDeadline1 + "\n");
            pw.print("Guionistas1:" + numGuionistas1 + "\n");
            pw.print("Animadores1:" + numAnimadores1 + "\n");
            pw.print("Dobladores1:" + numDobladores1 + "\n");
            pw.print("Escenografos1:" + numEscenografos1 + "\n");
            pw.print("Plotwist1:" + numPlotwist1 + "\n");
            pw.print("Ensambladores1:" + numEnsambladores1 + "\n");
            
            pw.print("Días antes del Deadline2:" + diasAntesDelDeadline2 + "\n");
            pw.print("Guionistas2:" + numGuionistas2 + "\n");
            pw.print("Animadores2:" + numAnimadores2 + "\n");
            pw.print("Dobladores2:" + numDobladores2 + "\n");
            pw.print("Escenografos2:" + numEscenografos2 + "\n");
            pw.print("Plotwist2:" + numPlotwist2 + "\n");
            pw.print("Ensambladores2:" + numEnsambladores2 + "\n");
            
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    /**
     *
     * @return
     */
    public int getSegundosEnSimulacion() {
        return segundosEnSimulacion;
    }

    /**
     *
     * @param segundosEnSimulacion
     */
    public void setSegundosEnSimulacion(int segundosEnSimulacion) {
        this.segundosEnSimulacion = segundosEnSimulacion;
    }

    /**
     *
     * @return
     */
    public int getDiasAntesDelDeadline1() {
        return diasAntesDelDeadline1;
    }

    /**
     *
     * @param diasAntesDelDeadline1
     */
    public void setDiasAntesDelDeadline1(int diasAntesDelDeadline1) {
        this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
    }

    /**
     *
     * @return
     */
    public int getNumGuionistas1() {
        return numGuionistas1;
    }

    /**
     *
     * @param numGuionistas1
     */
    public void setNumGuionistas1(int numGuionistas1) {
        this.numGuionistas1 = numGuionistas1;
    }

    /**
     *
     * @return
     */
    public int getNumAnimadores1() {
        return numAnimadores1;
    }

    /**
     *
     * @param numAnimadores1
     */
    public void setNumAnimadores1(int numAnimadores1) {
        this.numAnimadores1 = numAnimadores1;
    }

    /**
     *
     * @return
     */
    public int getNumDobladores1() {
        return numDobladores1;
    }

    /**
     *
     * @param numDobladores1
     */
    public void setNumDobladores1(int numDobladores1) {
        this.numDobladores1 = numDobladores1;
    }

    /**
     *
     * @return
     */
    public int getNumEscenografos1() {
        return numEscenografos1;
    }

    /**
     *
     * @param numEscenografos1
     */
    public void setNumEscenografos1(int numEscenografos1) {
        this.numEscenografos1 = numEscenografos1;
    }

    /**
     *
     * @return
     */
    public int getNumPlotwist1() {
        return numPlotwist1;
    }

    /**
     *
     * @param numPlotwist1
     */
    public void setNumPlotwist1(int numPlotwist1) {
        this.numPlotwist1 = numPlotwist1;
    }

    /**
     *
     * @return
     */
    public int getNumEnsambladores1() {
        return numEnsambladores1;
    }

    /**
     *
     * @param numEnsambladores1
     */
    public void setNumEnsambladores1(int numEnsambladores1) {
        this.numEnsambladores1 = numEnsambladores1;
    }

    /**
     *
     * @return
     */
    public int getDiasAntesDelDeadline2() {
        return diasAntesDelDeadline2;
    }

    /**
     *
     * @param diasAntesDelDeadline2
     */
    public void setDiasAntesDelDeadline2(int diasAntesDelDeadline2) {
        this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
    }

    /**
     *
     * @return
     */
    public int getNumGuionistas2() {
        return numGuionistas2;
    }

    /**
     *
     * @param numGuionistas2
     */
    public void setNumGuionistas2(int numGuionistas2) {
        this.numGuionistas2 = numGuionistas2;
    }

    /**
     *
     * @return
     */
    public int getNumAnimadores2() {
        return numAnimadores2;
    }

    /**
     *
     * @param numAnimadores2
     */
    public void setNumAnimadores2(int numAnimadores2) {
        this.numAnimadores2 = numAnimadores2;
    }

    /**
     *
     * @return
     */
    public int getNumDobladores2() {
        return numDobladores2;
    }

    /**
     *
     * @param numDobladores2
     */
    public void setNumDobladores2(int numDobladores2) {
        this.numDobladores2 = numDobladores2;
    }

    /**
     *
     * @return
     */
    public int getNumEscenografos2() {
        return numEscenografos2;
    }

    /**
     *
     * @param numEscenografos2
     */
    public void setNumEscenografos2(int numEscenografos2) {
        this.numEscenografos2 = numEscenografos2;
    }

    /**
     *
     * @return
     */
    public int getNumPlotwist2() {
        return numPlotwist2;
    }

    /**
     *
     * @param numPlotwist2
     */
    public void setNumPlotwist2(int numPlotwist2) {
        this.numPlotwist2 = numPlotwist2;
    }

    /**
     *
     * @return
     */
    public int getNumEnsambladores2() {
        return numEnsambladores2;
    }

    /**
     *
     * @param numEnsambladores2
     */
    public void setNumEnsambladores2(int numEnsambladores2) {
        this.numEnsambladores2 = numEnsambladores2;
    }
}
