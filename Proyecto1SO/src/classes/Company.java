package classes;

import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel Morillo
 */
public final class Company {
    
    //Numero inicial de trabajadores
    private int numeroGuionistas;
    private int numeroAnimadores;
    private int numeroDobladores;
    private int numeroEscenarios;
    private int numeroPlotwisters;
    private int numeroAssemblers;
    
    //Varibales Contables
    private float Gastos;
    private float Ingresos;
    private float Beneficios;
    
    private float chapterProfit;
    private float plotProfit;
    
    private int guionistasSalary;
    private int animadoresSalary;
    private int dobladoresSalary;
    private int escenariosSalary;
    private int plotwistersSalary;
    private int assemblersSalary;
    
    //Duraci'on del dia en la simulacion
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
    private int assemblerToWork;
    //Cantidad necesaria de cada parte para ensamblar un capitulo
    private int guionesEnsamblar;
    private int escenariosEnsamblar;
    private int doblajesEnsamblar;
    private int animacionesEnsamblar;
    private int plotwistEnsamblar;
    //Cantidad de caps antes de uno con plotwist
    private int capsToPlotwist;
    private Semaphore mutex;
    private int fixCommitDay;
    private int commitDay;
    private Drive drive;
    
    private int PMsalary;
    private int directorSalary;
    
    private final Developer Guionistas;
    private final Developer Animadores;
    private final Developer Escenografos;
    private final Developer Dobladores;
    private final Developer Plotwisters;
    private final Assembler Assembler;
    private final PM PM;
    private final Director director;
    private int trabajadoresTotalesMax;
    private int trabajadoresTotales;
    private int guardarTrabajadoresTotales;
    //Labels para cambiar los campos de la interfaz manipulables desde la compañia
    private JLabel[] labels;
           

