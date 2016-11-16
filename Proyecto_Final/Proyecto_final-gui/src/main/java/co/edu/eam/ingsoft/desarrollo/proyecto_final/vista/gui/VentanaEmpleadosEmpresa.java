/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.gui;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;

/**
 *
 * @author TOSHIBAP55W
 */
public class VentanaEmpleadosEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpleadosEmpresa
     */
	
	private ControladorEmpresa conEmp;
	
    public VentanaEmpleadosEmpresa() {
        initComponents();
          this.setLocationRelativeTo(null);
           setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            this.setResizable(false);
            conEmp = new ControladorEmpresa();
         
            try {
				cargarComboEmpresas();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo2 = new javax.swing.JLabel();
        jCBEmpresaReporte = new javax.swing.JComboBox();
        jBInicio = new javax.swing.JButton();
        jLTitulo3 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEmpleadosEmpresa = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados por Empresa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setText("EMPLEADOS POR EMPRESA");
        getContentPane().add(jLTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jCBEmpresaReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 40));

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-inicio.jpg"))); // NOI18N
        jBInicio.setText("INICIO");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 140, 60));

        jLTitulo3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo3.setText("Empresa :");
        getContentPane().add(jLTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-Buscar.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 90, 60));

        jTablaEmpleadosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Nombre", "Programa", "Cargo", "Fecha de entrada"
            }
        ));
        jScrollPane1.setViewportView(jTablaEmpleadosEmpresa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 240, 690, 160));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox jCBEmpresaReporte;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLTitulo3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaEmpleadosEmpresa;
    // End of variables declaration//GEN-END:variables
    
    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        VentanaPrincipal principal = new VentanaPrincipal(3);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       VentanaPrincipal principal = new VentanaPrincipal(3);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    public void cargarComboEmpresas()throws Exception{
    	jCBEmpresaReporte.removeAllItems();
    	List<Empresa> lista = conEmp.listarEmpresas();
    	for (int i = 0; i < lista.size(); i++) {
			jCBEmpresaReporte.addItem(lista.get(i));
		}
    }
    
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
       
    	Empresa empresa = (Empresa)jCBEmpresaReporte.getSelectedItem();
    	cargarEmpleadosEmpresa(empresa);
    }//GEN-LAST:event_jBBuscarActionPerformed
    

    public void cargarEmpleadosEmpresa(Empresa empresa){
    	try {
    		DefaultTableModel table = (DefaultTableModel) jTablaEmpleadosEmpresa.getModel();
    		table.setRowCount(0);
    		List<InfoLaboralEgresado> egresados = conEmp.listarEgresadosEmpresa(empresa);
    		if(egresados.size() > 0){
				for (InfoLaboralEgresado infoEg : egresados) {
					table.addRow(new Object[]{infoEg.getIdEmpresa().getNombreEmpresa(),infoEg.getIdEgresado().getNombre(),infoEg.getCargoEmpresa(),infoEg.getFechaIngreso()});
				}
    		}
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
