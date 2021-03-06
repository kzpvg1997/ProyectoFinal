/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.gui;

import java.util.List;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorContacto;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorEmpresa;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorSectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.SectorLaboralEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;

/**
 *
 * @author TOSHIBAP55W
 */
public class VentanaEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpresa
     */
	private ControladorEmpresa conEmp;
	private ControladorSectorEmpresa conSector;
	private ControladorContacto conContac;
	
    public VentanaEmpresa(Empresa emp,int tipo,Contacto cont) {
    	super();
    	try{
    	if(emp==null){
    		if(tipo==0){
    			initComponents();
    	        jTPPestanasEmpresa.setEnabledAt(1, false);
    	        this.setLocationRelativeTo(null);
    	        this.setResizable(false);
    	        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	        jTFFax.setText("00");
    	        conEmp = new ControladorEmpresa();
    	        conSector = new ControladorSectorEmpresa();
    	        conContac = new ControladorContacto();
    	        cargarComboEmpresa();
    	        cargarComboSectoresEmpresa();
				cargarDepartamentos();
				cargarCiudades();
				jBEditarmpresa.setEnabled(false);
				jCBCiudad.setEnabled(false);
    		}
    	}else{
    		initComponents();
    		this.setLocationRelativeTo(null);
	        this.setResizable(false);
	        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	        conEmp = new ControladorEmpresa();
	        conSector = new ControladorSectorEmpresa();
	        conContac = new ControladorContacto();
	        cargarComboEmpresa();
	        cargarComboSectoresEmpresa();
			cargarDepartamentos();
			cargarCiudades();
			jTFNit.enable(false);
			jCBCiudad.setEnabled(false);
			jBRegistrarEmpresa.setEnabled(false);
			
			/*Datos Empresa*/
			jTFRazonSocial.setText(emp.getRazonSocial());
			jTFNit.setText(emp.getNit()+"");
			jTFNombreEmpresa.setText(emp.getNombreEmpresa());
			jCBTipoEmpresa.setSelectedItem(emp.getTipoEmpresa());
			jCBSectorLaboral.setSelectedItem(emp.getSector());
			jCBCiudad.setSelectedItem(emp.getCiudad());
			jCBDepartamento.setSelectedItem(emp.getDepartamento());
			jTFDireccion.setText(emp.getDireccion());
			jTFTelefono.setText(emp.getTelefono());
			jTFFax.setText(emp.getFax());
			jTFSitioWeb.setText(emp.getCitioWeb());
			
			/*Datos del contacto*/
			
			jTFNombreContacto.setText(cont.getNombre());
			jTFCargoContacto.setText(cont.getCargo());
			jTFCorreoContacto.setText(cont.getCorreo());
			jTFTelefonoContacto.setText(cont.getTelefono());
    	}
    	
		
    	} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLTitulo1 = new javax.swing.JLabel();
        jLTitulo2 = new javax.swing.JLabel();
        jLTitulo4 = new javax.swing.JLabel();
        jLPaso = new javax.swing.JLabel();
        jLTitulo5 = new javax.swing.JLabel();
        jTPPestanasEmpresa = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTFNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBDepartamento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFFax = new javax.swing.JTextField();
        jTFRazonSocial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCBCiudad = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jCBTipoEmpresa = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTFSitioWeb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCBSectorLaboral = new javax.swing.JComboBox();
        jBCancelar = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTFNombreEmpresa = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTFCorreoContacto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTFNombreContacto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTFCargoContacto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTFTelefonoContacto = new javax.swing.JTextField();
        jBCancelar2 = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBRegistrarEmpresa = new javax.swing.JButton();
        jBEditarmpresa = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventana Empresas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoEmpresa.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 280, 170));

        jLTitulo1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo1.setText("EMPRESAS");
        getContentPane().add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLTitulo2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo2.setText("REGISTRO DE");
        getContentPane().add(jLTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLTitulo4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo4.setText("Paso");
        getContentPane().add(jLTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLPaso.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLPaso.setForeground(new java.awt.Color(255, 255, 255));
        jLPaso.setText("1");
        getContentPane().add(jLPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        jLTitulo5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo5.setText("/2");
        getContentPane().add(jLTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        jTPPestanasEmpresa.setForeground(new java.awt.Color(0, 204, 255));
        jTPPestanasEmpresa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Razon Social:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(jTFNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 346, 33));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de empresa:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jCBDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Departamento" }));
        jCBDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBDepartamentoItemStateChanged(evt);
            }
        });
        jPanel1.add(jCBDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 250, 33));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, -1));
        jPanel1.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 346, 33));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FAX:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));
        jPanel1.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 310, 33));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Direccion sitio Web:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, -1, -1));
        jPanel1.add(jTFFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 346, 30));
        jPanel1.add(jTFRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 346, 33));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIT:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ciudad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        jCBCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ciudad" }));
        jPanel1.add(jCBCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 250, 33));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Departamento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jPanel1.add(jCBTipoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 290, 33));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de Empresa");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel1.add(jTFSitioWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 340, 33));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sector laboral:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jPanel1.add(jCBSectorLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 290, 33));

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jBCancelar.setText("X         CANCELAR");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 180, 40));

        jBSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jBSiguiente.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBSiguiente.setForeground(new java.awt.Color(255, 0, 0));
        jBSiguiente.setText("SIGUIENTE      >");
        jBSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSiguienteMouseClicked(evt);
            }
        });
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(jBSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 180, 40));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Direccion:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));
        jPanel1.add(jTFNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 310, 33));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 570));

        jTPPestanasEmpresa.addTab("1.Datos de la Empresa", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Correo Electronico:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));
        jPanel2.add(jTFCorreoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 346, 33));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre completo:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        jPanel2.add(jTFNombreContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 346, 33));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cargo de la empresa:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));
        jPanel2.add(jTFCargoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 346, 33));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telefono:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));
        jPanel2.add(jTFTelefonoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 346, 33));

        jBCancelar2.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar2.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBCancelar2.setForeground(new java.awt.Color(255, 0, 0));
        jBCancelar2.setText("X         CANCELAR");
        jBCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jBCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 180, 40));

        jBAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jBAnterior.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBAnterior.setForeground(new java.awt.Color(255, 0, 0));
        jBAnterior.setText("<       ANTERIOR");
        jBAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAnteriorMouseClicked(evt);
            }
        });
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });
        jPanel2.add(jBAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 180, 40));

        jBRegistrarEmpresa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jBRegistrarEmpresa.setForeground(new java.awt.Color(255, 0, 0));
        jBRegistrarEmpresa.setText("< REGISTRAR >");
        jBRegistrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarEmpresaActionPerformed(evt);
            }
        });
        jPanel2.add(jBRegistrarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 190, 40));

        jBEditarmpresa.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jBEditarmpresa.setForeground(new java.awt.Color(255, 0, 0));
        jBEditarmpresa.setText("< EDITAR >");
        jBEditarmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarmpresaActionPerformed(evt);
            }
        });
        jPanel2.add(jBEditarmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 190, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1110, 570));

        jTPPestanasEmpresa.addTab("2.Datos de Contacto", jPanel2);

        getContentPane().add(jTPPestanasEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1110, 610));

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-inicio.jpg"))); // NOI18N
        jBInicio.setText("INICIO");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 140, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCancelar2;
    private javax.swing.JButton jBEditarmpresa;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBRegistrarEmpresa;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JComboBox jCBCiudad;
    private javax.swing.JComboBox jCBDepartamento;
    private javax.swing.JComboBox jCBSectorLaboral;
    private javax.swing.JComboBox jCBTipoEmpresa;
    private javax.swing.JLabel jLPaso;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLTitulo2;
    private javax.swing.JLabel jLTitulo4;
    private javax.swing.JLabel jLTitulo5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFCargoContacto;
    private javax.swing.JTextField jTFCorreoContacto;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFFax;
    private javax.swing.JTextField jTFNit;
    private javax.swing.JTextField jTFNombreContacto;
    private javax.swing.JTextField jTFNombreEmpresa;
    private javax.swing.JTextField jTFRazonSocial;
    private javax.swing.JTextField jTFSitioWeb;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefonoContacto;
    private javax.swing.JTabbedPane jTPPestanasEmpresa;
    // End of variables declaration//GEN-END:variables


    
    private void jBSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSiguienteMouseClicked
        jLPaso.setText("2");
        jTPPestanasEmpresa.setEnabledAt(0, false);
        jTPPestanasEmpresa.setEnabledAt(1, true);
        jTPPestanasEmpresa.setSelectedIndex(1);

    }//GEN-LAST:event_jBSiguienteMouseClicked

    private void jBAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseClicked
        jLPaso.setText("1");
        jTPPestanasEmpresa.setEnabledAt(0, true);
        jTPPestanasEmpresa.setEnabledAt(1, false);
        jTPPestanasEmpresa.setSelectedIndex(0);

    }//GEN-LAST:event_jBAnteriorMouseClicked

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        VentanaPrincipal principal = new VentanaPrincipal(1);
        principal.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     
        VentanaPrincipal principal = new VentanaPrincipal(1);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
    	limpiarCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed
    try{
    String razonSocial = jTFRazonSocial.getText();
	int nit = Integer.parseInt(jTFNit.getText());
	TipoEmpresaEnum tipoEmpresa = (TipoEmpresaEnum)jCBTipoEmpresa.getSelectedItem();
	SectorEmpresa sectorLaboral = (SectorEmpresa)jCBSectorLaboral.getSelectedItem();
	Ciudad ciudad = (Ciudad)jCBCiudad.getSelectedItem();
	Departamento departamento = (Departamento)jCBDepartamento.getSelectedItem();
	String direccion = jTFDireccion.getText();
	String telefono = jTFTelefono.getText();
	String fax = jTFFax.getText();
	String sitioWeb =jTFSitioWeb.getText();
	
	if(jTFNit.getText().length()>=11){
		JOptionPane.showMessageDialog(null, "El NIT dela empresa es demasiado extenso (NO VALIDO)","INGRESE",JOptionPane.WARNING_MESSAGE);
	}else{
		if(jTFRazonSocial.getText().isEmpty()||jTFNit.getText().isEmpty()||jTFDireccion.getText().isEmpty()||jTFTelefono.getText().isEmpty()
				|| jTFFax.getText().isEmpty()||jTFSitioWeb.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos","INGRESE",JOptionPane.WARNING_MESSAGE);
		}
	}
    }catch (NumberFormatException exc){
    	JOptionPane.showMessageDialog(null, "Verifique que el NIT de la empresa solo contenga valores numericos","ERROR",JOptionPane.ERROR_MESSAGE);
    }catch (Exception e) {
		// TODO: handle exception
    	e.printStackTrace();
	}
    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void jBCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelar2ActionPerformed
    	limpiarCampos();
    	jLPaso.setText("1");
        jTPPestanasEmpresa.setEnabledAt(0, true);
        jTPPestanasEmpresa.setEnabledAt(1, false);
        jTPPestanasEmpresa.setSelectedIndex(0);
    }//GEN-LAST:event_jBCancelar2ActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        jLPaso.setText("1");
        jTPPestanasEmpresa.setEnabledAt(0, true);
        jTPPestanasEmpresa.setEnabledAt(1, false);
        jTPPestanasEmpresa.setSelectedIndex(0);
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBRegistrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarEmpresaActionPerformed
       try{
    	/*Datos de la empresa*/
    	 String razonSocial = jTFRazonSocial.getText();
    	 String nombreEmpresa = jTFNombreEmpresa.getText();
		int nit = Integer.parseInt(jTFNit.getText());
		TipoEmpresaEnum tipoEmpresa = (TipoEmpresaEnum)jCBTipoEmpresa.getSelectedItem();
		SectorEmpresa sectorLaboral = (SectorEmpresa)jCBSectorLaboral.getSelectedItem();
		Ciudad ciudad = (Ciudad)jCBCiudad.getSelectedItem();
		Departamento departamento = (Departamento)jCBDepartamento.getSelectedItem();
		String direccion = jTFDireccion.getText();
		String telefono = jTFTelefono.getText();
		String fax = jTFFax.getText();
		String sitioWeb =jTFSitioWeb.getText();
    	/*Datos del contacto*/
    	String nombreContact = jTFNombreContacto.getText();
		String cargoContac = jTFCargoContacto.getText();
		String correoContact = jTFCorreoContacto.getText();
		String telefonoContact =jTFTelefonoContacto.getText();
		
		if(jTFNombreContacto.getText().isEmpty()||jTFCargoContacto.getText().isEmpty()||jTFCorreoContacto.getText().isEmpty()||
				jTFTelefonoContacto.getText().isEmpty()||jTFNombreEmpresa.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos","INGRESE",JOptionPane.WARNING_MESSAGE);
		}else{
			Empresa emp = new Empresa(nit, sectorLaboral, ciudad, razonSocial, tipoEmpresa, departamento, direccion,
					telefono, fax, sitioWeb,nombreEmpresa);
			conEmp.registrarEmpresa(emp);
			Contacto contacto = new Contacto(emp, nombreContact, cargoContac, correoContact, telefonoContact);
			conContac.registrarContacto(contacto);
			JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente","EXITO",JOptionPane.INFORMATION_MESSAGE);
			jTPPestanasEmpresa.setSelectedIndex(0);
			limpiarCampos();
		}
			
		}catch (ExcepcionNegocio ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException exc){
	    	JOptionPane.showMessageDialog(null, "Verifique que el NIT de la empresa solo contenga valores numericos","ERROR",JOptionPane.ERROR_MESSAGE);
	    }catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
       
		
    }//GEN-LAST:event_jBRegistrarEmpresaActionPerformed

    private void jBEditarmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarmpresaActionPerformed
    	 try{
    	    	/*Datos de la empresa*/
    	    	 String razonSocial = jTFRazonSocial.getText();
    	    	 String nombreEmpresa = jTFNombreEmpresa.getText();
    			int nit = Integer.parseInt(jTFNit.getText());
    			TipoEmpresaEnum tipoEmpresa = (TipoEmpresaEnum)jCBTipoEmpresa.getSelectedItem();
    			SectorEmpresa sectorLaboral = (SectorEmpresa)jCBSectorLaboral.getSelectedItem();
    			Ciudad ciudad = (Ciudad)jCBCiudad.getSelectedItem();
    			Departamento departamento = (Departamento)jCBDepartamento.getSelectedItem();
    			String direccion = jTFDireccion.getText();
    			String telefono = jTFTelefono.getText();
    			String fax = jTFFax.getText();
    			String sitioWeb =jTFSitioWeb.getText();
    	    	/*Datos del contacto*/
    	    	String nombreContact = jTFNombreContacto.getText();
    			String cargoContac = jTFCargoContacto.getText();
    			String correoContact = jTFCorreoContacto.getText();
    			String telefonoContact =jTFTelefonoContacto.getText();
    			
    			if(jTFNombreContacto.getText().isEmpty()||jTFCargoContacto.getText().isEmpty()||jTFCorreoContacto.getText().isEmpty()||
    					jTFTelefonoContacto.getText().isEmpty()||jTFNombreEmpresa.getText().isEmpty()){
    				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos","INGRESE",JOptionPane.WARNING_MESSAGE);
    			}else{
    				Empresa emp = new Empresa(nit, sectorLaboral, ciudad, razonSocial, tipoEmpresa, departamento, direccion,
    						telefono, fax, sitioWeb,nombreEmpresa);
    				conEmp.editarEmpresa(emp);
    				Contacto contacto = new Contacto(emp, nombreContact, cargoContac, correoContact, telefonoContact);
    				conContac.editarContacto(contacto);
    				JOptionPane.showMessageDialog(null, "Se ha Editado exitosamente","EXITO",JOptionPane.INFORMATION_MESSAGE);
    	
    			}
    				
    			}catch (ExcepcionNegocio ex){
    				JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
    			}catch (NumberFormatException exc){
    		    	JOptionPane.showMessageDialog(null, "Verifique que el NIT de la empresa solo contenga valores numericos","ERROR",JOptionPane.ERROR_MESSAGE);
    		    }catch (Exception e) {
    				// TODO: handle exception
    		    	e.printStackTrace();
    			}
    }//GEN-LAST:event_jBEditarmpresaActionPerformed

    private void jCBDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBDepartamentoItemStateChanged
    	try {
    			
    	jCBCiudad.setEnabled(true);	
    	jCBCiudad.removeAllItems();
    	Departamento departamento = (Departamento)jCBDepartamento.getSelectedItem();
        List<Ciudad> ciudades = conEmp.listarCiudadesPorDepartamento(departamento);
			for (Ciudad ciudad : ciudades) {
				jCBCiudad.addItem(ciudad);
			}
    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_jCBDepartamentoItemStateChanged


   

	public void cargarComboSectoresEmpresa() throws Exception {
	
		jCBSectorLaboral.removeAllItems();
		List<SectorEmpresa> lista = conSector.listarSectores();
		for (int i = 0; i < lista.size(); i++) {
			jCBSectorLaboral.addItem(lista.get(i));
		}
	}
	
	public void cargarComboEmpresa(){
		
		TipoEmpresaEnum tipoEmpresa []= TipoEmpresaEnum.values();
		for (TipoEmpresaEnum tipoEmpresaEnum : tipoEmpresa) {
			jCBTipoEmpresa.addItem(tipoEmpresaEnum);
		}
		
		
	}
	
	public void cargarCiudades() throws Exception{
		
		List<Ciudad> lista = conEmp.listarCiudades();
		for (int i = 0; i < lista.size(); i++) {
			jCBCiudad.addItem(lista.get(i));
		}
	}
	
	public void cargarDepartamentos() throws Exception{
		
		List<Departamento> lista = conEmp.listarDepartamentos();
		for (int i = 0; i < lista.size(); i++) {
			jCBDepartamento.addItem(lista.get(i));
		}
	}
        
	public void limpiarCampos(){
		
		/*Datos Empresa*/
		jTFRazonSocial.setText(null);
		jTFNombreEmpresa.setText(null);
		jTFNit.setText(null);
		jCBTipoEmpresa.setSelectedIndex(0);
		jCBSectorLaboral.setSelectedIndex(0);
		jCBCiudad.setSelectedIndex(0);
		jCBDepartamento.setSelectedIndex(0);
		jTFDireccion.setText(null);
		jTFTelefono.setText(null);
		jTFFax.setText("00");
		jTFSitioWeb.setText(null);
		
		/*Datos Contacto*/
		
		jTFNombreContacto.setText(null);
		jTFCargoContacto.setText(null);
		jTFCorreoContacto.setText(null);
		jTFTelefonoContacto.setText(null);
	}
	
}
