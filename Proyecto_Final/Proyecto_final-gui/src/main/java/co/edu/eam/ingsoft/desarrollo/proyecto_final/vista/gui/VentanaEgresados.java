/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.gui;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;
import java.util.List;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorEducacionEgresado;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorEgresado;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorEmpresa;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorFacultad;
import co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores.ControladorPrograma;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.GeneroEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.NivelEducativoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.SituacionActualEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoCorreoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoDocumentoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoTelefonoEnum;

/**
 *
 * @author TOSHIBAP55W
 */
public class VentanaEgresados extends javax.swing.JFrame {

	/**
	 * Creates new form VentanaEgresados
	 */
	private ControladorFacultad conFac;
	private ControladorEgresado conEgre;
	private ControladorPrograma conProg;
	private ControladorEducacionEgresado conEduEgre;
	private ControladorEmpresa conEmp;
	private int tipoSeleccion;
	
	public VentanaEgresados(Egresado eg,int tipo,EducacionEgresado eduEgre,InfoLaboralEgresado inf) {
		super();
		try {
			if(eg==null){
				if(tipo==0){
				initComponents();
				tipoSeleccion=0;
				jTPPestanas.setEnabledAt(1, false);
				jLPaso.setText("1");
				this.setLocationRelativeTo(null);
				this.setResizable(false);
				setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				conFac = new ControladorFacultad();
				conEgre = new ControladorEgresado();
				conProg = new ControladorPrograma();
				conEduEgre = new ControladorEducacionEgresado();
				conEmp = new ControladorEmpresa();
				cargarCombos();
				cargarComboFacultades();
				cargarComboProgramas();
				cargarComboEmpresas();
				jBEditarEgresado.setEnabled(false);
				jBEditarInfoLaboral.setEnabled(false);
				jTFPrefijo.setText("00");
				jTFExtension.setText("00");
				}
				}else{
					
					initComponents();
					jLPaso.setText("1");
					this.setLocationRelativeTo(null);
					this.setResizable(false);
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
					conFac = new ControladorFacultad();
					conEgre = new ControladorEgresado();
					conProg = new ControladorPrograma();
					conEmp = new ControladorEmpresa();
					conEduEgre = new ControladorEducacionEgresado();
					cargarCombos();
					cargarComboFacultades();
					cargarComboProgramas();
					cargarComboEmpresas();
					jBEditarEgresado.setEnabled(true);
					jBRegistrarEgresado.setEnabled(false);
					jBRegistrarInformacionAdicional.setEnabled(false);
					jBEditarInfoLaboral.setEnabled(true);
					jTFIDEgresado.enable(false);
					tipoSeleccion=1;
					/*Datos del egresado*/
					jTFNumeroDocumento.enable(false);
					jTFNombres.setText(eg.getNombre());
					jTFPrimerApellido.setText(eg.getPrimerApellido());
					jTFSegundoApellido.setText(eg.getSegundoApellido());
					jTFPrefijo.setText(eg.getPrefijo()+"");
					jTFNumero.setText(eg.getNumeroTel()+"");
					jTFExtension.setText(eg.getExtension()+"");
					jCBTipoDocumento.setSelectedItem(eg.getTipoDocumento());
					jTFNumeroDocumento.setText(eg.getId()+"");
					jCBGenero.setSelectedItem(eg.getGenero());
					jCBTipoTelefono.setSelectedItem(eg.getTipoTel());
					jTFCorreoElectronico.setText(eg.getCorreo());
					jCBTipoCorreo.setSelectedItem(eg.getTipoCorreo());
					/*Educacion Egresado*/
					jCBFacultad.setSelectedItem(eduEgre.getFacultad());
					jCBPrograma.setSelectedItem(eg.getIdPrograma());
					jCBNivelEducativo.setSelectedItem(eduEgre.getNivelEducativo());
					jTFNivelAcademico.setText(eduEgre.getNivelAcademico());
					jYCAnio.setYear(eduEgre.getAnio());
					jMCMes.setMonth(eduEgre.getMes());
					jTFNumeroDiploma.setText(eduEgre.getNumeroDiploma()+"");
					/*Info adicional egresado*/
					if(inf!=null){
						jTFIDEgresado.setText(inf.getIdEgresado().getId()+"");
				    	jTFSectorLaboral.setText(inf.getSectorLaboral());
				    	jTFCargoEmpresa.setText(inf.getCargoEmpresa());
				    	jCBSituacionActual.setSelectedItem(inf.getSituacionActual());
				    	jCBTipoEmpresa.setSelectedItem(inf.getTipoempresa());
				    	jCBEmpresa.setSelectedItem(inf.getIdEmpresa());
				    	jCalendarIngreso.setDate(inf.getFechaIngreso());
				    	jCalendarSalida.setDate(inf.getFechaSalida());
				    	
					}
					
					
				}
				
		}catch (Exception e) {
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
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLTitulo1 = new javax.swing.JLabel();
        jLPaso = new javax.swing.JLabel();
        jLIcono = new javax.swing.JLabel();
        jTPPestanas = new javax.swing.JTabbedPane();
        jPDatosPersonales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFPrimerApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFSegundoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBTipoDocumento = new javax.swing.JComboBox();
        jTFNumeroDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBGenero = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTFPrefijo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFExtension = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCBTipoTelefono = new javax.swing.JComboBox();
        jTFCorreoElectronico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCBTipoCorreo = new javax.swing.JComboBox();
        jBSiguiente = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPEducacion = new javax.swing.JPanel();
        jBAnterior = new javax.swing.JButton();
        jBCancelar2 = new javax.swing.JButton();
        jTFNumeroDiploma = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTFNivelAcademico = new javax.swing.JTextField();
        jCBFacultad = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCBNivelEducativo = new javax.swing.JComboBox();
        jMCMes = new com.toedter.calendar.JMonthChooser();
        jYCAnio = new com.toedter.calendar.JYearChooser();
        jCBPrograma = new javax.swing.JComboBox();
        jBEditarEgresado = new javax.swing.JButton();
        jBRegistrarEgresado = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPInformacionAdicional = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCBSituacionActual = new javax.swing.JComboBox();
        jCBTipoEmpresa = new javax.swing.JComboBox();
        jTFSectorLaboral = new javax.swing.JTextField();
        jCalendarIngreso = new com.toedter.calendar.JCalendar();
        jCalendarSalida = new com.toedter.calendar.JCalendar();
        jTFCargoEmpresa = new javax.swing.JTextField();
        jBRegistrarInformacionAdicional = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTFIDEgresado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jBEditarInfoLaboral = new javax.swing.JButton();
        jCBEmpresa = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLTitulo3 = new javax.swing.JLabel();
        jLTitulo4 = new javax.swing.JLabel();
        jLTitulo5 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();

        setTitle("Ventana Egresados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo1.setText("REGISTRO DE");
        getContentPane().add(jLTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLPaso.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLPaso.setForeground(new java.awt.Color(255, 255, 255));
        jLPaso.setText("1");
        getContentPane().add(jLPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, -1));

        jLIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 350, 90));

        jTPPestanas.setBackground(new java.awt.Color(255, 255, 255));
        jTPPestanas.setForeground(new java.awt.Color(51, 204, 255));
        jTPPestanas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTPPestanas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTPPestanasStateChanged(evt);
            }
        });

        jPDatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");
        jPDatosPersonales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPDatosPersonales.add(jTFNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 346, 33));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Primer Apellido:");
        jPDatosPersonales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPDatosPersonales.add(jTFPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 346, 33));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segundo Apellido:");
        jPDatosPersonales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPDatosPersonales.add(jTFSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 346, 33));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de documento:");
        jPDatosPersonales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 28, -1, -1));

        jPDatosPersonales.add(jCBTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 59, 350, 33));
        jPDatosPersonales.add(jTFNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 149, 350, 33));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de documento:");
        jPDatosPersonales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 125, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genero:");
        jPDatosPersonales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 208, -1, -1));

        jPDatosPersonales.add(jCBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 239, 350, 33));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono de contacto:");
        jPDatosPersonales.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        jPDatosPersonales.add(jTFPrefijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 56, 33));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prefijo:");
        jPDatosPersonales.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero:");
        jPDatosPersonales.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));
        jPDatosPersonales.add(jTFNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 175, 33));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Extension:");
        jPDatosPersonales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));
        jPDatosPersonales.add(jTFExtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 117, 33));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de telefono:");
        jPDatosPersonales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 318, -1, -1));

        jPDatosPersonales.add(jCBTipoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 404, 350, 38));
        jPDatosPersonales.add(jTFCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 59, 324, 33));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo de correo:");
        jPDatosPersonales.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 125, -1, -1));

        jPDatosPersonales.add(jCBTipoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 149, 315, 33));

        jBSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jBSiguiente.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBSiguiente.setForeground(new java.awt.Color(255, 0, 0));
        jBSiguiente.setText("SIGUIENTE      >");
        jBSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSiguienteMouseClicked(evt);
            }
        });
        jPDatosPersonales.add(jBSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 180, 40));

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jBCancelar.setText("X         CANCELAR");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPDatosPersonales.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 40));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Correo Electronico:");
        jPDatosPersonales.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPDatosPersonales.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 570));

        jTPPestanas.addTab("1.Datos Personales", jPDatosPersonales);

        jPEducacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jBAnterior.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBAnterior.setForeground(new java.awt.Color(255, 0, 0));
        jBAnterior.setText("<       ANTERIOR");
        jBAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAnteriorMouseClicked(evt);
            }
        });
        jPEducacion.add(jBAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 180, 40));

        jBCancelar2.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar2.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jBCancelar2.setForeground(new java.awt.Color(255, 0, 0));
        jBCancelar2.setText("X         CANCELAR");
        jBCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelar2ActionPerformed(evt);
            }
        });
        jPEducacion.add(jBCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 40));
        jPEducacion.add(jTFNumeroDiploma, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 346, 33));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nivel academico del programa:");
        jPEducacion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Facultad:");
        jPEducacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Maximo nivel educativo:");
        jPEducacion.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Numero de diploma:");
        jPEducacion.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));
        jPEducacion.add(jTFNivelAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 346, 33));

        jPEducacion.add(jCBFacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, 33));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Programa:");
        jPEducacion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Fecha de grado:");
        jPEducacion.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jPEducacion.add(jCBNivelEducativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 350, 33));
        jPEducacion.add(jMCMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, -1, 30));
        jPEducacion.add(jYCAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 100, 30));

        jPEducacion.add(jCBPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 350, 33));

        jBEditarEgresado.setBackground(new java.awt.Color(255, 255, 255));
        jBEditarEgresado.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jBEditarEgresado.setForeground(new java.awt.Color(255, 0, 0));
        jBEditarEgresado.setText("<EDITAR>");
        jBEditarEgresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarEgresadoActionPerformed(evt);
            }
        });
        jPEducacion.add(jBEditarEgresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 160, 40));

        jBRegistrarEgresado.setBackground(new java.awt.Color(255, 255, 255));
        jBRegistrarEgresado.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jBRegistrarEgresado.setForeground(new java.awt.Color(255, 0, 0));
        jBRegistrarEgresado.setText("<REGISTRARSE>");
        jBRegistrarEgresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarEgresadoActionPerformed(evt);
            }
        });
        jPEducacion.add(jBRegistrarEgresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 240, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPEducacion.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1190, 570));

        jTPPestanas.addTab("2.Educacion", jPEducacion);

        jPInformacionAdicional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("(El egresado debe estar registrado)");
        jPInformacionAdicional.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Situacion Actual:");
        jPInformacionAdicional.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo de Empresa:");
        jPInformacionAdicional.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID de Egresado:");
        jPInformacionAdicional.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(" Empresa:");
        jPInformacionAdicional.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cargo dentro de la Empresa:");
        jPInformacionAdicional.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Fecha de ingreso:");
        jPInformacionAdicional.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Fecha de salida:");
        jPInformacionAdicional.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, -1, -1));

        jPInformacionAdicional.add(jCBSituacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, 30));

        jPInformacionAdicional.add(jCBTipoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 260, 30));
        jPInformacionAdicional.add(jTFSectorLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 260, 30));
        jPInformacionAdicional.add(jCalendarIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 380, 270));
        jPInformacionAdicional.add(jCalendarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 380, 270));
        jPInformacionAdicional.add(jTFCargoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 260, 30));

        jBRegistrarInformacionAdicional.setBackground(new java.awt.Color(255, 255, 255));
        jBRegistrarInformacionAdicional.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jBRegistrarInformacionAdicional.setForeground(new java.awt.Color(255, 0, 0));
        jBRegistrarInformacionAdicional.setText("<REGISTRAR>");
        jBRegistrarInformacionAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarInformacionAdicionalActionPerformed(evt);
            }
        });
        jPInformacionAdicional.add(jBRegistrarInformacionAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 240, 40));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Sector Laboral:");
        jPInformacionAdicional.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));
        jPInformacionAdicional.add(jTFIDEgresado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 260, 30));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("INFORMACIÓN LABORAL");
        jPInformacionAdicional.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jBEditarInfoLaboral.setBackground(new java.awt.Color(255, 255, 255));
        jBEditarInfoLaboral.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jBEditarInfoLaboral.setForeground(new java.awt.Color(255, 0, 0));
        jBEditarInfoLaboral.setText("<EDITAR>");
        jBEditarInfoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarInfoLaboralActionPerformed(evt);
            }
        });
        jPInformacionAdicional.add(jBEditarInfoLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 510, 160, 40));

        jPInformacionAdicional.add(jCBEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 260, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPInformacionAdicional.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1190, 570));

        jTPPestanas.addTab("Informacion Adicional", jPInformacionAdicional);

        getContentPane().add(jTPPestanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1180, 610));

        jLTitulo3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo3.setText("EGRESADOS");
        getContentPane().add(jLTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLTitulo4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo4.setText("Paso");
        getContentPane().add(jLTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, -1, -1));

        jLTitulo5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLTitulo5.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo5.setText("/2");
        getContentPane().add(jLTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, -1, -1));

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-inicio.jpg"))); // NOI18N
        jBInicio.setText("INICIO");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 140, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCancelar2;
    private javax.swing.JButton jBEditarEgresado;
    private javax.swing.JButton jBEditarInfoLaboral;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBRegistrarEgresado;
    private javax.swing.JButton jBRegistrarInformacionAdicional;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JComboBox jCBEmpresa;
    private javax.swing.JComboBox jCBFacultad;
    private javax.swing.JComboBox jCBGenero;
    private javax.swing.JComboBox jCBNivelEducativo;
    private javax.swing.JComboBox jCBPrograma;
    private javax.swing.JComboBox jCBSituacionActual;
    private javax.swing.JComboBox jCBTipoCorreo;
    private javax.swing.JComboBox jCBTipoDocumento;
    private javax.swing.JComboBox jCBTipoEmpresa;
    private javax.swing.JComboBox jCBTipoTelefono;
    private com.toedter.calendar.JCalendar jCalendarIngreso;
    private com.toedter.calendar.JCalendar jCalendarSalida;
    private javax.swing.JLabel jLIcono;
    private javax.swing.JLabel jLPaso;
    private javax.swing.JLabel jLTitulo1;
    private javax.swing.JLabel jLTitulo3;
    private javax.swing.JLabel jLTitulo4;
    private javax.swing.JLabel jLTitulo5;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMCMes;
    private javax.swing.JPanel jPDatosPersonales;
    private javax.swing.JPanel jPEducacion;
    private javax.swing.JPanel jPInformacionAdicional;
    private javax.swing.JTextField jTFCargoEmpresa;
    private javax.swing.JTextField jTFCorreoElectronico;
    private javax.swing.JTextField jTFExtension;
    private javax.swing.JTextField jTFIDEgresado;
    private javax.swing.JTextField jTFNivelAcademico;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFNumeroDiploma;
    private javax.swing.JTextField jTFNumeroDocumento;
    private javax.swing.JTextField jTFPrefijo;
    private javax.swing.JTextField jTFPrimerApellido;
    private javax.swing.JTextField jTFSectorLaboral;
    private javax.swing.JTextField jTFSegundoApellido;
    private javax.swing.JTabbedPane jTPPestanas;
    private com.toedter.calendar.JYearChooser jYCAnio;
    // End of variables declaration//GEN-END:variables

	private void jBSiguiente2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBSiguiente2MouseClicked

		if (tipoSeleccion==0){
			if (jTFNivelAcademico.getText().isEmpty() || jTFNumeroDiploma.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos para el siguiente paso", "INGRESE",
						JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					int numeroDiploma = Integer.parseInt(jTFNumeroDiploma.getText());
					
					jLPaso.setText("3");
					jTPPestanas.setEnabledAt(0, false);
					jTPPestanas.setEnabledAt(1, false);
					jTPPestanas.setSelectedIndex(2);

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Verifique que el (numero de diploma) solo contenga valores numéricos", "ATENCION",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		}else{
			jLPaso.setText("3");
			jTPPestanas.setSelectedIndex(2);
		}

		
	}// GEN-LAST:event_jBSiguiente2MouseClicked

	private void jBSiguienteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBSiguienteMouseClicked

		if(tipoSeleccion==0){
			
			if(jTFNumeroDocumento.getText().length()>=11){
				JOptionPane.showMessageDialog(null, "La identificacion es demasiado extensa (NO VALIDA)", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			
			}else{
				
			if(jTFNumero.getText().length()>=10){
				JOptionPane.showMessageDialog(null, "El numero de telefono es demasiado extenso (NO VALIDO)", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}else{
				
			if (jTFNombres.getText().isEmpty() || jTFPrimerApellido.getText().isEmpty()
					|| jTFSegundoApellido.getText().isEmpty() || jTFPrefijo.getText().isEmpty()
					|| jTFNumero.getText().isEmpty() || jTFExtension.getText().isEmpty()
					|| jTFCorreoElectronico.getText().isEmpty()||jTFNumeroDocumento.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos para el siguiente paso", "INGRESE",
						JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					
					int prefijo = Integer.parseInt(jTFPrefijo.getText());
					int numeroTel = Integer.parseInt(jTFNumero.getText());
					int extension = Integer.parseInt(jTFExtension.getText());
					int id = Integer.parseInt(jTFNumeroDocumento.getText());

						jLPaso.setText("2");
						jTPPestanas.setEnabledAt(0, false);
						jTPPestanas.setEnabledAt(1, true);
						jTPPestanas.setSelectedIndex(1);
				
						
				
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Verifique que el (prefijo, numero de telefono, extension e identificacion) contengan valores numéricos",
							"ATENCION", JOptionPane.WARNING_MESSAGE);
				}
			}
			}
			}
		}else{
			jLPaso.setText("2");
			jTPPestanas.setSelectedIndex(1);
		}
		
	}// GEN-LAST:event_jBSiguienteMouseClicked

	private void jTPPestanasStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jTPPestanasStateChanged

	}// GEN-LAST:event_jTPPestanasStateChanged

	private void jBAnteriorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jBAnteriorMouseClicked
		if(tipoSeleccion==0){
			jLPaso.setText("1");
			jTPPestanas.setEnabledAt(0, true);
			jTPPestanas.setEnabledAt(1, false);
			jTPPestanas.setSelectedIndex(0);
		}else{
			jLPaso.setText("1");
			jTPPestanas.setSelectedIndex(0);
		}
		

	}// GEN-LAST:event_jBAnteriorMouseClicked


	


	private void jBRegistrarEgresadoActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			
			if(jTFNivelAcademico.getText().isEmpty()||jTFNumeroDiploma.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos para registrar", "INGRESE",
						JOptionPane.ERROR_MESSAGE);
			}else{

			/* Datos del egresado */
			String nombre = jTFNombres.getText();
			String primerApellido = jTFPrimerApellido.getText();
			String segundoApellido = jTFSegundoApellido.getText();
			int prefijo = Integer.parseInt(jTFPrefijo.getText());
			int numeroTel = Integer.parseInt(jTFNumero.getText());
			int extension = Integer.parseInt(jTFExtension.getText());
			TipoTelefonoEnum tipoTel = (TipoTelefonoEnum) jCBTipoTelefono.getSelectedItem();
			int id = Integer.parseInt(jTFNumeroDocumento.getText());
			GeneroEnum genero =  (GeneroEnum) jCBGenero.getSelectedItem();
			TipoDocumentoEnum tipoDocumento = (TipoDocumentoEnum) jCBTipoDocumento.getSelectedItem();
			String correo = jTFCorreoElectronico.getText();
			TipoCorreoEnum tipoCorreo = (TipoCorreoEnum) jCBTipoCorreo.getSelectedItem();
			Facultad facultad = (Facultad) jCBFacultad.getSelectedItem();
			Programa idPrograma = (Programa) jCBPrograma.getSelectedItem();

			/* Datos de la educacion del egresado */
			NivelEducativoEnum nivelEducativo = (NivelEducativoEnum) jCBNivelEducativo.getSelectedItem();
			String nivelAcademico = jTFNivelAcademico.getText();
			int anio = jYCAnio.getYear();
			int mes = jMCMes.getMonth();
			int numeroDiploma = Integer.parseInt(jTFNumeroDiploma.getText());

			/**/


			Egresado egresado = new Egresado(nombre, primerApellido, segundoApellido, prefijo, numeroTel, extension,
					tipoDocumento, id, genero, tipoTel, correo, tipoCorreo, idPrograma);
			
			conEgre.crearEgresado(egresado);
			
			EducacionEgresado educacion = new EducacionEgresado(egresado, facultad, idPrograma, nivelEducativo,
					nivelAcademico, anio, mes, numeroDiploma);
			
			conEduEgre.crearEducacionEgresado(educacion);
			
			
			JOptionPane.showMessageDialog(null, "Se ha registrado exitosamente", "EXITO",
					JOptionPane.INFORMATION_MESSAGE);
			
			limpiarCamposEgresado();
		

			}
		} catch (ExcepcionNegocio ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Verifique que el (Numero de diploma) solo contengan valores numéricos",
					"ATENCION", JOptionPane.WARNING_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBInicioActionPerformed

		VentanaPrincipal principal = new VentanaPrincipal(0);
		principal.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_jBInicioActionPerformed

	private void jBCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCancelar2ActionPerformed
		if(tipoSeleccion==0){
		limpiarCamposEgresado();
		}else{
			VentanaPrincipal principal = new VentanaPrincipal(0);
			principal.setVisible(true);
			this.dispose();
		}
		
	}// GEN-LAST:event_jBCancelar2ActionPerformed

	private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBCancelarActionPerformed
		if(tipoSeleccion==0){
			limpiarCamposEgresado();
		}else{
			VentanaPrincipal principal = new VentanaPrincipal(0);
			principal.setVisible(true);
			this.dispose();	
		}
		
	}// GEN-LAST:event_jBCancelarActionPerformed


	
	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

		VentanaPrincipal principal = new VentanaPrincipal(0);
		principal.setVisible(true);
		this.dispose();

	}// GEN-LAST:event_formWindowClosing

	public void limpiarCamposEgresado() {

		jTPPestanas.setSelectedIndex(0);
		jTPPestanas.setEnabledAt(1, false);
		jLPaso.setText("1");
		jTFNombres.setText(null);
		jTFPrimerApellido.setText(null);
		jTFSegundoApellido.setText(null);
		jTFPrefijo.setText("00");
		jTFNumero.setText(null);
		jTFExtension.setText("00");
		jCBTipoDocumento.setSelectedIndex(0);
		jTFNumeroDocumento.setText(null);
		jCBGenero.setSelectedIndex(0);
		jCBTipoTelefono.setSelectedIndex(0);
		jTFCorreoElectronico.setText(null);
		jCBTipoCorreo.setSelectedIndex(0);
		jCBFacultad.setSelectedIndex(0);
		jCBPrograma.setSelectedIndex(0);
		jCBNivelEducativo.setSelectedIndex(0);
		jTFNivelAcademico.setText(null);
		jYCAnio.setYear(2016);
		jMCMes.setMonth(0);
		jTFNumeroDiploma.setText(null);

	}

	public void cargarComboFacultades() throws Exception {

		jCBFacultad.removeAllItems();
		List<Facultad> lista = conFac.listarFacultades();
		for (int i = 0; i < lista.size(); i++) {
			jCBFacultad.addItem(lista.get(i));
		}
	}

	public void cargarComboProgramas() throws Exception {

		jCBPrograma.removeAllItems();
		List<Programa> lista = conProg.listarProgramas();
		for (int i = 0; i < lista.size(); i++) {
			jCBPrograma.addItem(lista.get(i));
		}
	}
	
	public void cargarComboEmpresas()throws Exception{
		jCBEmpresa.removeAllItems();
		List<Empresa> lista = conEmp.listarEmpresas();
		for (int i = 0; i < lista.size(); i++) {
			jCBEmpresa.addItem(lista.get(i));
		}
	}
	
	public void cargarCombos(){
		GeneroEnum generos [] = GeneroEnum.values();
		for (GeneroEnum generoEnum : generos) {
			jCBGenero.addItem(generoEnum);
		}
		TipoDocumentoEnum tiposDocumentos [] =TipoDocumentoEnum.values();
		for (TipoDocumentoEnum tipoDocumentoEnum : tiposDocumentos) {
			jCBTipoDocumento.addItem(tipoDocumentoEnum);
		}

		TipoTelefonoEnum tiposTelefonos [] = TipoTelefonoEnum.values();
		for (TipoTelefonoEnum tipoTelefonoEnum : tiposTelefonos) {
			jCBTipoTelefono.addItem(tipoTelefonoEnum);
		}
		
		TipoCorreoEnum tipoCorreo [] = TipoCorreoEnum.values();
		for (TipoCorreoEnum tipoCorreoEnum : tipoCorreo) {
			jCBTipoCorreo.addItem(tipoCorreoEnum);
		}
		NivelEducativoEnum nivelesEducativos [] = NivelEducativoEnum.values();
		for (NivelEducativoEnum nivelEducativoEnum : nivelesEducativos) {
			jCBNivelEducativo.addItem(nivelEducativoEnum);
		}
		SituacionActualEnum situacionActul [] = SituacionActualEnum.values();
		for (SituacionActualEnum situacionActualEnum : situacionActul) {
		jCBSituacionActual.addItem(situacionActualEnum);
		}
		TipoEmpresaEnum tipoEmpresa [] = TipoEmpresaEnum.values();
		for (TipoEmpresaEnum tipoEmpresaEnum : tipoEmpresa) {
			jCBTipoEmpresa.addItem(tipoEmpresaEnum);
		}

	}
	
	private void jBEditarEgresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarEgresadoActionPerformed
		try {
		/* Datos del egresado */
		String nombre = jTFNombres.getText();
		String primerApellido = jTFPrimerApellido.getText();
		String segundoApellido = jTFSegundoApellido.getText();
		int prefijo = Integer.parseInt(jTFPrefijo.getText());
		int numeroTel = Integer.parseInt(jTFNumero.getText());
		int extension = Integer.parseInt(jTFExtension.getText());
		TipoTelefonoEnum tipoTel = (TipoTelefonoEnum) jCBTipoTelefono.getSelectedItem();
		int id = Integer.parseInt(jTFNumeroDocumento.getText());
		GeneroEnum genero =  (GeneroEnum) jCBGenero.getSelectedItem();
		TipoDocumentoEnum tipoDocumento = (TipoDocumentoEnum) jCBTipoDocumento.getSelectedItem();
		String correo = jTFCorreoElectronico.getText();
		TipoCorreoEnum tipoCorreo = (TipoCorreoEnum) jCBTipoCorreo.getSelectedItem();
		Facultad facultad = (Facultad) jCBFacultad.getSelectedItem();
		Programa idPrograma = (Programa) jCBPrograma.getSelectedItem();

		/* Datos de la educacion del egresado */
		NivelEducativoEnum nivelEducativo = (NivelEducativoEnum) jCBNivelEducativo.getSelectedItem();
		String nivelAcademico = jTFNivelAcademico.getText();
		int anio = jYCAnio.getYear();
		int mes = jMCMes.getMonth();
		int numeroDiploma = Integer.parseInt(jTFNumeroDiploma.getText());

		/**/
	
		
		Egresado egresado = new Egresado(nombre, primerApellido, segundoApellido, prefijo, numeroTel, extension,
				tipoDocumento, id, genero, tipoTel, correo, tipoCorreo, idPrograma);
		
		conEgre.editarEgresado(egresado);
		
		EducacionEgresado educacion = new EducacionEgresado(egresado, facultad, idPrograma, nivelEducativo,
				nivelAcademico, anio, mes, numeroDiploma);
		
		conEduEgre.editarEducaionEgresado(educacion);
		JOptionPane.showMessageDialog(null, "El egresado con identificacion ''"+id+"'' se ha modificado correctamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
		
		} catch (ExcepcionNegocio ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//GEN-LAST:event_jBEditarEgresadoActionPerformed

    private void jBRegistrarInformacionAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarInformacionAdicionalActionPerformed
    	try {
    	int idEgresado =Integer.parseInt(jTFIDEgresado.getText());
    	String sectorLaboral = jTFSectorLaboral.getText();
    	String cargoEmpresa = jTFCargoEmpresa.getText();
    	SituacionActualEnum situacionActual = (SituacionActualEnum)jCBSituacionActual.getSelectedItem();
    	TipoEmpresaEnum tipoEmpresa = (TipoEmpresaEnum) jCBTipoEmpresa.getSelectedItem();
    	Empresa nombreEmpresa = (Empresa)jCBEmpresa.getSelectedItem();
    	Date fechaIngreso = jCalendarIngreso.getDate();
    	Date fechaSalida =jCalendarSalida.getDate();
    	
    	Egresado eg = conEgre.buscarEgresado(idEgresado);
    	Empresa empresa = conEmp.buscarEmpresa(nombreEmpresa.getNit());
			if(eg!=null){
				if(jTFIDEgresado.getText().length()>=11){
					JOptionPane.showMessageDialog(null, "La identificacion del egresado es demasiado extensa (NO VALIDA)", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				if(jTFIDEgresado.getText().isEmpty()||jTFSectorLaboral.getText().isEmpty()||jTFCargoEmpresa.getText().isEmpty()
						||jCBEmpresa.getSelectedItem()==null){
					JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "INGRESE", JOptionPane.ERROR_MESSAGE);
				}else{
					
					InfoLaboralEgresado inf =conEgre.buscarInfoLaboral(eg.getId());					
					InfoLaboralEgresado info = new InfoLaboralEgresado(eg, situacionActual, empresa, tipoEmpresa,sectorLaboral, cargoEmpresa, fechaIngreso, fechaSalida);
					conEgre.registrarInfoLaboral(info);
					JOptionPane.showMessageDialog(null, "Se ha registrado la informacion correctamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
					limpiarInfoAdicional();
				}
				
			}else{
				JOptionPane.showMessageDialog(null, "La identificacion del egresado no es correcta", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		}catch (ExcepcionNegocio ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Verifique que el (ID del egresado) solo contenga valores numéricos",
					"ATENCION", JOptionPane.WARNING_MESSAGE);
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }//GEN-LAST:event_jBRegistrarInformacionAdicionalActionPerformed

    private void jBEditarInfoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarInfoLaboralActionPerformed
    	try {
    	int idEgresado =Integer.parseInt(jTFIDEgresado.getText());
    	String sectorLabolar = jTFSectorLaboral.getText();
    	String cargoEmpresa = jTFCargoEmpresa.getText();
    	SituacionActualEnum situacionActual = (SituacionActualEnum)jCBSituacionActual.getSelectedItem();
    	TipoEmpresaEnum tipoEmpresa = (TipoEmpresaEnum) jCBTipoEmpresa.getSelectedItem();
    	Empresa empresa = (Empresa)jCBEmpresa.getSelectedItem();
    	Date fechaIngreso = jCalendarIngreso.getDate();
    	Date fechaSalida =jCalendarSalida.getDate();
    	
    	if(jTFSectorLaboral.getText().isEmpty()||jTFCargoEmpresa.getText().isEmpty()||jCBEmpresa.getSelectedItem()==null){
    		
    		JOptionPane.showMessageDialog(null, "Ingrese todos los datos", "INGRESE", JOptionPane.ERROR_MESSAGE);
    	}else{
    		Egresado eg = conEgre.buscarEgresado(idEgresado);
			
    		InfoLaboralEgresado info = new InfoLaboralEgresado(eg, situacionActual, empresa, tipoEmpresa, sectorLabolar, cargoEmpresa, fechaIngreso, fechaSalida);   
    		conEgre.editarInfoLaboral(info);
    		JOptionPane.showMessageDialog(null, "Se ha editado la informacion correctamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
    		
    	}
    	} catch (ExcepcionNegocio ex) {

			JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_jBEditarInfoLaboralActionPerformed
    
    public void limpiarInfoAdicional(){
    	
    	jTFIDEgresado.setText(null);
    	jTFSectorLaboral.setText(null);
    	jTFCargoEmpresa.setText(null);
    	jCBSituacionActual.setSelectedIndex(0);
    	jCBTipoEmpresa.setSelectedIndex(0);
    	jCBEmpresa.setSelectedIndex(0);
    	jCalendarIngreso.setDate(new Date());
    	jCalendarSalida.setDate(new Date());
    	jCBEmpresa.setSelectedIndex(0);
    	
    }

}
