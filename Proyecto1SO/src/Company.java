
import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Morillo
 */
public class Company {
    
    private int numeroGuionistas;
    private int numeroAnimadores;
    private int numeroDobladores;
    private int numeroEscenarios;
    private int numeroPlotwisters;
    
    private float Gastos;
    private float Ingresos;
    private float Beneficios;
    
    private int guionistasSalary;
    private int animadoresSalary;
    private int dobladoresSalary;
    private int escenariosSalary;
    private int plotwistersSalary;
    
    private int dayDuration;
    //Contenido que hace un trabajador para entregar el dia de la entrega
    private int guionistasContent;
    private int animadoresContent;
    private int dobladoresContent;
    private int escneariosContent;
    private int PlotwistContent;
    //Dias para la entrega de contenido de un trabajador
    private int guionistasToWork;
    private int animadoresToWork;
    private int dobladoresToWork;
    private int escneariosToWork;
    private int PlotwistToWork;
    private Semaphore mutex;
    private Drive drive;

    public Company(int numeroGuionistas, int numeroAnimadores, int numeroDobladores, int numeroEscenarios, int numeroPlotwisters, int guionistasSalary, int animadoresSalary, int dobladoresSalary, int escenariosSalary, int plotwistersSalary, int dayDuration, int guionistasContent, int animadoresContent, int dobladoresContent, int escneariosContent, int PlotwistContent, int guionistasToWork, int animadoresToWork, int dobladoresToWork, int escneariosToWork, int PlotwistToWork) {
        this.mutex = new Semaphore(1);
        this.drive = new Drive(25,55 ,20, 35, 10);
        this.numeroGuionistas = numeroGuionistas;
        this.numeroAnimadores = numeroAnimadores;
        this.numeroDobladores = numeroDobladores;
        this.numeroEscenarios = numeroEscenarios;
        this.numeroPlotwisters = numeroPlotwisters;
        this.guionistasSalary = guionistasSalary;
        this.animadoresSalary = animadoresSalary;
        this.dobladoresSalary = dobladoresSalary;
        this.escenariosSalary = escenariosSalary;
        this.plotwistersSalary = plotwistersSalary;
        this.dayDuration = dayDuration;
        this.guionistasContent = guionistasContent;
        this.animadoresContent = animadoresContent;
        this.dobladoresContent = dobladoresContent;
        this.escneariosContent = escneariosContent;
        this.PlotwistContent = PlotwistContent;
        this.guionistasToWork = guionistasToWork;
        this.animadoresToWork = animadoresToWork;
        this.dobladoresToWork = dobladoresToWork;
        this.escneariosToWork = escneariosToWork;
        this.PlotwistToWork = PlotwistToWork;
        this.Beneficios = 0;
        this.Ingresos = 0;
        this.Gastos = 0;
    }
    
    
    
    public void StartWorking() {
        
        Developer Guionistas = new Developer(getNumeroGuionistas(),0,getGuionistasSalary(),getDayDuration(), getMutex(),getGuionistasContent(),getGuionistasToWork(),getDrive());
        Developer Animadores = new Developer(getNumeroAnimadores(),1,getAnimadoresSalary(),getDayDuration(), getMutex(),getAnimadoresContent(),getAnimadoresToWork(),getDrive());
        Developer Escenografos = new Developer(getNumeroEscenarios(),2,getEscenariosSalary(),getDayDuration(), getMutex(),getEscneariosContent(),getEscneariosToWork(),getDrive());
        Developer Dobladores = new Developer(getNumeroDobladores(),3,getDobladoresSalary(),getDayDuration(), getMutex(),getDobladoresContent(),getDobladoresToWork(),getDrive());
        Developer Plotwisters = new Developer(getNumeroPlotwisters(),4,getPlotwistersSalary(),getDayDuration(),getMutex(),getPlotwistContent(),getPlotwistToWork(),getDrive());
        
        Guionistas.start();
        Animadores.start();
        Escenografos.start();
        Dobladores.start();
        Plotwisters.start();
    }
    


    /**
     * @return the numeroGuionistas
     */
    public int getNumeroGuionistas() {
        return numeroGuionistas;
    }

    /**
     * @param numeroGuionistas the numeroGuionistas to set
     */
    public void setNumeroGuionistas(int numeroGuionistas) {
        this.numeroGuionistas = numeroGuionistas;
    }

    /**
     * @return the numeroAnimadores
     */
    public int getNumeroAnimadores() {
        return numeroAnimadores;
    }

    /**
     * @param numeroAnimadores the numeroAnimadores to set
     */
    public void setNumeroAnimadores(int numeroAnimadores) {
        this.numeroAnimadores = numeroAnimadores;
    }

    /**
     * @return the numeroDobladores
     */
    public int getNumeroDobladores() {
        return numeroDobladores;
    }

    /**
     * @param numeroDobladores the numeroDobladores to set
     */
    public void setNumeroDobladores(int numeroDobladores) {
        this.numeroDobladores = numeroDobladores;
    }

    /**
     * @return the numeroEscenarios
     */
    public int getNumeroEscenarios() {
        return numeroEscenarios;
    }

    /**
     * @param numeroEscenarios the numeroEscenarios to set
     */
    public void setNumeroEscenarios(int numeroEscenarios) {
        this.numeroEscenarios = numeroEscenarios;
    }

    /**
     * @return the numeroPlotwisters
     */
    public int getNumeroPlotwisters() {
        return numeroPlotwisters;
    }

    /**
     * @param numeroPlotwisters the numeroPlotwisters to set
     */
    public void setNumeroPlotwisters(int numeroPlotwisters) {
        this.numeroPlotwisters = numeroPlotwisters;
    }

