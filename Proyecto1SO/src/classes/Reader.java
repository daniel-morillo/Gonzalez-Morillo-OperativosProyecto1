package classes;


import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase para leer el txt y actualizar los valores de las empresas (cantidad de empleados, dias de entrega y tiempo de duracion)
 * @author Daniel Morillo
 */
public class Reader {
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


    /**
     * Se lee el txt y se actualizan las empresas con los valores leidos
     * @param Company1 
     * @param Company2
     */
    public void ReadTxt(Company Company1, Company Company2) {
        String Path = "archivo.txt";
        try {
            FileReader lector = new FileReader(Path);
            BufferedReader bufferedReader = new BufferedReader(lector);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Dividir cada línea en clave y valor
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    // Asignar valores a las variables correspondientes
                    switch (key) {
                        case "Segundos en la simulación":
                            setSegundosEnSimulacion(Integer.parseInt(value));
                            break;
                        case "Días antes del Deadline1":
                            setDiasAntesDelDeadline1(Integer.parseInt(value));
                            break;
                        case "Guionistas1":
                            setNumGuionistas1(Integer.parseInt(value));
                            break;
                        case "Animadores1":
                            setNumAnimadores1(Integer.parseInt(value));
                            break;
                        case "Dobladores1":
                            setNumDobladores1(Integer.parseInt(value));
                            break;
                        case "Escenografos1":
                            setNumEscenografos1(Integer.parseInt(value));
                            break;
                        case "Plotwist1":
                            setNumPlotwist1(Integer.parseInt(value));
                            break;
                        case "Ensambladores1":
                            setNumEnsambladores1(Integer.parseInt(value));
                            break;
                        case "Días antes del Deadline2":
                            setDiasAntesDelDeadline2(Integer.parseInt(value));
                            break;
                        case "Guionistas2":
                            setNumGuionistas2(Integer.parseInt(value));
                            break;
                        case "Animadores2":
                            setNumAnimadores2(Integer.parseInt(value));
                            break;
                        case "Dobladores2":
                            setNumDobladores2(Integer.parseInt(value));
                            break;
                        case "Escenografos2":
                            setNumEscenografos2(Integer.parseInt(value));
                            break;
                        case "Plotwist2":
                            setNumPlotwist2(Integer.parseInt(value));
                            break;
                        case "Ensambladores2":
                            setNumEnsambladores2(Integer.parseInt(value));
                            break;
                    }
                }
            }

            bufferedReader.close();
            Company1.setDayDuration(getSegundosEnSimulacion());
            Company1.getGuionistas().setDayDuration(getSegundosEnSimulacion());
            Company1.getDobladores().setDayDuration(getSegundosEnSimulacion());
            Company1.getAnimadores().setDayDuration(getSegundosEnSimulacion());
            Company1.getEscenografos().setDayDuration(getSegundosEnSimulacion());
            Company1.getPlotwisters().setDayDuration(getSegundosEnSimulacion());
            Company1.getAssembler().setDayDuration(getSegundosEnSimulacion());
            Company1.getPM().setDayDuration(getSegundosEnSimulacion());
            Company1.getDirector().setDayDuration(getSegundosEnSimulacion());
            Company1.getGuionistas().setDevelopersquantity(getNumGuionistas1());
            Company1.getAnimadores().setDevelopersquantity(getNumAnimadores1());
            Company1.getEscenografos().setDevelopersquantity(getNumEscenografos1());
            Company1.getDobladores().setDevelopersquantity(getNumDobladores1());
            Company1.getPlotwisters().setDevelopersquantity(getNumPlotwist1());
            Company1.getAssembler().setAssemblerquantity(getNumEnsambladores1());
            Company1.setCommitDay(getDiasAntesDelDeadline1());
            Company1.getPM().setCommitDay(getDiasAntesDelDeadline1());
            
            
            Company2.setDayDuration(getSegundosEnSimulacion());
            Company2.getGuionistas().setDayDuration(getSegundosEnSimulacion());
            Company2.getDobladores().setDayDuration(getSegundosEnSimulacion());
            Company2.getAnimadores().setDayDuration(getSegundosEnSimulacion());
            Company2.getEscenografos().setDayDuration(getSegundosEnSimulacion());
            Company2.getPlotwisters().setDayDuration(getSegundosEnSimulacion());
            Company2.getAssembler().setDayDuration(getSegundosEnSimulacion());
            Company2.getPM().setDayDuration(getSegundosEnSimulacion());
            Company2.getDirector().setDayDuration(getSegundosEnSimulacion());
            Company2.getGuionistas().setDevelopersquantity(getNumGuionistas2());
            Company2.getAnimadores().setDevelopersquantity(getNumAnimadores2());
            Company2.getEscenografos().setDevelopersquantity(getNumEscenografos2());
            Company2.getDobladores().setDevelopersquantity(getNumDobladores2());
            Company2.getPlotwisters().setDevelopersquantity(getNumPlotwist2());
            Company2.getAssembler().setAssemblerquantity(getNumEnsambladores2());
            Company2.setCommitDay(getDiasAntesDelDeadline2());
            Company2.getPM().setCommitDay(getDiasAntesDelDeadline2());
            //Aún Faltan ensambladores y Dias para entregar capitulo
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    /**
     * @return the segundosEnSimulacion
     */
    public int getSegundosEnSimulacion() {
        return segundosEnSimulacion;
    }

