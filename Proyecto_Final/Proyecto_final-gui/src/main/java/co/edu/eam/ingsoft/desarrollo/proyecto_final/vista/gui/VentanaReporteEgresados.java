/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.gui;

/**
 *
 * @author TOSHIBAP55W
 */
public class VentanaReporteEgresados extends javax.swing.JFrame {

    /**
     * Creates new form VentanaReporteEgresados
     */
    public VentanaReporteEgresados() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo1 = new javax.swing.JLabel();
        jLTitulo2 = new javax.swing.JLabel();
        jCBSituacionReporte = new javax.swing.JComboBox();
        jBInicio = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de Egresados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo1.setText("Egresados por situacion actual:");
        getContentPane().add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLTitulo2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setText("REPORTE DE EGRESADOS");
        getContentPane().add(jLTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        getContentPane().add(jCBSituacionReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 320, 40));

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-inicio.jpg"))); // NOI18N
        jBInicio.setText("INICIO");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 140, 60));

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-Buscar.png"))); // NOI18N
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 90, 60));

        jPanelDatos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1000, 440));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        VentanaPrincipal principal = new VentanaPrincipal(3);
        principal.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         VentanaPrincipal principal = new VentanaPrincipal(3);
        this.dispose();
        principal.setVisible(true);
       
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox jCBSituacionReporte;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanelDatos;
    // End of variables declaration//GEN-END:variables
}
