/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	
	public OfertaLaboral(){
		
	}


	/**
	 * @param idOferta
	 * @param idEmpresa
	 * @param idCudad
	 * @param idArea
	 */
	public OfertaLaboral(int idOferta, Empresa idEmpresa, Ciudad idCudad, AreaInteres idArea) {
		super();
		this.idOferta = idOferta;
		this.idEmpresa = idEmpresa;
		this.idCudad = idCudad;
		this.idArea = idArea;
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