    public Company(int numeroGuionistas, int numeroAnimadores, int numeroDobladores, int numeroEscenarios, int numeroPlotwisters, int numeroAssemblers, int guionistasSalary, int animadoresSalary, int dobladoresSalary, int escenariosSalary, int plotwistersSalary, int assemblersSalary, int dayDuration, int guionistasContent, int animadoresContent,int escenarioContent, int dobladoresContent, int PlotwistContent, int guionistasToWork, int animadoresToWork, int dobladoresToWork, int escneariosToWork, int PlotwistToWork, int assemblerToWork, int guionesEnsamblar, int escenariosEnsamblar, int doblajesEnsamblar, int plotwistEnsamblar,int animacionesEnsamblar, int capsToPlotwist,  int commitDay, int PMsalary, float chapterProfit, float plotProfit, int directorSalary, int trabajadoresTotalesMax) {
        this.PMsalary = PMsalary;
        this.numeroGuionistas = numeroGuionistas;
        this.numeroAnimadores = numeroAnimadores;
        this.numeroDobladores = numeroDobladores;
        this.numeroEscenarios = numeroEscenarios;
        this.numeroPlotwisters = numeroPlotwisters;
        this.numeroAssemblers = numeroAssemblers;
        this.guionistasSalary = guionistasSalary;
        this.animadoresSalary = animadoresSalary;
        this.dobladoresSalary = dobladoresSalary;
        this.escenariosSalary = escenariosSalary;
        this.plotwistersSalary = plotwistersSalary;
        this.assemblersSalary = assemblersSalary;
        this.directorSalary = directorSalary;
        this.dayDuration = dayDuration;
        this.guionistasContent = guionistasContent;
        this.animadoresContent = animadoresContent;
        this.escneariosContent = escenarioContent;
        this.dobladoresContent = dobladoresContent;
        this.PlotwistContent = PlotwistContent;
        this.guionistasToWork = guionistasToWork;
        this.animadoresToWork = animadoresToWork;
        this.dobladoresToWork = dobladoresToWork;
        this.escneariosToWork = escneariosToWork;
        this.PlotwistToWork = PlotwistToWork;
        this.assemblerToWork = assemblerToWork;
        this.guionesEnsamblar = guionesEnsamblar;
        this.escenariosEnsamblar = escenariosEnsamblar;
        this.doblajesEnsamblar = doblajesEnsamblar;
        this.plotwistEnsamblar = plotwistEnsamblar;
        this.animacionesEnsamblar = animacionesEnsamblar;
        this.capsToPlotwist = capsToPlotwist;
        this.mutex = new Semaphore(1);
        this.fixCommitDay = commitDay;
        this.commitDay = commitDay;
        this.drive = new Drive(25,55,20,35,10);
        this.Beneficios = 0;
        this.Gastos = 0;
        this.Ingresos = 0;
        this.trabajadoresTotalesMax = trabajadoresTotalesMax;
        this.chapterProfit = chapterProfit;
        this.plotProfit = plotProfit;
        this.Guionistas = new Developer(getNumeroGuionistas(), 0, getGuionistasSalary(), getDayDuration(), getMutex(), getGuionistasToWork(), getGuionistasContent(), this);
        this.Animadores = new Developer(getNumeroAnimadores(), 1, getAnimadoresSalary(), getDayDuration(), getMutex(), getAnimadoresToWork(), getAnimadoresContent(), this);
        this.Escenografos = new Developer(getNumeroEscenarios(), 2, getEscenariosSalary(), getDayDuration(), getMutex(), getEscneariosToWork(), getEscneariosContent(), this);
        this.Dobladores = new Developer(getNumeroDobladores(), 3, getDobladoresSalary(), getDayDuration(), getMutex(), getDobladoresToWork(), getDobladoresContent(), this);
        this.Plotwisters = new Developer(getNumeroPlotwisters(), 4, getPlotwistersSalary(), getDayDuration(), getMutex(), getPlotwistToWork(),getPlotwistContent(), this);
        this.Assembler = new Assembler(getNumeroAssemblers(), getAssemblersSalary(), getDayDuration(), getMutex(), getAssemblerToWork(), this, getGuionesEnsamblar(), getEscenariosEnsamblar(), getAnimacionesEnsamblar(), getDoblajesEnsamblar(), getPlotwistEnsamblar(), getCapsToPlotwist());
        this.PM = new PM(getDayDuration(), getPMsalary(), getCommitDay(), this);
        this.director = new Director(getDayDuration(), getDirectorSalary(), this, getPM(), getMutex(), getDrive());
        this.trabajadoresTotales = Guionistas.getDevelopersquantity() + Animadores.getDevelopersquantity() + Escenografos.getDevelopersquantity() + Dobladores.getDevelopersquantity() + Plotwisters.getDevelopersquantity() + Assembler.getAssemblerquantity();
        this.guardarTrabajadoresTotales = this.trabajadoresTotales;

    }
    
    
    //Se inicia la simulación starteando los hilos
    public void StartWorking() {
        actTotalTrabajadores();
        loadWorkersValues();
        getGuionistas().start();
        getAnimadores().start();
        getEscenografos().start();
        getDobladores().start();
        getPlotwisters().start();
        getAssembler().start();
        getPM().start();
        getDirector().start();
    }
    //Actualiza los trabajadores totales
    public void actTotalTrabajadores(){
        this.trabajadoresTotales = Guionistas.getDevelopersquantity() + Animadores.getDevelopersquantity() + Escenografos.getDevelopersquantity()+Dobladores.getDevelopersquantity()+Plotwisters.getDevelopersquantity()+Assembler.getAssemblerquantity();    
    }
    
