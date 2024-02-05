/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import classes.Company;
import classes.Reader;
import classes.Writer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Morillo
 */
public class InterfazPrincipal extends javax.swing.JFrame {
    
    
    
    Company CN = new Company(2,2,1,2,2,2,20,40,16,26,34,50,3000, 1, 1,1, 5, 1, 4, 1, 1, 4, 2, 2, 1, 2,5, 1, 6, 3,  10,40, 300000, 650000, 60,18) ;
    Company DN = new Company(2,2,1,2,2,2,20,40,16,26,34,50,3000, 1, 1,2, 3, 1, 3, 1, 1, 3, 3, 2, 1, 1,4, 3, 2, 2,  10,40, 250000, 600000, 60,15) ;
    Reader lector = new Reader();
    
    public InterfazPrincipal() {
        this.lector.ReadTxt(CN, DN);
        CN.actGuardarTotalTrabajadores();
        DN.actGuardarTotalTrabajadores();
        
        initComponents();
        this.setLocationRelativeTo(this);
        
        setImageLabel(CNImageLabel, "src/resources/RegularShow.png");
        
        
        JLabel[] CNContableLabels = {CNIngresosLabel,CNGastosLabel,CNBeneficiosLabel};
        JLabel[] CNDirectorLabels = {CNIngresosLabel,CNGastosLabel,CNBeneficiosLabel,CNDiasEntregaLabel,CNFaltasPMlabel,CNPMStateLabel,CNDirectorStateLabel,CNDescuentoPMLabel};
        JLabel[] CNPMLabels = {CNGastosLabel,CNDiasEntregaLabel,CNFaltasPMlabel,CNPMStateLabel,CNDescuentoPMLabel};
        JLabel[] CNDriveLabels = {CNGuionesDispoLabel,CNAnimDispoLabels,CNEscnDispoLabel,CNDoblDispoLabel,CNPlotDispoLabel,CNCapDispoLabel,CNCapPlotDispo};
        JLabel[] CNCompanyLabels={CNNumWorkersLabel,CNNumAnimadoresLabel,CNNumGuionistasLabel,CNNumEscenografosLabel,CNNumDobladoresLabel,CNNumPlotwistersLabel,CNNumEnsambladoresLabel,CNDeadLineReadLabel,CNNumGuionistasReadLabel,CNNumAnimadoresReadLabel,CNNumDobladoresReadLabel,CNNumEscenografosReadLabel,CNNumPlotwistersReadLabel,CNNumEnsambladoresReadLabel};
        
        this.CN.getDirector().setLabels(CNContableLabels);
        this.CN.getAnimadores().setContablesLabel(CNContableLabels);
        this.CN.getGuionistas().setContablesLabel(CNContableLabels);
        this.CN.getEscenografos().setContablesLabel(CNContableLabels);
        this.CN.getDobladores().setContablesLabel(CNContableLabels);
        this.CN.getPlotwisters().setContablesLabel(CNContableLabels);
        this.CN.getAssembler().setContablesLabel(CNContableLabels);
        this.CN.setLabels(CNCompanyLabels);
        
        this.CN.getPM().setPMlabels(CNPMLabels);
        this.CN.getDirector().setLabels(CNDirectorLabels); 
        this.CN.getDrive().setLabelsDrive(CNDriveLabels);
        
        JLabel[] DNContableLabels = {DNIngresosLabel,DNGastosLabel,DNBeneficiosLabel};
        JLabel[] DNDirectorLabels = {DNIngresosLabel,DNGastosLabel,DNBeneficiosLabel,DNDiasEntregaLabel,DNFaltasPMlabel,DNPMStateLabel,DNDirectorStateLabel,DNDescuentoPMLabel};
        JLabel[] DNPMLabels = {DNGastosLabel,DNDiasEntregaLabel,DNFaltasPMlabel,DNPMStateLabel,DNDescuentoPMLabel};
        JLabel[] DNDriveLabels = {DNGuionesDispoLabel,DNAnimDispoLabels,DNEscnDispoLabel,DNDoblDispoLabel,DNPlotDispoLabel,DNCapDispoLabel,DNCapPlotDispo};
        JLabel[] DNCompanyLabels={DNNumWorkersLabel,DNNumAnimadoresLabel,DNNumGuionistasLabel,DNNumEscenografosLabel,DNNumDobladoresLabel,DNNumPlotwistersLabel,DNNumEnsambladoresLabel,DNDeadLineReadLabel,DNNumGuionistasReadLabel,DNNumAnimadoresReadLabel,DNNumDobladoresReadLabel,DNNumEscenografosReadLabel,DNNumPlotwistersReadLabel,DNNumEnsambladoresReadLabel};
        
        
        this.DN.getDirector().setLabels(DNContableLabels);
        this.DN.getAnimadores().setContablesLabel(DNContableLabels);
        this.DN.getGuionistas().setContablesLabel(DNContableLabels);
        this.DN.getEscenografos().setContablesLabel(DNContableLabels);
        this.DN.getDobladores().setContablesLabel(DNContableLabels);
        this.DN.getPlotwisters().setContablesLabel(DNContableLabels);
        this.DN.getAssembler().setContablesLabel(DNContableLabels);
        
        this.DN.getPM().setPMlabels(DNPMLabels);
        this.DN.getDirector().setLabels(DNDirectorLabels); 
        this.DN.getDrive().setLabelsDrive(DNDriveLabels);
        
        this.DN.setLabels(DNCompanyLabels);
        
        
        CNDeadLineReadLabel.setText(String.valueOf(this.CN.getCommitDay()));
        CNNumGuionistasReadLabel.setText(String.valueOf(this.CN.getNumeroGuionistas()));
        CNNumAnimadoresReadLabel.setText(String.valueOf(this.CN.getNumeroAnimadores()));
        CNNumDobladoresReadLabel.setText(String.valueOf(this.CN.getNumeroDobladores()));
        CNNumEscenografosReadLabel.setText(String.valueOf(this.CN.getNumeroEscenarios()));
        CNNumPlotwistersReadLabel.setText(String.valueOf(this.CN.getNumeroPlotwisters()));
        CNNumEnsambladoresReadLabel.setText(String.valueOf(this.CN.getNumeroAssemblers()));
             
        
        DNDeadLineReadLabel.setText(String.valueOf(this.DN.getCommitDay()));
        DNNumGuionistasReadLabel.setText(String.valueOf(this.DN.getNumeroGuionistas()));
        DNNumAnimadoresReadLabel.setText(String.valueOf(this.DN.getNumeroAnimadores()));
        DNNumDobladoresReadLabel.setText(String.valueOf(this.DN.getNumeroDobladores()));
        DNNumEscenografosReadLabel.setText(String.valueOf(this.DN.getNumeroEscenarios()));
        DNNumPlotwistersReadLabel.setText(String.valueOf(this.DN.getNumeroPlotwisters()));
        DNNumEnsambladoresReadLabel.setText(String.valueOf(this.DN.getNumeroAssemblers()));
        
        
        
        
        CN.getDrive().loadLimits();
        DN.getDrive().loadLimits();
        CN.StartWorking();
        DN.StartWorking();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        CNNumGuionistasReadLabel = new javax.swing.JLabel();
        DNNumGuionistasReadLabel = new javax.swing.JLabel();
        CNNumAnimadoresReadLabel = new javax.swing.JLabel();
        DNNumAnimadoresReadLabel = new javax.swing.JLabel();
        DNNumDobladoresReadLabel = new javax.swing.JLabel();
        CNNumDobladoresReadLabel = new javax.swing.JLabel();
        CNNumEscenografosReadLabel = new javax.swing.JLabel();
        DNNumEscenografosReadLabel = new javax.swing.JLabel();
        CNNumPlotwistersReadLabel = new javax.swing.JLabel();
        DNNumPlotwistersReadLabel = new javax.swing.JLabel();
        CNNumEnsambladoresReadLabel = new javax.swing.JLabel();
        DNNumEnsambladoresReadLabel = new javax.swing.JLabel();
        WritterButton = new javax.swing.JButton();
        CNDeadLineReadLabel = new javax.swing.JLabel();
        DNDeadLineReadLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        CNMinusDeadLineReadButton1 = new javax.swing.JButton();
        CNPlusDeadLineReadButton1 = new javax.swing.JButton();
        CNPlusGuionReadButton1 = new javax.swing.JButton();
        CNMinusGuionReadButton1 = new javax.swing.JButton();
        CNMinusAnimadoresReadButton2 = new javax.swing.JButton();
        CNPlusAnimadoresReadButton2 = new javax.swing.JButton();
        CNMinusDobladoresReadButton3 = new javax.swing.JButton();
        CNPlusDobladoresReadButton3 = new javax.swing.JButton();
        CNMinusEscenografosReadButton4 = new javax.swing.JButton();
        CNPlusEscenografosReadButton4 = new javax.swing.JButton();
        CNMinusPlotwistersReadButton5 = new javax.swing.JButton();
        CNPlusPlotwistersReadButton5 = new javax.swing.JButton();
        CNMinusEnsambladoresReadButton6 = new javax.swing.JButton();
        CNPlusEnsambladoresReadButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        DNMinusDeadLineReadButton2 = new javax.swing.JButton();
        DNPlusDeadLineReadButton2 = new javax.swing.JButton();
        DNMinusGuionReadButton3 = new javax.swing.JButton();
        DNPlusGuionReadButton2 = new javax.swing.JButton();
        DNMinusAnimadoresReadButton3 = new javax.swing.JButton();
        DNPlusAnimadoresReadButton3 = new javax.swing.JButton();
        DNMinusDobladoresReadButton4 = new javax.swing.JButton();
        DNPlusDobladoresReadButton4 = new javax.swing.JButton();
        DNMinusEscenografosReadButton5 = new javax.swing.JButton();
        DNPlusEscenografosReadButton5 = new javax.swing.JButton();
        DNMinusPlotwistersReadButton6 = new javax.swing.JButton();
        DNPlusPlotwistersReadButton6 = new javax.swing.JButton();
        DNMinusEnsambladoresReadButton7 = new javax.swing.JButton();
        DNPlusEnsambladoresReadButton7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        durationDayLabel = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        DNNumWorkersLabel = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        DNNumGuionistasLabel = new javax.swing.JLabel();
        DNMinusGuionButton = new javax.swing.JButton();
        DNPlusGuionButton = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        DNNumAnimadoresLabel = new javax.swing.JLabel();
        DNMinusAnimButton = new javax.swing.JButton();
        DNPlusAnimButton = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        DNNumDobladoresLabel = new javax.swing.JLabel();
        DNMinusDoblButton = new javax.swing.JButton();
        DNPlusDoblButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        DNNumEscenografosLabel = new javax.swing.JLabel();
        DNMinusEscnButton = new javax.swing.JButton();
        DNPlusEcsnButton = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        DNNumPlotwistersLabel = new javax.swing.JLabel();
        DNMinusPltButton = new javax.swing.JButton();
        DNPlusPltButton = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        DNNumEnsambladoresLabel = new javax.swing.JLabel();
        DNMinusEnsmButton = new javax.swing.JButton();
        DNPlusEnsmButton = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        DNGuionesDispoLabel = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        DNAnimDispoLabels = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        DNDoblDispoLabel = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        DNEscnDispoLabel = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        DNPlotDispoLabel = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        DNCapDispoLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        DNCapPlotDispo = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        DNDiasEntregaLabel = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        DNIngresosLabel = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        DNGastosLabel = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        DNBeneficiosLabel = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        DNPMStateLabel = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        DNFaltasPMlabel = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        DNDirectorStateLabel = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        DNDescuentoPMLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CNPlusGuionButton = new javax.swing.JButton();
        CNPlusAnimButton = new javax.swing.JButton();
        CNPlusDoblButton = new javax.swing.JButton();
        CNPlusEcsnButton = new javax.swing.JButton();
        CNPlusPltButton = new javax.swing.JButton();
        CNMinusGuionButton = new javax.swing.JButton();
        CNMinusAnimButton = new javax.swing.JButton();
        CNMinusDoblButton = new javax.swing.JButton();
        CNMinusEscnButton = new javax.swing.JButton();
        CNMinusPltButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CNPlusEnsmButton = new javax.swing.JButton();
        CNMinusEnsmButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CNPMStateLabel = new javax.swing.JLabel();
        CNDirectorStateLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        CNFaltasPMlabel = new javax.swing.JLabel();
        CNDescuentoPMLabel = new javax.swing.JLabel();
        CNDiasEntregaLabel = new javax.swing.JLabel();
        CNIngresosLabel = new javax.swing.JLabel();
        CNGastosLabel = new javax.swing.JLabel();
        CNBeneficiosLabel = new javax.swing.JLabel();
        CNGuionesDispoLabel = new javax.swing.JLabel();
        CNAnimDispoLabels = new javax.swing.JLabel();
        CNDoblDispoLabel = new javax.swing.JLabel();
        CNEscnDispoLabel = new javax.swing.JLabel();
        CNPlotDispoLabel = new javax.swing.JLabel();
        CNCapDispoLabel = new javax.swing.JLabel();
        CNCapPlotDispo = new javax.swing.JLabel();
        CNNumGuionistasLabel = new javax.swing.JLabel();
        CNNumAnimadoresLabel = new javax.swing.JLabel();
        CNNumDobladoresLabel = new javax.swing.JLabel();
        CNNumEscenografosLabel = new javax.swing.JLabel();
        CNNumPlotwistersLabel = new javax.swing.JLabel();
        CNNumEnsambladoresLabel = new javax.swing.JLabel();
        CNNumWorkersLabel = new javax.swing.JLabel();
        CNImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CNNumGuionistasReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumGuionistasReadLabel.setText("1");

        DNNumGuionistasReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumGuionistasReadLabel.setText("1");

        CNNumAnimadoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumAnimadoresReadLabel.setText("1");

        DNNumAnimadoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumAnimadoresReadLabel.setText("1");

        DNNumDobladoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumDobladoresReadLabel.setText("1");

        CNNumDobladoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumDobladoresReadLabel.setText("1");

        CNNumEscenografosReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumEscenografosReadLabel.setText("1");

        DNNumEscenografosReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumEscenografosReadLabel.setText("1");

        CNNumPlotwistersReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumPlotwistersReadLabel.setText("1");

        DNNumPlotwistersReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumPlotwistersReadLabel.setText("1");

        CNNumEnsambladoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNNumEnsambladoresReadLabel.setText("1");

        DNNumEnsambladoresReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumEnsambladoresReadLabel.setText("1");

        WritterButton.setText("Cargar");
        WritterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WritterButtonActionPerformed(evt);
            }
        });

        CNDeadLineReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNDeadLineReadLabel.setText("1");

        DNDeadLineReadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNDeadLineReadLabel.setText("1");

        jLabel25.setText("Duracion del dia:");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CartoonNetwork");

        CNMinusDeadLineReadButton1.setText("-");
        CNMinusDeadLineReadButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusDeadLineReadButton1ActionPerformed(evt);
            }
        });

        CNPlusDeadLineReadButton1.setText("+");
        CNPlusDeadLineReadButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusDeadLineReadButton1ActionPerformed(evt);
            }
        });

        CNPlusGuionReadButton1.setText("+");
        CNPlusGuionReadButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusGuionReadButton1ActionPerformed(evt);
            }
        });

        CNMinusGuionReadButton1.setText("-");
        CNMinusGuionReadButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusGuionReadButton1ActionPerformed(evt);
            }
        });

        CNMinusAnimadoresReadButton2.setText("-");
        CNMinusAnimadoresReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusAnimadoresReadButton2ActionPerformed(evt);
            }
        });

        CNPlusAnimadoresReadButton2.setText("+");
        CNPlusAnimadoresReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusAnimadoresReadButton2ActionPerformed(evt);
            }
        });

        CNMinusDobladoresReadButton3.setText("-");
        CNMinusDobladoresReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusDobladoresReadButton3ActionPerformed(evt);
            }
        });

        CNPlusDobladoresReadButton3.setText("+");
        CNPlusDobladoresReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusDobladoresReadButton3ActionPerformed(evt);
            }
        });

        CNMinusEscenografosReadButton4.setText("-");
        CNMinusEscenografosReadButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusEscenografosReadButton4ActionPerformed(evt);
            }
        });

        CNPlusEscenografosReadButton4.setText("+");
        CNPlusEscenografosReadButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusEscenografosReadButton4ActionPerformed(evt);
            }
        });

        CNMinusPlotwistersReadButton5.setText("-");
        CNMinusPlotwistersReadButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusPlotwistersReadButton5ActionPerformed(evt);
            }
        });

        CNPlusPlotwistersReadButton5.setText("+");
        CNPlusPlotwistersReadButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusPlotwistersReadButton5ActionPerformed(evt);
            }
        });

        CNMinusEnsambladoresReadButton6.setText("-");
        CNMinusEnsambladoresReadButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusEnsambladoresReadButton6ActionPerformed(evt);
            }
        });

        CNPlusEnsambladoresReadButton6.setText("+");
        CNPlusEnsambladoresReadButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusEnsambladoresReadButton6ActionPerformed(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Disney Channel");

        DNMinusDeadLineReadButton2.setText("-");
        DNMinusDeadLineReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusDeadLineReadButton2ActionPerformed(evt);
            }
        });

        DNPlusDeadLineReadButton2.setText("+");
        DNPlusDeadLineReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusDeadLineReadButton2ActionPerformed(evt);
            }
        });

        DNMinusGuionReadButton3.setText("-");
        DNMinusGuionReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusGuionReadButton3ActionPerformed(evt);
            }
        });

        DNPlusGuionReadButton2.setText("+");
        DNPlusGuionReadButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusGuionReadButton2ActionPerformed(evt);
            }
        });

        DNMinusAnimadoresReadButton3.setText("-");
        DNMinusAnimadoresReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusAnimadoresReadButton3ActionPerformed(evt);
            }
        });

        DNPlusAnimadoresReadButton3.setText("+");
        DNPlusAnimadoresReadButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusAnimadoresReadButton3ActionPerformed(evt);
            }
        });

        DNMinusDobladoresReadButton4.setText("-");
        DNMinusDobladoresReadButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusDobladoresReadButton4ActionPerformed(evt);
            }
        });

        DNPlusDobladoresReadButton4.setText("+");
        DNPlusDobladoresReadButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusDobladoresReadButton4ActionPerformed(evt);
            }
        });

        DNMinusEscenografosReadButton5.setText("-");
        DNMinusEscenografosReadButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusEscenografosReadButton5ActionPerformed(evt);
            }
        });

        DNPlusEscenografosReadButton5.setText("+");
        DNPlusEscenografosReadButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusEscenografosReadButton5ActionPerformed(evt);
            }
        });

        DNMinusPlotwistersReadButton6.setText("-");
        DNMinusPlotwistersReadButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusPlotwistersReadButton6ActionPerformed(evt);
            }
        });

        DNPlusPlotwistersReadButton6.setText("+");
        DNPlusPlotwistersReadButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusPlotwistersReadButton6ActionPerformed(evt);
            }
        });

        DNMinusEnsambladoresReadButton7.setText("-");
        DNMinusEnsambladoresReadButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusEnsambladoresReadButton7ActionPerformed(evt);
            }
        });

        DNPlusEnsambladoresReadButton7.setText("+");
        DNPlusEnsambladoresReadButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusEnsambladoresReadButton7ActionPerformed(evt);
            }
        });

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Dia de entrega");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Guionistas");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Dobladores");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Animadores");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Escenografos");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Plotwisters");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Ensambladores");

        durationDayLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationDayLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CNDeadLineReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumGuionistasReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumAnimadoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumDobladoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumEscenografosReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumPlotwistersReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNNumEnsambladoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CNPlusGuionReadButton1)
                                .addComponent(CNPlusDeadLineReadButton1)
                                .addComponent(CNPlusAnimadoresReadButton2)
                                .addComponent(CNPlusDobladoresReadButton3)
                                .addComponent(CNPlusEscenografosReadButton4)
                                .addComponent(CNPlusPlotwistersReadButton5)
                                .addComponent(CNPlusEnsambladoresReadButton6)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(durationDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CNMinusDeadLineReadButton1)
                            .addComponent(CNMinusGuionReadButton1)
                            .addComponent(CNMinusAnimadoresReadButton2)
                            .addComponent(CNMinusDobladoresReadButton3)
                            .addComponent(CNMinusEscenografosReadButton4)
                            .addComponent(CNMinusPlotwistersReadButton5)
                            .addComponent(CNMinusEnsambladoresReadButton6))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WritterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNMinusDeadLineReadButton2)
                                    .addComponent(DNMinusGuionReadButton3)
                                    .addComponent(DNMinusAnimadoresReadButton3)
                                    .addComponent(DNMinusDobladoresReadButton4)
                                    .addComponent(DNMinusEscenografosReadButton5)
                                    .addComponent(DNMinusPlotwistersReadButton6)
                                    .addComponent(DNMinusEnsambladoresReadButton7))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumEnsambladoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusEnsambladoresReadButton7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumPlotwistersReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusPlotwistersReadButton6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumEscenografosReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusEscenografosReadButton5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumDobladoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusDobladoresReadButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumAnimadoresReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusAnimadoresReadButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNDeadLineReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusDeadLineReadButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(DNNumGuionistasReadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPlusGuionReadButton2)))))))
                .addContainerGap(1262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(durationDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNMinusDeadLineReadButton1)
                            .addComponent(CNPlusDeadLineReadButton1)
                            .addComponent(CNDeadLineReadLabel)
                            .addComponent(DNDeadLineReadLabel)
                            .addComponent(DNMinusDeadLineReadButton2)
                            .addComponent(DNPlusDeadLineReadButton2)
                            .addComponent(jLabel28))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNMinusGuionReadButton1)
                            .addComponent(CNNumGuionistasReadLabel)
                            .addComponent(CNPlusGuionReadButton1)
                            .addComponent(DNNumGuionistasReadLabel)
                            .addComponent(DNMinusGuionReadButton3)
                            .addComponent(DNPlusGuionReadButton2)
                            .addComponent(jLabel29))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPlusAnimadoresReadButton2)
                            .addComponent(CNMinusAnimadoresReadButton2)
                            .addComponent(CNNumAnimadoresReadLabel)
                            .addComponent(DNNumAnimadoresReadLabel)
                            .addComponent(DNMinusAnimadoresReadButton3)
                            .addComponent(DNPlusAnimadoresReadButton3)
                            .addComponent(jLabel31))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPlusDobladoresReadButton3)
                            .addComponent(CNMinusDobladoresReadButton3)
                            .addComponent(CNNumDobladoresReadLabel)
                            .addComponent(DNNumDobladoresReadLabel)
                            .addComponent(DNMinusDobladoresReadButton4)
                            .addComponent(DNPlusDobladoresReadButton4)
                            .addComponent(jLabel30))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPlusEscenografosReadButton4)
                            .addComponent(CNMinusEscenografosReadButton4)
                            .addComponent(CNNumEscenografosReadLabel)
                            .addComponent(DNNumEscenografosReadLabel)
                            .addComponent(DNMinusEscenografosReadButton5)
                            .addComponent(DNPlusEscenografosReadButton5)
                            .addComponent(jLabel32))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPlusPlotwistersReadButton5)
                            .addComponent(CNMinusPlotwistersReadButton5)
                            .addComponent(CNNumPlotwistersReadLabel)
                            .addComponent(DNNumPlotwistersReadLabel)
                            .addComponent(DNMinusPlotwistersReadButton6)
                            .addComponent(DNPlusPlotwistersReadButton6)
                            .addComponent(jLabel33))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNPlusEnsambladoresReadButton6)
                            .addComponent(CNMinusEnsambladoresReadButton6)
                            .addComponent(CNNumEnsambladoresReadLabel)
                            .addComponent(DNNumEnsambladoresReadLabel)
                            .addComponent(DNMinusEnsambladoresReadButton7)
                            .addComponent(DNPlusEnsambladoresReadButton7)
                            .addComponent(jLabel34))
                        .addGap(54, 54, 54)
                        .addComponent(WritterButton)))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Principal", jPanel1);

        jLabel35.setText("Trabajadores Totales: ");

        jLabel36.setText("DISNEY CHANNEL");

        DNNumWorkersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumWorkersLabel.setText("6");

        jLabel37.setText("DRIVE:");

        jLabel38.setText("Guionistas:");

        DNNumGuionistasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumGuionistasLabel.setText("1");

        DNMinusGuionButton.setText("-");
        DNMinusGuionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusGuionButtonActionPerformed(evt);
            }
        });

        DNPlusGuionButton.setText("+");
        DNPlusGuionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusGuionButtonActionPerformed(evt);
            }
        });

        jLabel39.setText("Animadores:");

        DNNumAnimadoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumAnimadoresLabel.setText("1");

        DNMinusAnimButton.setText("-");
        DNMinusAnimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusAnimButtonActionPerformed(evt);
            }
        });

        DNPlusAnimButton.setText("+");
        DNPlusAnimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusAnimButtonActionPerformed(evt);
            }
        });

        jLabel40.setText("Dobladores:");

        DNNumDobladoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumDobladoresLabel.setText("1");

        DNMinusDoblButton.setText("-");
        DNMinusDoblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusDoblButtonActionPerformed(evt);
            }
        });

        DNPlusDoblButton.setText("+");
        DNPlusDoblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusDoblButtonActionPerformed(evt);
            }
        });

        jLabel41.setText("Escenografos:");

        DNNumEscenografosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumEscenografosLabel.setText("1");

        DNMinusEscnButton.setText("-");
        DNMinusEscnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusEscnButtonActionPerformed(evt);
            }
        });

        DNPlusEcsnButton.setText("+");
        DNPlusEcsnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusEcsnButtonActionPerformed(evt);
            }
        });

        jLabel42.setText("Plotwisters: ");

        DNNumPlotwistersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumPlotwistersLabel.setText("1");

        DNMinusPltButton.setText("-");
        DNMinusPltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusPltButtonActionPerformed(evt);
            }
        });

        DNPlusPltButton.setText("+");
        DNPlusPltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusPltButtonActionPerformed(evt);
            }
        });

        jLabel43.setText("Ensambladores: ");

        DNNumEnsambladoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNNumEnsambladoresLabel.setText("1");

        DNMinusEnsmButton.setText("-");
        DNMinusEnsmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNMinusEnsmButtonActionPerformed(evt);
            }
        });

        DNPlusEnsmButton.setText("+");
        DNPlusEnsmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNPlusEnsmButtonActionPerformed(evt);
            }
        });

        jLabel44.setText("Guiones: ");

        DNGuionesDispoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNGuionesDispoLabel.setText("0");

        jLabel45.setText("Animaciones:");

        DNAnimDispoLabels.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNAnimDispoLabels.setText("0");

        jLabel46.setText("Doblajes:");

        DNDoblDispoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNDoblDispoLabel.setText("0");

        jLabel47.setText("Escenas:");

        DNEscnDispoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNEscnDispoLabel.setText("0");

        jLabel48.setText("Plotwist: ");

        DNPlotDispoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNPlotDispoLabel.setText("0");

        jLabel49.setText("Capitulos Disponibles:");

        DNCapDispoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNCapDispoLabel.setText("0");

        jLabel50.setText("Caps con Plotwist Disponibles:");

        DNCapPlotDispo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNCapPlotDispo.setText("0");

        jLabel51.setText("DIAS PARA LA ENTREGA:");

        DNDiasEntregaLabel.setText("Dias");

        jLabel52.setText("Ingresos Brutos:");

        DNIngresosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DNIngresosLabel.setText("0");

        jLabel53.setText("Gastos:");

        DNGastosLabel.setText("Gastos");

        jLabel54.setText("Beneficios: ");

        DNBeneficiosLabel.setText("Beneficios");

        jLabel55.setText("Estado del PM:");

        DNPMStateLabel.setText(" Label PM");

        jLabel56.setText("FaltasPM: ");

        DNFaltasPMlabel.setText("Faltas PM label");

        jLabel57.setText("Estado del Director:");

        DNDirectorStateLabel.setText("Label Director");

        jLabel58.setText("Dinero Descontado al PM:");

        DNDescuentoPMLabel.setText("Desc PM label");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(612, 612, 612)
                        .addComponent(jLabel36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel39)
                                                .addComponent(jLabel40)
                                                .addComponent(jLabel41)
                                                .addComponent(jLabel42)
                                                .addComponent(jLabel43))
                                            .addGap(107, 107, 107)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(DNMinusAnimButton)
                                                .addComponent(DNMinusDoblButton)
                                                .addComponent(DNMinusEscnButton)
                                                .addComponent(DNMinusPltButton)
                                                .addComponent(DNMinusEnsmButton)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DNMinusGuionButton)))
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DNNumGuionistasLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                                            .addComponent(DNNumWorkersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(DNPlusGuionButton)
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel44)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(DNNumEscenografosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(DNPlusEcsnButton))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(DNNumPlotwistersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(DNPlusPltButton)))
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel47)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel45)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DNNumAnimadoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNPlusAnimButton))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DNNumDobladoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNPlusDoblButton))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(DNNumEnsambladoresLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNPlusEnsmButton)))
                                .addGap(97, 97, 97)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNGuionesDispoLabel)
                                    .addComponent(DNAnimDispoLabels)
                                    .addComponent(DNDoblDispoLabel)
                                    .addComponent(DNEscnDispoLabel)
                                    .addComponent(DNPlotDispoLabel))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(436, 436, 436)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNCapPlotDispo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNCapDispoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNBeneficiosLabel)
                                    .addComponent(DNGastosLabel)
                                    .addComponent(DNIngresosLabel)
                                    .addComponent(DNDiasEntregaLabel)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DNPMStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNDirectorStateLabel)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNDescuentoPMLabel))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addGap(18, 18, 18)
                                        .addComponent(DNFaltasPMlabel)))))))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel51)
                            .addComponent(DNDiasEntregaLabel)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DNNumWorkersLabel)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(DNMinusGuionButton)
                    .addComponent(DNNumGuionistasLabel)
                    .addComponent(DNPlusGuionButton)
                    .addComponent(jLabel44)
                    .addComponent(DNGuionesDispoLabel)
                    .addComponent(jLabel52)
                    .addComponent(DNIngresosLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(DNNumAnimadoresLabel)
                        .addComponent(DNMinusAnimButton)
                        .addComponent(DNPlusAnimButton)
                        .addComponent(DNAnimDispoLabels)
                        .addComponent(jLabel53)
                        .addComponent(DNGastosLabel))
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(DNNumDobladoresLabel)
                        .addComponent(DNMinusDoblButton)
                        .addComponent(DNPlusDoblButton)
                        .addComponent(DNDoblDispoLabel)
                        .addComponent(jLabel54)
                        .addComponent(DNBeneficiosLabel))
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(DNNumEscenografosLabel)
                    .addComponent(DNMinusEscnButton)
                    .addComponent(DNPlusEcsnButton)
                    .addComponent(jLabel47)
                    .addComponent(DNEscnDispoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(DNNumPlotwistersLabel)
                    .addComponent(DNMinusPltButton)
                    .addComponent(DNPlusPltButton)
                    .addComponent(jLabel48)
                    .addComponent(DNPlotDispoLabel))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(DNNumEnsambladoresLabel)
                    .addComponent(DNMinusEnsmButton)
                    .addComponent(DNPlusEnsmButton)
                    .addComponent(jLabel55)
                    .addComponent(DNPMStateLabel)
                    .addComponent(jLabel56)
                    .addComponent(DNFaltasPMlabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(DNDirectorStateLabel)
                    .addComponent(jLabel58)
                    .addComponent(DNDescuentoPMLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(DNCapDispoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(DNCapPlotDispo))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        DNNumWorkersLabel.getAccessibleContext().setAccessibleName("1");

        TabbedPane.addTab("Disney", jPanel3);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Trabajadores Totales: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guionistas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Animadores:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dobladores:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escenografos:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 130, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Plotwisters: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, -1));

        CNPlusGuionButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusGuionButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusGuionButton.setText("+");
        CNPlusGuionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusGuionButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusGuionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        CNPlusAnimButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusAnimButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusAnimButton.setText("+");
        CNPlusAnimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusAnimButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusAnimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        CNPlusDoblButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusDoblButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusDoblButton.setText("+");
        CNPlusDoblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusDoblButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusDoblButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        CNPlusEcsnButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusEcsnButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusEcsnButton.setText("+");
        CNPlusEcsnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusEcsnButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusEcsnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        CNPlusPltButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusPltButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusPltButton.setText("+");
        CNPlusPltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusPltButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusPltButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        CNMinusGuionButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusGuionButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusGuionButton.setText("-");
        CNMinusGuionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusGuionButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusGuionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        CNMinusAnimButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusAnimButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusAnimButton.setText("-");
        CNMinusAnimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusAnimButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusAnimButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        CNMinusDoblButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusDoblButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusDoblButton.setText("-");
        CNMinusDoblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusDoblButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusDoblButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        CNMinusEscnButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusEscnButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusEscnButton.setText("-");
        CNMinusEscnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusEscnButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusEscnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        CNMinusPltButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusPltButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusPltButton.setText("-");
        CNMinusPltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusPltButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusPltButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ensambladores: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, -1));

        CNPlusEnsmButton.setBackground(new java.awt.Color(255, 255, 255));
        CNPlusEnsmButton.setForeground(new java.awt.Color(0, 0, 0));
        CNPlusEnsmButton.setText("+");
        CNPlusEnsmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPlusEnsmButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNPlusEnsmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        CNMinusEnsmButton.setBackground(new java.awt.Color(255, 255, 255));
        CNMinusEnsmButton.setForeground(new java.awt.Color(0, 0, 0));
        CNMinusEnsmButton.setText("-");
        CNMinusEnsmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNMinusEnsmButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CNMinusEnsmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CARTOON NETWORK");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DRIVE:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guiones: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 70, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Animaciones:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Doblajes:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Escenas:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 80, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Plotwist: ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Capitulos Disponibles:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 160, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Caps con Plotwist Disponibles:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, 28));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DIAS PARA LA ENTREGA:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 190, 190, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ingresos Brutos:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 130, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Gastos:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 340, 90, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Beneficios: ");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 290, 120, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Estado del PM:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 120, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Estado del Director:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 140, -1));

        CNPMStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNPMStateLabel.setText(" Label PM");
        jPanel2.add(CNPMStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 420, 100, -1));

        CNDirectorStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNDirectorStateLabel.setText("Label Director");
        jPanel2.add(CNDirectorStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 460, 90, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("FaltasPM: ");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 80, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Dinero Descontado al PM:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 460, 180, -1));

        CNFaltasPMlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CNFaltasPMlabel.setForeground(new java.awt.Color(255, 255, 255));
        CNFaltasPMlabel.setText("Faltas PM label");
        jPanel2.add(CNFaltasPMlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, 100, -1));

        CNDescuentoPMLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CNDescuentoPMLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNDescuentoPMLabel.setText("Desc PM label");
        jPanel2.add(CNDescuentoPMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 460, 90, -1));

        CNDiasEntregaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CNDiasEntregaLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNDiasEntregaLabel.setText("Dias");
        jPanel2.add(CNDiasEntregaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 40, -1));

        CNIngresosLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNIngresosLabel.setText("0");
        jPanel2.add(CNIngresosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 240, 30, -1));

        CNGastosLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNGastosLabel.setText("Gastos");
        jPanel2.add(CNGastosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 340, 60, -1));

        CNBeneficiosLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNBeneficiosLabel.setText("Beneficios");
        jPanel2.add(CNBeneficiosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 290, 70, -1));

        CNGuionesDispoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CNGuionesDispoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNGuionesDispoLabel.setText("0");
        jPanel2.add(CNGuionesDispoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 40, -1));

        CNAnimDispoLabels.setForeground(new java.awt.Color(255, 255, 255));
        CNAnimDispoLabels.setText("0");
        jPanel2.add(CNAnimDispoLabels, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 40, -1));

        CNDoblDispoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNDoblDispoLabel.setText("0");
        jPanel2.add(CNDoblDispoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 50, -1));

        CNEscnDispoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNEscnDispoLabel.setText("0");
        jPanel2.add(CNEscnDispoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 50, -1));

        CNPlotDispoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNPlotDispoLabel.setText("0");
        jPanel2.add(CNPlotDispoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 50, -1));

        CNCapDispoLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNCapDispoLabel.setText("0");
        jPanel2.add(CNCapDispoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 20, -1));

        CNCapPlotDispo.setForeground(new java.awt.Color(255, 255, 255));
        CNCapPlotDispo.setText("0");
        jPanel2.add(CNCapPlotDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 20, -1));

        CNNumGuionistasLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumGuionistasLabel.setText("1");
        jPanel2.add(CNNumGuionistasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 20, 20));

        CNNumAnimadoresLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumAnimadoresLabel.setText("1");
        jPanel2.add(CNNumAnimadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 10, -1));

        CNNumDobladoresLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumDobladoresLabel.setText("1");
        jPanel2.add(CNNumDobladoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 10, -1));

        CNNumEscenografosLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumEscenografosLabel.setText("1");
        jPanel2.add(CNNumEscenografosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        CNNumPlotwistersLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumPlotwistersLabel.setText("1");
        jPanel2.add(CNNumPlotwistersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 20, -1));

        CNNumEnsambladoresLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumEnsambladoresLabel.setText("1");
        jPanel2.add(CNNumEnsambladoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 15, -1));

        CNNumWorkersLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CNNumWorkersLabel.setForeground(new java.awt.Color(255, 255, 255));
        CNNumWorkersLabel.setText("6");
        jPanel2.add(CNNumWorkersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 40, -1));
        jPanel2.add(CNImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 560));

        TabbedPane.addTab("CartoonNetwork", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setImageLabel (JLabel nombrelabel, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(nombrelabel.getWidth(), nombrelabel.getHeight(), nombrelabel.getWidth()));
        nombrelabel.setIcon(icon);
        this.repaint();
    }
    
    private void CNPlusGuionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusGuionButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
        this.CN.getGuionistas().setDevelopersquantity(this.CN.getGuionistas().getDevelopersquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumGuionistasLabel.setText(String.valueOf(this.CN.getGuionistas().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNPlusGuionButtonActionPerformed

    private void CNPlusAnimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusAnimButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
        this.CN.getAnimadores().setDevelopersquantity(this.CN.getAnimadores().getDevelopersquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumAnimadoresLabel.setText(String.valueOf(this.CN.getAnimadores().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_CNPlusAnimButtonActionPerformed

    private void CNPlusDoblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusDoblButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.CN.getDobladores().setDevelopersquantity(this.CN.getDobladores().getDevelopersquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumDobladoresLabel.setText(String.valueOf(this.CN.getDobladores().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_CNPlusDoblButtonActionPerformed

    private void CNPlusEcsnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusEcsnButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.CN.getEscenografos().setDevelopersquantity(this.CN.getEscenografos().getDevelopersquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumEscenografosLabel.setText(String.valueOf(this.CN.getEscenografos().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_CNPlusEcsnButtonActionPerformed

    private void CNPlusPltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusPltButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.CN.getPlotwisters().setDevelopersquantity(this.CN.getPlotwisters().getDevelopersquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumPlotwistersLabel.setText(String.valueOf(this.CN.getPlotwisters().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_CNPlusPltButtonActionPerformed

    private void CNPlusEnsmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusEnsmButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.CN.getAssembler().setAssemblerquantity(this.CN.getAssembler().getAssemblerquantity()+1);
        this.CN.actTotalTrabajadores();
        this.CNNumEnsambladoresLabel.setText(String.valueOf(this.CN.getAssembler().getAssemblerquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_CNPlusEnsmButtonActionPerformed

    private void CNMinusGuionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusGuionButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getGuionistas().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getGuionistas().setDevelopersquantity(this.CN.getGuionistas().getDevelopersquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumGuionistasLabel.setText(String.valueOf(this.CN.getGuionistas().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
        
    }//GEN-LAST:event_CNMinusGuionButtonActionPerformed

    private void CNMinusAnimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusAnimButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getAnimadores().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getAnimadores().setDevelopersquantity(this.CN.getAnimadores().getDevelopersquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumAnimadoresLabel.setText(String.valueOf(this.CN.getAnimadores().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNMinusAnimButtonActionPerformed

    private void CNMinusDoblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusDoblButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getDobladores().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getDobladores().setDevelopersquantity(this.CN.getDobladores().getDevelopersquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumDobladoresLabel.setText(String.valueOf(this.CN.getDobladores().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNMinusDoblButtonActionPerformed

    private void CNMinusEscnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusEscnButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getEscenografos().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getEscenografos().setDevelopersquantity(this.CN.getEscenografos().getDevelopersquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumEscenografosLabel.setText(String.valueOf(this.CN.getEscenografos().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNMinusEscnButtonActionPerformed

    private void CNMinusPltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusPltButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getPlotwisters().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getPlotwisters().setDevelopersquantity(this.CN.getPlotwisters().getDevelopersquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumPlotwistersLabel.setText(String.valueOf(this.CN.getPlotwisters().getDevelopersquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNMinusPltButtonActionPerformed

    private void CNMinusEnsmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusEnsmButtonActionPerformed
        // TODO add your handling code here:
        if (this.CN.getAssembler().getAssemblerquantity()== 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.getAssembler().setAssemblerquantity(this.CN.getAssembler().getAssemblerquantity()-1);
        this.CN.actTotalTrabajadores();
        this.CNNumEnsambladoresLabel.setText(String.valueOf(this.CN.getAssembler().getAssemblerquantity()));
        CNNumWorkersLabel.setText(String.valueOf(this.CN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_CNMinusEnsmButtonActionPerformed

    private void WritterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WritterButtonActionPerformed
        // TODO add your handling code here:
        try {
            Integer DurationDay = Integer.parseInt(durationDayLabel.getText());
            
            Integer CNDeadLine = Integer.parseInt(CNDeadLineReadLabel.getText());
            Integer CNNumGuionistas = Integer.parseInt(CNNumGuionistasReadLabel.getText());
            Integer CNNumAnimadores = Integer.parseInt(CNNumAnimadoresReadLabel.getText());
            Integer CNNumDobladores = Integer.parseInt(CNNumDobladoresReadLabel.getText());
            Integer CNNumEscenografos = Integer.parseInt(CNNumEscenografosReadLabel.getText());
            Integer CNNumPlotwisters = Integer.parseInt(CNNumPlotwistersReadLabel.getText());
            Integer CNNumEnsambladores = Integer.parseInt(CNNumEnsambladoresReadLabel.getText());
            
            Integer DNDeadLine = Integer.parseInt(DNDeadLineReadLabel.getText());
            Integer DNNumGuionistas = Integer.parseInt(DNNumGuionistasReadLabel.getText());
            Integer DNNumAnimadores = Integer.parseInt(DNNumAnimadoresReadLabel.getText());
            Integer DNNumDobladores = Integer.parseInt(DNNumDobladoresReadLabel.getText());
            Integer DNNumEscenografos = Integer.parseInt(DNNumEscenografosReadLabel.getText());
            Integer DNNumPlotwisters = Integer.parseInt(DNNumPlotwistersReadLabel.getText());
            Integer DNNumEnsambladores = Integer.parseInt(DNNumEnsambladoresReadLabel.getText());
            
            if(DurationDay > 0){
                Writer writer = new Writer(DurationDay, CNDeadLine , CNNumGuionistas, CNNumAnimadores, CNNumDobladores, CNNumEscenografos, CNNumPlotwisters, CNNumEnsambladores, DNDeadLine ,DNNumGuionistas, DNNumAnimadores, DNNumDobladores, DNNumEscenografos, DNNumPlotwisters, DNNumEnsambladores);
                writer.guardar();
                JOptionPane.showMessageDialog(null, "Valores guardados para la siguiente simulacion");
            } else{
                JOptionPane.showMessageDialog(null, "Error. Valor de duracion del dia no es valido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error. Valor de duracion del dia no es valido");
        }
        
    }//GEN-LAST:event_WritterButtonActionPerformed

    private void CNMinusDeadLineReadButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusDeadLineReadButton1ActionPerformed
        // TODO add your handling code here:
        Integer CNDeadLine = Integer.parseInt(CNDeadLineReadLabel.getText());
        if (CNDeadLine == 1){
            JOptionPane.showMessageDialog(this, "El dia de entrega no puede ser menor a 1");
        } else {

        this.CNDeadLineReadLabel.setText(String.valueOf(CNDeadLine - 1));
        }
        
    }//GEN-LAST:event_CNMinusDeadLineReadButton1ActionPerformed

    private void CNPlusDeadLineReadButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusDeadLineReadButton1ActionPerformed
        // TODO add your handling code here:
        Integer CNDeadLine = Integer.parseInt(CNDeadLineReadLabel.getText());
        this.CNDeadLineReadLabel.setText(String.valueOf(CNDeadLine + 1));
    }//GEN-LAST:event_CNPlusDeadLineReadButton1ActionPerformed

    private void CNPlusGuionReadButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusGuionReadButton1ActionPerformed
        // TODO add your handling code here:
        Integer CNNumGuionistas = Integer.parseInt(CNNumGuionistasReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales()>= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
        this.CNNumGuionistasReadLabel.setText(String.valueOf(CNNumGuionistas +1));
        }
    }//GEN-LAST:event_CNPlusGuionReadButton1ActionPerformed

    private void CNMinusGuionReadButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusGuionReadButton1ActionPerformed
        // TODO add your handling code here:
        Integer CNNumGuionistas = Integer.parseInt(CNNumGuionistasReadLabel.getText());
        if (CNNumGuionistas == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
        this.CNNumGuionistasReadLabel.setText(String.valueOf(CNNumGuionistas -1));
        }
    }//GEN-LAST:event_CNMinusGuionReadButton1ActionPerformed

    private void CNMinusAnimadoresReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusAnimadoresReadButton2ActionPerformed
        // TODO add your handling code here:
        Integer CNNumAnimadores = Integer.parseInt(CNNumAnimadoresReadLabel.getText());
        if (CNNumAnimadores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
        this.CNNumAnimadoresReadLabel.setText(String.valueOf(CNNumAnimadores -1));
        }
    }//GEN-LAST:event_CNMinusAnimadoresReadButton2ActionPerformed

    private void CNPlusAnimadoresReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusAnimadoresReadButton2ActionPerformed
        // TODO add your handling code here:
        Integer CNNumAnimadores = Integer.parseInt(CNNumAnimadoresReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales() >= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
        this.CNNumAnimadoresReadLabel.setText(String.valueOf(CNNumAnimadores +1));
        }
    }//GEN-LAST:event_CNPlusAnimadoresReadButton2ActionPerformed

    private void CNMinusDobladoresReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusDobladoresReadButton3ActionPerformed
        // TODO add your handling code here:
        Integer CNNumDobladores = Integer.parseInt(CNNumDobladoresReadLabel.getText());
        if (CNNumDobladores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
        this.CNNumDobladoresReadLabel.setText(String.valueOf(CNNumDobladores -1));
        }
    }//GEN-LAST:event_CNMinusDobladoresReadButton3ActionPerformed

    private void CNPlusDobladoresReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusDobladoresReadButton3ActionPerformed
        // TODO add your handling code here:
        Integer CNNumDobladores = Integer.parseInt(CNNumDobladoresReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales()>= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
        this.CNNumDobladoresReadLabel.setText(String.valueOf(CNNumDobladores +1));}
    }//GEN-LAST:event_CNPlusDobladoresReadButton3ActionPerformed

    private void CNMinusEscenografosReadButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusEscenografosReadButton4ActionPerformed
        // TODO add your handling code here:
        Integer CNNumEscenografos = Integer.parseInt(CNNumEscenografosReadLabel.getText());
        if (CNNumEscenografos == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
            this.CNNumEscenografosReadLabel.setText(String.valueOf(CNNumEscenografos -1));
        }
    }//GEN-LAST:event_CNMinusEscenografosReadButton4ActionPerformed

    private void CNPlusEscenografosReadButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusEscenografosReadButton4ActionPerformed
        // TODO add your handling code here:
        Integer CNNumEscenografos = Integer.parseInt(CNNumEscenografosReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales()>= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
            this.CNNumEscenografosReadLabel.setText(String.valueOf(CNNumEscenografos +1));}
    }//GEN-LAST:event_CNPlusEscenografosReadButton4ActionPerformed

    private void CNMinusPlotwistersReadButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusPlotwistersReadButton5ActionPerformed
        // TODO add your handling code here:
        Integer CNNumPlotwisters = Integer.parseInt(CNNumPlotwistersReadLabel.getText());
        if (CNNumPlotwisters == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
            this.CNNumPlotwistersReadLabel.setText(String.valueOf(CNNumPlotwisters -1));
        }
    }//GEN-LAST:event_CNMinusPlotwistersReadButton5ActionPerformed

    private void CNPlusPlotwistersReadButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusPlotwistersReadButton5ActionPerformed
        // TODO add your handling code here:
        Integer CNNumPlotwisters = Integer.parseInt(CNNumPlotwistersReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales()>= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
            this.CNNumPlotwistersReadLabel.setText(String.valueOf(CNNumPlotwisters +1));}
    }//GEN-LAST:event_CNPlusPlotwistersReadButton5ActionPerformed

    private void CNMinusEnsambladoresReadButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNMinusEnsambladoresReadButton6ActionPerformed
        // TODO add your handling code here:
        Integer CNNumEnsambladores = Integer.parseInt(CNNumEnsambladoresReadLabel.getText());
        if (CNNumEnsambladores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() - 1);
            this.CNNumEnsambladoresReadLabel.setText(String.valueOf(CNNumEnsambladores -1));
        }
    }//GEN-LAST:event_CNMinusEnsambladoresReadButton6ActionPerformed

    private void CNPlusEnsambladoresReadButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPlusEnsambladoresReadButton6ActionPerformed
        // TODO add your handling code here:
        Integer CNNumEnsambladores = Integer.parseInt(CNNumEnsambladoresReadLabel.getText());
        if (this.CN.getGuardarTrabajadoresTotales()>= this.CN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.CN.setGuardarTrabajadoresTotales(this.CN.getGuardarTrabajadoresTotales() + 1);
            this.CNNumEnsambladoresReadLabel.setText(String.valueOf(CNNumEnsambladores +1));}
    }//GEN-LAST:event_CNPlusEnsambladoresReadButton6ActionPerformed

    private void DNMinusDeadLineReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusDeadLineReadButton2ActionPerformed
        // TODO add your handling code here:
        Integer DNDeadLine = Integer.parseInt(DNDeadLineReadLabel.getText());
        if (DNDeadLine == 1){
            JOptionPane.showMessageDialog(this, "El dia de entrega no puede ser menor a 1");
        } else {

        this.DNDeadLineReadLabel.setText(String.valueOf(DNDeadLine - 1));
        }
    }//GEN-LAST:event_DNMinusDeadLineReadButton2ActionPerformed

    private void DNPlusDeadLineReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusDeadLineReadButton2ActionPerformed
        // TODO add your handling code here:
        Integer DNDeadLine = Integer.parseInt(DNDeadLineReadLabel.getText());
        this.DNDeadLineReadLabel.setText(String.valueOf(DNDeadLine + 1));
    }//GEN-LAST:event_DNPlusDeadLineReadButton2ActionPerformed

    private void DNMinusGuionReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusGuionReadButton3ActionPerformed
        // TODO add your handling code here:
        Integer DNNumGuionistas = Integer.parseInt(DNNumGuionistasReadLabel.getText());
        if (DNNumGuionistas == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumGuionistasReadLabel.setText(String.valueOf(DNNumGuionistas -1));
        }
    }//GEN-LAST:event_DNMinusGuionReadButton3ActionPerformed

    private void DNPlusGuionReadButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusGuionReadButton2ActionPerformed
        // TODO add your handling code here:
        Integer DNNumGuionistas = Integer.parseInt(DNNumGuionistasReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumGuionistasReadLabel.setText(String.valueOf(DNNumGuionistas +1));
        }
    }//GEN-LAST:event_DNPlusGuionReadButton2ActionPerformed

    private void DNMinusAnimadoresReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusAnimadoresReadButton3ActionPerformed
        // TODO add your handling code here:
        Integer DNNumAnimadores = Integer.parseInt(DNNumAnimadoresReadLabel.getText());
        if (DNNumAnimadores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumAnimadoresReadLabel.setText(String.valueOf(DNNumAnimadores -1));
        }
    }//GEN-LAST:event_DNMinusAnimadoresReadButton3ActionPerformed

    private void DNPlusAnimadoresReadButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusAnimadoresReadButton3ActionPerformed
        // TODO add your handling code here:
        Integer DNNumAnimadores = Integer.parseInt(DNNumAnimadoresReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumAnimadoresReadLabel.setText(String.valueOf(DNNumAnimadores +1));
        }
    }//GEN-LAST:event_DNPlusAnimadoresReadButton3ActionPerformed

    private void DNMinusDobladoresReadButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusDobladoresReadButton4ActionPerformed
        // TODO add your handling code here:
        Integer DNNumDobladores = Integer.parseInt(DNNumDobladoresReadLabel.getText());
         if (DNNumDobladores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumDobladoresReadLabel.setText(String.valueOf(DNNumDobladores -1));
        }
        
    }//GEN-LAST:event_DNMinusDobladoresReadButton4ActionPerformed

    private void DNPlusDobladoresReadButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusDobladoresReadButton4ActionPerformed
        // TODO add your handling code here:
        Integer DNNumDobladores = Integer.parseInt(DNNumDobladoresReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumDobladoresReadLabel.setText(String.valueOf(DNNumDobladores +1));
        }
    }//GEN-LAST:event_DNPlusDobladoresReadButton4ActionPerformed

    private void DNMinusEscenografosReadButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusEscenografosReadButton5ActionPerformed
        // TODO add your handling code here:
        Integer DNNumEscenografos = Integer.parseInt(DNNumEscenografosReadLabel.getText());
         if (DNNumEscenografos == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumEscenografosReadLabel.setText(String.valueOf(DNNumEscenografos -1));
        }
        
    }//GEN-LAST:event_DNMinusEscenografosReadButton5ActionPerformed

    private void DNPlusEscenografosReadButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusEscenografosReadButton5ActionPerformed
        // TODO add your handling code here:
        Integer DNNumEscenografos = Integer.parseInt(DNNumEscenografosReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumEscenografosReadLabel.setText(String.valueOf(DNNumEscenografos +1));
        }
    }//GEN-LAST:event_DNPlusEscenografosReadButton5ActionPerformed

    private void DNMinusPlotwistersReadButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusPlotwistersReadButton6ActionPerformed
        // TODO add your handling code here:
        Integer DNNumPlotwisters = Integer.parseInt(DNNumPlotwistersReadLabel.getText());
         if (DNNumPlotwisters == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumPlotwistersReadLabel.setText(String.valueOf(DNNumPlotwisters -1));
        }
    }//GEN-LAST:event_DNMinusPlotwistersReadButton6ActionPerformed

    private void DNPlusPlotwistersReadButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusPlotwistersReadButton6ActionPerformed
        // TODO add your handling code here:
        Integer DNNumPlotwisters = Integer.parseInt(DNNumPlotwistersReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumPlotwistersReadLabel.setText(String.valueOf(DNNumPlotwisters +1));
        }
    }//GEN-LAST:event_DNPlusPlotwistersReadButton6ActionPerformed

    private void DNMinusEnsambladoresReadButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusEnsambladoresReadButton7ActionPerformed
        // TODO add your handling code here:
        Integer DNNumEnsambladores = Integer.parseInt(DNNumEnsambladoresReadLabel.getText());
        if (DNNumEnsambladores == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() - 1);
        this.DNNumEnsambladoresReadLabel.setText(String.valueOf(DNNumEnsambladores -1));
        }
    }//GEN-LAST:event_DNMinusEnsambladoresReadButton7ActionPerformed

    private void DNPlusEnsambladoresReadButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusEnsambladoresReadButton7ActionPerformed
        // TODO add your handling code here:
        Integer DNNumEnsambladores = Integer.parseInt(DNNumEnsambladoresReadLabel.getText());
        if (this.DN.getGuardarTrabajadoresTotales()>= this.DN.getTrabajadoresTotalesMax()){
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
        this.DN.setGuardarTrabajadoresTotales(this.DN.getGuardarTrabajadoresTotales() + 1);
        this.DNNumEnsambladoresReadLabel.setText(String.valueOf(DNNumEnsambladores +1));
        }
    }//GEN-LAST:event_DNPlusEnsambladoresReadButton7ActionPerformed

    private void DNPlusEnsmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusEnsmButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.DN.getAssembler().setAssemblerquantity(this.DN.getAssembler().getAssemblerquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumEnsambladoresLabel.setText(String.valueOf(this.DN.getAssembler().getAssemblerquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_DNPlusEnsmButtonActionPerformed

    private void DNMinusEnsmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusEnsmButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getAssembler().getAssemblerquantity()== 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getAssembler().setAssemblerquantity(this.DN.getAssembler().getAssemblerquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumEnsambladoresLabel.setText(String.valueOf(this.DN.getAssembler().getAssemblerquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusEnsmButtonActionPerformed

    private void DNPlusPltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusPltButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.DN.getPlotwisters().setDevelopersquantity(this.DN.getPlotwisters().getDevelopersquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumPlotwistersLabel.setText(String.valueOf(this.DN.getPlotwisters().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_DNPlusPltButtonActionPerformed

    private void DNMinusPltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusPltButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getPlotwisters().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getPlotwisters().setDevelopersquantity(this.DN.getPlotwisters().getDevelopersquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumPlotwistersLabel.setText(String.valueOf(this.DN.getPlotwisters().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusPltButtonActionPerformed

    private void DNPlusEcsnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusEcsnButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.DN.getEscenografos().setDevelopersquantity(this.DN.getEscenografos().getDevelopersquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumEscenografosLabel.setText(String.valueOf(this.DN.getEscenografos().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_DNPlusEcsnButtonActionPerformed

    private void DNMinusEscnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusEscnButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getEscenografos().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getEscenografos().setDevelopersquantity(this.DN.getEscenografos().getDevelopersquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumEscenografosLabel.setText(String.valueOf(this.DN.getEscenografos().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusEscnButtonActionPerformed

    private void DNPlusDoblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusDoblButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        } else {
            this.DN.getDobladores().setDevelopersquantity(this.DN.getDobladores().getDevelopersquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumDobladoresLabel.setText(String.valueOf(this.DN.getDobladores().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNPlusDoblButtonActionPerformed

    private void DNMinusDoblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusDoblButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getDobladores().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getDobladores().setDevelopersquantity(this.DN.getDobladores().getDevelopersquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumDobladoresLabel.setText(String.valueOf(this.DN.getDobladores().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusDoblButtonActionPerformed

    private void DNPlusAnimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusAnimButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
            this.DN.getAnimadores().setDevelopersquantity(this.DN.getAnimadores().getDevelopersquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumAnimadoresLabel.setText(String.valueOf(this.DN.getAnimadores().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));}
    }//GEN-LAST:event_DNPlusAnimButtonActionPerformed

    private void DNMinusAnimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusAnimButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getAnimadores().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getAnimadores().setDevelopersquantity(this.DN.getAnimadores().getDevelopersquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumAnimadoresLabel.setText(String.valueOf(this.DN.getAnimadores().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusAnimButtonActionPerformed

    private void DNPlusGuionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNPlusGuionButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getTrabajadoresTotales() >= this.DN.getTrabajadoresTotalesMax()) {
            JOptionPane.showMessageDialog(this, "Has superado el limite de trabajadores");
        }
        else {
            this.DN.getGuionistas().setDevelopersquantity(this.DN.getGuionistas().getDevelopersquantity()+1);
            this.DN.actTotalTrabajadores();
            this.DNNumGuionistasLabel.setText(String.valueOf(this.DN.getGuionistas().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNPlusGuionButtonActionPerformed

    private void DNMinusGuionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNMinusGuionButtonActionPerformed
        // TODO add your handling code here:
        if (this.DN.getGuionistas().getDevelopersquantity() == 1){
            JOptionPane.showMessageDialog(this, "Cada Rol debe tener al menos un trabajador");
        } else {
            this.DN.getGuionistas().setDevelopersquantity(this.DN.getGuionistas().getDevelopersquantity()-1);
            this.DN.actTotalTrabajadores();
            this.DNNumGuionistasLabel.setText(String.valueOf(this.DN.getGuionistas().getDevelopersquantity()));
            DNNumWorkersLabel.setText(String.valueOf(this.DN.getTrabajadoresTotales()));
        }
    }//GEN-LAST:event_DNMinusGuionButtonActionPerformed

    private void durationDayLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationDayLabelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_durationDayLabelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CNAnimDispoLabels;
    private javax.swing.JLabel CNBeneficiosLabel;
    private javax.swing.JLabel CNCapDispoLabel;
    private javax.swing.JLabel CNCapPlotDispo;
    private javax.swing.JLabel CNDeadLineReadLabel;
    private javax.swing.JLabel CNDescuentoPMLabel;
    private javax.swing.JLabel CNDiasEntregaLabel;
    private javax.swing.JLabel CNDirectorStateLabel;
    private javax.swing.JLabel CNDoblDispoLabel;
    private javax.swing.JLabel CNEscnDispoLabel;
    private javax.swing.JLabel CNFaltasPMlabel;
    private javax.swing.JLabel CNGastosLabel;
    private javax.swing.JLabel CNGuionesDispoLabel;
    private javax.swing.JLabel CNImageLabel;
    private javax.swing.JLabel CNIngresosLabel;
    private javax.swing.JButton CNMinusAnimButton;
    private javax.swing.JButton CNMinusAnimadoresReadButton2;
    private javax.swing.JButton CNMinusDeadLineReadButton1;
    private javax.swing.JButton CNMinusDoblButton;
    private javax.swing.JButton CNMinusDobladoresReadButton3;
    private javax.swing.JButton CNMinusEnsambladoresReadButton6;
    private javax.swing.JButton CNMinusEnsmButton;
    private javax.swing.JButton CNMinusEscenografosReadButton4;
    private javax.swing.JButton CNMinusEscnButton;
    private javax.swing.JButton CNMinusGuionButton;
    private javax.swing.JButton CNMinusGuionReadButton1;
    private javax.swing.JButton CNMinusPlotwistersReadButton5;
    private javax.swing.JButton CNMinusPltButton;
    private javax.swing.JLabel CNNumAnimadoresLabel;
    private javax.swing.JLabel CNNumAnimadoresReadLabel;
    private javax.swing.JLabel CNNumDobladoresLabel;
    private javax.swing.JLabel CNNumDobladoresReadLabel;
    private javax.swing.JLabel CNNumEnsambladoresLabel;
    private javax.swing.JLabel CNNumEnsambladoresReadLabel;
    private javax.swing.JLabel CNNumEscenografosLabel;
    private javax.swing.JLabel CNNumEscenografosReadLabel;
    private javax.swing.JLabel CNNumGuionistasLabel;
    private javax.swing.JLabel CNNumGuionistasReadLabel;
    private javax.swing.JLabel CNNumPlotwistersLabel;
    private javax.swing.JLabel CNNumPlotwistersReadLabel;
    private javax.swing.JLabel CNNumWorkersLabel;
    private javax.swing.JLabel CNPMStateLabel;
    private javax.swing.JLabel CNPlotDispoLabel;
    private javax.swing.JButton CNPlusAnimButton;
    private javax.swing.JButton CNPlusAnimadoresReadButton2;
    private javax.swing.JButton CNPlusDeadLineReadButton1;
    private javax.swing.JButton CNPlusDoblButton;
    private javax.swing.JButton CNPlusDobladoresReadButton3;
    private javax.swing.JButton CNPlusEcsnButton;
    private javax.swing.JButton CNPlusEnsambladoresReadButton6;
    private javax.swing.JButton CNPlusEnsmButton;
    private javax.swing.JButton CNPlusEscenografosReadButton4;
    private javax.swing.JButton CNPlusGuionButton;
    private javax.swing.JButton CNPlusGuionReadButton1;
    private javax.swing.JButton CNPlusPlotwistersReadButton5;
    private javax.swing.JButton CNPlusPltButton;
    private javax.swing.JLabel DNAnimDispoLabels;
    private javax.swing.JLabel DNBeneficiosLabel;
    private javax.swing.JLabel DNCapDispoLabel;
    private javax.swing.JLabel DNCapPlotDispo;
    private javax.swing.JLabel DNDeadLineReadLabel;
    private javax.swing.JLabel DNDescuentoPMLabel;
    private javax.swing.JLabel DNDiasEntregaLabel;
    private javax.swing.JLabel DNDirectorStateLabel;
    private javax.swing.JLabel DNDoblDispoLabel;
    private javax.swing.JLabel DNEscnDispoLabel;
    private javax.swing.JLabel DNFaltasPMlabel;
    private javax.swing.JLabel DNGastosLabel;
    private javax.swing.JLabel DNGuionesDispoLabel;
    private javax.swing.JLabel DNIngresosLabel;
    private javax.swing.JButton DNMinusAnimButton;
    private javax.swing.JButton DNMinusAnimadoresReadButton3;
    private javax.swing.JButton DNMinusDeadLineReadButton2;
    private javax.swing.JButton DNMinusDoblButton;
    private javax.swing.JButton DNMinusDobladoresReadButton4;
    private javax.swing.JButton DNMinusEnsambladoresReadButton7;
    private javax.swing.JButton DNMinusEnsmButton;
    private javax.swing.JButton DNMinusEscenografosReadButton5;
    private javax.swing.JButton DNMinusEscnButton;
    private javax.swing.JButton DNMinusGuionButton;
    private javax.swing.JButton DNMinusGuionReadButton3;
    private javax.swing.JButton DNMinusPlotwistersReadButton6;
    private javax.swing.JButton DNMinusPltButton;
    private javax.swing.JLabel DNNumAnimadoresLabel;
    private javax.swing.JLabel DNNumAnimadoresReadLabel;
    private javax.swing.JLabel DNNumDobladoresLabel;
    private javax.swing.JLabel DNNumDobladoresReadLabel;
    private javax.swing.JLabel DNNumEnsambladoresLabel;
    private javax.swing.JLabel DNNumEnsambladoresReadLabel;
    private javax.swing.JLabel DNNumEscenografosLabel;
    private javax.swing.JLabel DNNumEscenografosReadLabel;
    private javax.swing.JLabel DNNumGuionistasLabel;
    private javax.swing.JLabel DNNumGuionistasReadLabel;
    private javax.swing.JLabel DNNumPlotwistersLabel;
    private javax.swing.JLabel DNNumPlotwistersReadLabel;
    private javax.swing.JLabel DNNumWorkersLabel;
    private javax.swing.JLabel DNPMStateLabel;
    private javax.swing.JLabel DNPlotDispoLabel;
    private javax.swing.JButton DNPlusAnimButton;
    private javax.swing.JButton DNPlusAnimadoresReadButton3;
    private javax.swing.JButton DNPlusDeadLineReadButton2;
    private javax.swing.JButton DNPlusDoblButton;
    private javax.swing.JButton DNPlusDobladoresReadButton4;
    private javax.swing.JButton DNPlusEcsnButton;
    private javax.swing.JButton DNPlusEnsambladoresReadButton7;
    private javax.swing.JButton DNPlusEnsmButton;
    private javax.swing.JButton DNPlusEscenografosReadButton5;
    private javax.swing.JButton DNPlusGuionButton;
    private javax.swing.JButton DNPlusGuionReadButton2;
    private javax.swing.JButton DNPlusPlotwistersReadButton6;
    private javax.swing.JButton DNPlusPltButton;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton WritterButton;
    private javax.swing.JTextField durationDayLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
