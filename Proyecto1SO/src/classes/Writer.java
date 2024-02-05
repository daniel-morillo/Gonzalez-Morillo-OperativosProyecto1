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
 *
 * @author user
 */
public class Writer {
    
    private int segundosEnSimulacion;
    
    private int diasAntesDelDeadline1;
    private int numGuionistas1;
    private int numAnimadores1;
    private int numDobladores1;
    private int numEscenografos1;
    private int numPlotwist1;
    private int numEnsambladores1;
    
    private int diasAntesDelDeadline2;
    private int numGuionistas2;
    private int numAnimadores2;
    private int numDobladores2;
    private int numEscenografos2;
    private int numPlotwist2;
    private int numEnsambladores2;

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
            pw.print("Ensambladores11:" + numEnsambladores1 + "\n");
            
            pw.print("Días antes del Deadline2:" + diasAntesDelDeadline2 + "\n");
            pw.print("Guionistas2:" + numGuionistas2 + "\n");
            pw.print("Animadores2:" + numAnimadores2 + "\n");
            pw.print("Dobladores2:" + numDobladores2 + "\n");
            pw.print("Escenografos2:" + numEscenografos2 + "\n");
            pw.print("Plotwist2:" + numPlotwist2 + "\n");
            pw.print("Ensambladores12:" + numEnsambladores2 + "\n");
            
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    

    public int getSegundosEnSimulacion() {
        return segundosEnSimulacion;
    }

    public void setSegundosEnSimulacion(int segundosEnSimulacion) {
        this.segundosEnSimulacion = segundosEnSimulacion;
    }

    public int getDiasAntesDelDeadline1() {
        return diasAntesDelDeadline1;
    }

    public void setDiasAntesDelDeadline1(int diasAntesDelDeadline1) {
        this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
    }

    public int getNumGuionistas1() {
        return numGuionistas1;
    }

    public void setNumGuionistas1(int numGuionistas1) {
        this.numGuionistas1 = numGuionistas1;
    }

    public int getNumAnimadores1() {
        return numAnimadores1;
    }

    public void setNumAnimadores1(int numAnimadores1) {
        this.numAnimadores1 = numAnimadores1;
    }

    public int getNumDobladores1() {
        return numDobladores1;
    }

    public void setNumDobladores1(int numDobladores1) {
        this.numDobladores1 = numDobladores1;
    }

    public int getNumEscenografos1() {
        return numEscenografos1;
    }

    public void setNumEscenografos1(int numEscenografos1) {
        this.numEscenografos1 = numEscenografos1;
    }

    public int getNumPlotwist1() {
        return numPlotwist1;
    }

    public void setNumPlotwist1(int numPlotwist1) {
        this.numPlotwist1 = numPlotwist1;
    }

    public int getNumEnsambladores1() {
        return numEnsambladores1;
    }

    public void setNumEnsambladores1(int numEnsambladores1) {
        this.numEnsambladores1 = numEnsambladores1;
    }

    public int getDiasAntesDelDeadline2() {
        return diasAntesDelDeadline2;
    }

    public void setDiasAntesDelDeadline2(int diasAntesDelDeadline2) {
        this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
    }

    public int getNumGuionistas2() {
        return numGuionistas2;
    }

    public void setNumGuionistas2(int numGuionistas2) {
        this.numGuionistas2 = numGuionistas2;
    }

    public int getNumAnimadores2() {
        return numAnimadores2;
    }

    public void setNumAnimadores2(int numAnimadores2) {
        this.numAnimadores2 = numAnimadores2;
    }

    public int getNumDobladores2() {
        return numDobladores2;
    }

    public void setNumDobladores2(int numDobladores2) {
        this.numDobladores2 = numDobladores2;
    }

    public int getNumEscenografos2() {
        return numEscenografos2;
    }

    public void setNumEscenografos2(int numEscenografos2) {
        this.numEscenografos2 = numEscenografos2;
    }

    public int getNumPlotwist2() {
        return numPlotwist2;
    }

    public void setNumPlotwist2(int numPlotwist2) {
        this.numPlotwist2 = numPlotwist2;
    }

    public int getNumEnsambladores2() {
        return numEnsambladores2;
    }

    public void setNumEnsambladores2(int numEnsambladores2) {
        this.numEnsambladores2 = numEnsambladores2;
    }
}