    /**
     * @return the Gastos
     */
    public float getGastos() {
        return Gastos;
    }

    /**
     * @param Gastos the Gastos to set
     */
    public void setGastos(float Gastos) {
        this.Gastos = Gastos;
    }

    /**
     * @return the Ingresos
     */
    public float getIngresos() {
        return Ingresos;
    }

    /**
     * @param Ingresos the Ingresos to set
     */
    public void setIngresos(float Ingresos) {
        this.Ingresos = Ingresos;
    }

    /**
     * @return the Beneficios
     */
    public float getBeneficios() {
        return Beneficios;
    }

    /**
     * @param Beneficios the Beneficios to set
     */
    public void setBeneficios(float Beneficios) {
        this.Beneficios = Beneficios;
    }

    /**
     * @return the guionistasSalary
     */
    public int getGuionistasSalary() {
        return guionistasSalary;
    }

    /**
     * @param guionistasSalary the guionistasSalary to set
     */
    public void setGuionistasSalary(int guionistasSalary) {
        this.guionistasSalary = guionistasSalary;
    }

    /**
     * @return the animadoresSalary
     */
    public int getAnimadoresSalary() {
        return animadoresSalary;
    }

    /**
     * @param animadoresSalary the animadoresSalary to set
     */
    public void setAnimadoresSalary(int animadoresSalary) {
        this.animadoresSalary = animadoresSalary;
    }

    /**
     * @return the dobladoresSalary
     */
    public int getDobladoresSalary() {
        return dobladoresSalary;
    }

    /**
     * @param dobladoresSalary the dobladoresSalary to set
     */
    public void setDobladoresSalary(int dobladoresSalary) {
        this.dobladoresSalary = dobladoresSalary;
    }

    /**
     * @return the escenariosSalary
     */
    public int getEscenariosSalary() {
        return escenariosSalary;
    }

    /**
     * @param escenariosSalary the escenariosSalary to set
     */
    public void setEscenariosSalary(int escenariosSalary) {
        this.escenariosSalary = escenariosSalary;
    }

    /**
     * @return the plotwistersSalary
     */
    public int getPlotwistersSalary() {
        return plotwistersSalary;
    }

    /**
     * @param plotwistersSalary the plotwistersSalary to set
     */
    public void setPlotwistersSalary(int plotwistersSalary) {
        this.plotwistersSalary = plotwistersSalary;
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
     * @return the guionistasContent
     */
    public int getGuionistasContent() {
        return guionistasContent;
    }

    /**
     * @param guionistasContent the guionistasContent to set
     */
    public void setGuionistasContent(int guionistasContent) {
        this.guionistasContent = guionistasContent;
    }

    /**
     * @return the animadoresContent
     */
    public int getAnimadoresContent() {
        return animadoresContent;
    }

    /**
     * @param animadoresContent the animadoresContent to set
     */
    public void setAnimadoresContent(int animadoresContent) {
        this.animadoresContent = animadoresContent;
    }

    /**
     * @return the dobladoresContent
     */
    public int getDobladoresContent() {
        return dobladoresContent;
    }

    /**
     * @param dobladoresContent the dobladoresContent to set
     */
    public void setDobladoresContent(int dobladoresContent) {
        this.dobladoresContent = dobladoresContent;
    }

    /**
     * @return the escneariosContent
     */
    public int getEscneariosContent() {
        return escneariosContent;
    }

    /**
     * @param escneariosContent the escneariosContent to set
     */
    public void setEscneariosContent(int escneariosContent) {
        this.escneariosContent = escneariosContent;
    }

    /**
     * @return the PlotwistContent
     */
    public int getPlotwistContent() {
        return PlotwistContent;
    }

    /**
     * @param PlotwistContent the PlotwistContent to set
     */
    public void setPlotwistContent(int PlotwistContent) {
        this.PlotwistContent = PlotwistContent;
    }

    /**
     * @return the guionistasToWork
     */
    public int getGuionistasToWork() {
        return guionistasToWork;
    }

    /**
     * @param guionistasToWork the guionistasToWork to set
     */
    public void setGuionistasToWork(int guionistasToWork) {
        this.guionistasToWork = guionistasToWork;
    }

    /**
     * @return the animadoresToWork
     */
    public int getAnimadoresToWork() {
        return animadoresToWork;
    }

    /**
     * @param animadoresToWork the animadoresToWork to set
     */
    public void setAnimadoresToWork(int animadoresToWork) {
        this.animadoresToWork = animadoresToWork;
    }

    /**
     * @return the dobladoresToWork
     */
    public int getDobladoresToWork() {
        return dobladoresToWork;
    }

    /**
     * @param dobladoresToWork the dobladoresToWork to set
     */
    public void setDobladoresToWork(int dobladoresToWork) {
        this.dobladoresToWork = dobladoresToWork;
    }

    /**
     * @return the escneariosToWork
     */
    public int getEscneariosToWork() {
        return escneariosToWork;
    }

    /**
     * @param escneariosToWork the escneariosToWork to set
     */
    public void setEscneariosToWork(int escneariosToWork) {
        this.escneariosToWork = escneariosToWork;
    }

    /**
     * @return the PlotwistToWork
     */
    public int getPlotwistToWork() {
        return PlotwistToWork;
    }

    /**
     * @param PlotwistToWork the PlotwistToWork to set
     */
    public void setPlotwistToWork(int PlotwistToWork) {
        this.PlotwistToWork = PlotwistToWork;
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
    
    
    
}