    public void actGuardarTotalTrabajadores(){
        this.guardarTrabajadoresTotales = Guionistas.getDevelopersquantity() + Animadores.getDevelopersquantity() + Escenografos.getDevelopersquantity()+Dobladores.getDevelopersquantity()+Plotwisters.getDevelopersquantity()+Assembler.getAssemblerquantity();
    }
    //Actualiza los valores en la interfaz
    public void loadWorkersValues(){
        
        this.labels[0].setText(String.valueOf(getTrabajadoresTotales()));
        this.labels[1].setText(String.valueOf(getAnimadores().getDevelopersquantity()));
        this.labels[2].setText(String.valueOf(getGuionistas().getDevelopersquantity()));
        this.labels[3].setText(String.valueOf(getEscenografos().getDevelopersquantity()));
        this.labels[4].setText(String.valueOf(getDobladores().getDevelopersquantity()));
        this.labels[5].setText(String.valueOf(getPlotwisters().getDevelopersquantity()));
        this.labels[6].setText(String.valueOf(getAssembler().getAssemblerquantity()));
        this.labels[7].setText(String.valueOf(getPM().getCommitDay()));
        this.labels[8].setText(String.valueOf(getGuionistas().getDevelopersquantity()));
        this.labels[9].setText(String.valueOf(getAnimadores().getDevelopersquantity()));
        this.labels[10].setText(String.valueOf(getDobladores().getDevelopersquantity()));
        this.labels[11].setText(String.valueOf(getEscenografos().getDevelopersquantity()));
        this.labels[12].setText(String.valueOf(getPlotwisters().getDevelopersquantity()));
        this.labels[13].setText(String.valueOf(getAssembler().getAssemblerquantity()));
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


    public int getCommitDay() {
        return commitDay;
    }

    public void setCommitDay(int commitDay) {
        this.commitDay = commitDay;
    }

    /**
     * @return the fixCommitDay
     */
    public int getFixCommitDay() {
        return fixCommitDay;
    }

    /**
     * @param fixCommitDay the fixCommitDay to set
     */
    public void setFixCommitDay(int fixCommitDay) {
        this.fixCommitDay = fixCommitDay;
    }

    /**
     * @return the assemblersSalary
     */
    public int getAssemblersSalary() {
        return assemblersSalary;
    }

    /**
     * @param assemblersSalary the assemblersSalary to set
     */
    public void setAssemblersSalary(int assemblersSalary) {
        this.assemblersSalary = assemblersSalary;
    }

    /**
     * @return the assemblerToWork
     */
    public int getAssemblerToWork() {
        return assemblerToWork;
    }

    /**
     * @param assemblerToWork the assemblerToWork to set
     */
    public void setAssemblerToWork(int assemblerToWork) {
        this.assemblerToWork = assemblerToWork;
    }

    /**
     * @return the guionesEnsamblar
     */
    public int getGuionesEnsamblar() {
        return guionesEnsamblar;
    }

    /**
     * @param guionesEnsamblar the guionesEnsamblar to set
     */
    public void setGuionesEnsamblar(int guionesEnsamblar) {
        this.guionesEnsamblar = guionesEnsamblar;
    }

    /**
     * @return the escenariosEnsamblar
     */
    public int getEscenariosEnsamblar() {
        return escenariosEnsamblar;
    }

    /**
     * @param escenariosEnsamblar the escenariosEnsamblar to set
     */
    public void setEscenariosEnsamblar(int escenariosEnsamblar) {
        this.escenariosEnsamblar = escenariosEnsamblar;
    }

    /**
     * @return the doblajesEnsamblar
     */
    public int getDoblajesEnsamblar() {
        return doblajesEnsamblar;
    }

    /**
     * @param doblajesEnsamblar the doblajesEnsamblar to set
     */
    public void setDoblajesEnsamblar(int doblajesEnsamblar) {
        this.doblajesEnsamblar = doblajesEnsamblar;
    }

    /**
     * @return the animacionesEnsamblar
     */
    public int getAnimacionesEnsamblar() {
        return animacionesEnsamblar;
    }

    /**
     * @param animacionesEnsamblar the animacionesEnsamblar to set
     */
    public void setAnimacionesEnsamblar(int animacionesEnsamblar) {
        this.animacionesEnsamblar = animacionesEnsamblar;
    }

    /**
     * @return the plotwistEnsamblar
     */
    public int getPlotwistEnsamblar() {
        return plotwistEnsamblar;
    }

    /**
     * @param plotwistEnsamblar the plotwistEnsamblar to set
     */
    public void setPlotwistEnsamblar(int plotwistEnsamblar) {
        this.plotwistEnsamblar = plotwistEnsamblar;
    }

    /**
     * @return the capsToPlotwist
     */
    public int getCapsToPlotwist() {
        return capsToPlotwist;
    }

    /**
     * @param capsToPlotwist the capsToPlotwist to set
     */
    public void setCapsToPlotwist(int capsToPlotwist) {
        this.capsToPlotwist = capsToPlotwist;
    }

    /**
     * @return the numeroAssemblers
     */
    public int getNumeroAssemblers() {
        return numeroAssemblers;
    }

    /**
     * @param numeroAssemblers the numeroAssemblers to set
     */
    public void setNumeroAssemblers(int numeroAssemblers) {
        this.numeroAssemblers = numeroAssemblers;
    }

    /**
     * @return the Guionistas
     */
    public Developer getGuionistas() {
        return Guionistas;
    }

    /**
     * @return the Animadores
     */
    public Developer getAnimadores() {
        return Animadores;
    }

    /**
     * @return the Escenografos
     */
    public Developer getEscenografos() {
        return Escenografos;
    }

    /**
     * @return the Dobladores
     */
    public Developer getDobladores() {
        return Dobladores;
    }

    /**
     * @return the Plotwisters
     */
    public Developer getPlotwisters() {
        return Plotwisters;
    }

    /**
     * @return the Assembler
     */
    public Assembler getAssembler() {
        return Assembler;
    }

    /**
     * @return the PMsalary
     */
    public int getPMsalary() {
        return PMsalary;
    }

    /**
     * @param PMsalary the PMsalary to set
     */
    public void setPMsalary(int PMsalary) {
        this.PMsalary = PMsalary;
    }

    /**
     * @return the PM
     */
    public PM getPM() {
        return PM;
    }

    public float getChapterProfit() {
        return chapterProfit;
    }

    public void setChapterProfit(float chapterProfit) {
        this.chapterProfit = chapterProfit;
    }

    public float getPlotProfit() {
        return plotProfit;
    }

    public void setPlotProfit(float plotProfit) {
        this.plotProfit = plotProfit;
    }

    public int getDirectorSalary() {
        return directorSalary;
    }

    public void setDirectorSalary(int directorSalary) {
        this.directorSalary = directorSalary;
    }

    public Director getDirector() {
        return director;
    }

    /**
     * @return the labels
     */
    public JLabel[] getLabels() {
        return labels;
    }

    /**
     * @param labels the labels to set
     */
    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }

    /**
     * @return the trabajadoresTotalesMax
     */
    public int getTrabajadoresTotalesMax() {
        return trabajadoresTotalesMax;
    }

    /**
     * @param trabajadoresTotalesMax the trabajadoresTotalesMax to set
     */
    public void setTrabajadoresTotalesMax(int trabajadoresTotalesMax) {
        this.trabajadoresTotalesMax = trabajadoresTotalesMax;
    }

    /**
     * @return the trabajadoresTotales
     */
    public int getTrabajadoresTotales() {
        return trabajadoresTotales;
    }

    /**
     * @param trabajadoresTotales the trabajadoresTotales to set
     */
    public void setTrabajadoresTotales(int trabajadoresTotales) {
        this.trabajadoresTotales = trabajadoresTotales;
    }

    public int getGuardarTrabajadoresTotales() {
        return guardarTrabajadoresTotales;
    }

    public void setGuardarTrabajadoresTotales(int guardarTrabajadoresTotales) {
        this.guardarTrabajadoresTotales = guardarTrabajadoresTotales;
    }

    
    
    
    
}
