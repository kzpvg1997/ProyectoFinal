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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_oferta_laboral")
public class OfertaLaboral implements Serializable{

	@Id
	@Column(name="id_oferta")
	private int idOferta;
	
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
	
	@Column(name="resumen",length=50)
	private String resumen;
	
	@Column(name="descripcion",length=50,nullable=false)
	private String descripcion;
	
	@Column(name="requerimientos",length=50)
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
	public OfertaLaboral(int idOferta, Empresa idEmpresa, Ciudad idCudad, AreaInteres idArea, Programa programa,
			String resumen, String descripcion, String requerimientos, String cargo, double salario,
			Date aperturaOferta) {
		super();
		this.idOferta = idOferta;
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
	
	
}
