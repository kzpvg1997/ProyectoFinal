/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author TOSHIBAP55W
 *
 */
@NamedQueries({
	@NamedQuery(name=OfertaLaboral.OFERTAS,
			query="SELECT ofr FROM OfertaLaboral ofr"),
	@NamedQuery(name=OfertaLaboral.OFERTAS_POR_PROGRAMA,
	query="SELECT ofr FROM OfertaLaboral ofr WHERE ofr.programa=?1")
	})
@Entity
@Table(name="tb_oferta_laboral")
public class OfertaLaboral implements Serializable{

	/**
	 * Consulta responsable de las Ofertas laborales
	 */
	public static final String OFERTAS = "OfertaLaboral.ofertas";
	
	
	public static final String OFERTAS_POR_PROGRAMA = "OfertaLaboral.ofertasporprograma";
	
	@Id
	@Column(name="id_oferta")
	private int idOferta;
	
	@Column(name="nombre_oferta",nullable=false,length=45)
	private String nombreOferta;
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa idEmpresa;
	
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad idCudad;
	
	@ManyToOne
	@JoinColumn(name="id_area")
	private AreaInteres idArea;
	
	@ManyToOne
	@JoinColumn(name="programa")
	private Programa programa;
	
	@Column(name="resumen",length=150)
	private String resumen;
	
	@Column(name="descripcion",length=150,nullable=false)
	private String descripcion;
	
	@Column(name="requerimientos",length=150)
	private String requerimientos;
	
	@Column(name="cargo",length=50,nullable=false)
	private String cargo;
	
	@Column(name="salario",nullable=false)
	private double salario;
	
	@Column(name="apertura_oferta")
	@Temporal(TemporalType.DATE)
	private Date aperturaOferta;
	
	
	public OfertaLaboral(){
		
	}

	/**
	 * @param idOferta
	 * @param nombreOferta
	 * @param idEmpresa
	 * @param idCudad
	 * @param idArea
	 * @param programa
	 * @param resumen
	 * @param descripcion
	 * @param requerimientos
	 * @param cargo
	 * @param salario
	 * @param aperturaOferta
	 */
	public OfertaLaboral(int idOferta, String nombreOferta, Empresa idEmpresa, Ciudad idCudad, AreaInteres idArea,
			Programa programa, String resumen, String descripcion, String requerimientos, String cargo, double salario,
			Date aperturaOferta) {
		super();
		this.idOferta = idOferta;
		this.nombreOferta = nombreOferta;
		this.idEmpresa = idEmpresa;
		this.idCudad = idCudad;
		this.idArea = idArea;
		this.programa = programa;
		this.resumen = resumen;
		this.descripcion = descripcion;
		this.requerimientos = requerimientos;
		this.cargo = cargo;
		this.salario = salario;
		this.aperturaOferta = aperturaOferta;
	}

	/**
	 * @return the idOferta
	 */
	public int getIdOferta() {
		return idOferta;
	}

	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	/**
	 * @return the nombreOferta
	 */
	public String getNombreOferta() {
		return nombreOferta;
	}

	/**
	 * @param nombreOferta the nombreOferta to set
	 */
	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}

	/**
	 * @return the idEmpresa
	 */
	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the idCudad
	 */
	public Ciudad getIdCudad() {
		return idCudad;
	}

	/**
	 * @param idCudad the idCudad to set
	 */
	public void setIdCudad(Ciudad idCudad) {
		this.idCudad = idCudad;
	}

	/**
	 * @return the idArea
	 */
	public AreaInteres getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(AreaInteres idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the requerimientos
	 */
	public String getRequerimientos() {
		return requerimientos;
	}

	/**
	 * @param requerimientos the requerimientos to set
	 */
	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the aperturaOferta
	 */
	public Date getAperturaOferta() {
		return aperturaOferta;
	}

	/**
	 * @param aperturaOferta the aperturaOferta to set
	 */
	public void setAperturaOferta(Date aperturaOferta) {
		this.aperturaOferta = aperturaOferta;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombreOferta;
	}

	
}