    /**
     * @param segundosEnSimulacion the segundosEnSimulacion to set
     */
    public void setSegundosEnSimulacion(int segundosEnSimulacion) {
        this.segundosEnSimulacion = segundosEnSimulacion;
    }

    /**
     * @return the diasAntesDelDeadline1
     */
    public int getDiasAntesDelDeadline1() {
        return diasAntesDelDeadline1;
    }

    /**
     * @param diasAntesDelDeadline1 the diasAntesDelDeadline1 to set
     */
    public void setDiasAntesDelDeadline1(int diasAntesDelDeadline1) {
        this.diasAntesDelDeadline1 = diasAntesDelDeadline1;
    }

    /**
     * @return the numGuionistas1
     */
    public int getNumGuionistas1() {
        return numGuionistas1;
    }

    /**
     * @param numGuionistas1 the numGuionistas1 to set
     */
    public void setNumGuionistas1(int numGuionistas1) {
        this.numGuionistas1 = numGuionistas1;
    }

    /**
     * @return the numAnimadores1
     */
    public int getNumAnimadores1() {
        return numAnimadores1;
    }

    /**
     * @param numAnimadores1 the numAnimadores1 to set
     */
    public void setNumAnimadores1(int numAnimadores1) {
        this.numAnimadores1 = numAnimadores1;
    }

    /**
     * @return the numDobladores1
     */
    public int getNumDobladores1() {
        return numDobladores1;
    }

    /**
     * @param numDobladores1 the numDobladores1 to set
     */
    public void setNumDobladores1(int numDobladores1) {
        this.numDobladores1 = numDobladores1;
    }

    /**
     * @return the numEscenografos1
     */
    public int getNumEscenografos1() {
        return numEscenografos1;
    }

    /**
     * @param numEscenografos1 the numEscenografos1 to set
     */
    public void setNumEscenografos1(int numEscenografos1) {
        this.numEscenografos1 = numEscenografos1;
    }

    /**
     * @return the numPlotwist1
     */
    public int getNumPlotwist1() {
        return numPlotwist1;
    }

    /**
     * @param numPlotwist1 the numPlotwist1 to set
     */
    public void setNumPlotwist1(int numPlotwist1) {
        this.numPlotwist1 = numPlotwist1;
    }

    /**
     * @return the numEnsambladores1
     */
    public int getNumEnsambladores1() {
        return numEnsambladores1;
    }

    /**
     * @param numEnsambladores1 the numEnsambladores1 to set
     */
    public void setNumEnsambladores1(int numEnsambladores1) {
        this.numEnsambladores1 = numEnsambladores1;
    }

    /**
     * @return the diasAntesDelDeadline2
     */
    public int getDiasAntesDelDeadline2() {
        return diasAntesDelDeadline2;
    }

    /**
     * @param diasAntesDelDeadline2 the diasAntesDelDeadline2 to set
     */
    public void setDiasAntesDelDeadline2(int diasAntesDelDeadline2) {
        this.diasAntesDelDeadline2 = diasAntesDelDeadline2;
    }

    /**
     * @return the numGuionistas2
     */
    public int getNumGuionistas2() {
        return numGuionistas2;
    }

    /**
     * @param numGuionistas2 the numGuionistas2 to set
     */
    public void setNumGuionistas2(int numGuionistas2) {
        this.numGuionistas2 = numGuionistas2;
    }

    /**
     * @return the numAnimadores2
     */
    public int getNumAnimadores2() {
        return numAnimadores2;
    }

    /**
     * @param numAnimadores2 the numAnimadores2 to set
     */
    public void setNumAnimadores2(int numAnimadores2) {
        this.numAnimadores2 = numAnimadores2;
    }

    /**
     * @return the numDobladores2
     */
    public int getNumDobladores2() {
        return numDobladores2;
    }

    /**
     * @param numDobladores2 the numDobladores2 to set
     */
    public void setNumDobladores2(int numDobladores2) {
        this.numDobladores2 = numDobladores2;
    }

    /**
     * @return the numEscenografos2
     */
    public int getNumEscenografos2() {
        return numEscenografos2;
    }

    /**
     * @param numEscenografos2 the numEscenografos2 to set
     */
    public void setNumEscenografos2(int numEscenografos2) {
        this.numEscenografos2 = numEscenografos2;
    }

    /**
     * @return the numPlotwist2
     */
    public int getNumPlotwist2() {
        return numPlotwist2;
    }

    /**
     * @param numPlotwist2 the numPlotwist2 to set
     */
    public void setNumPlotwist2(int numPlotwist2) {
        this.numPlotwist2 = numPlotwist2;
    }

    /**
     * @return the numEnsambladores2
     */
    public int getNumEnsambladores2() {
        return numEnsambladores2;
    }

    /**
     * @param numEnsambladores2 the numEnsambladores2 to set
     */
    public void setNumEnsambladores2(int numEnsambladores2) {
        this.numEnsambladores2 = numEnsambladores2;
    }
}
