/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@IdClass(AreasEgresadoPK.class)
@Entity
@Table(name="tb_areas_egresado")
public class AreasEgresado implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_area")
	private AreaInteres idArea;

	
	public AreasEgresado(){
		
	}


	/**
	 * @param idEgresado
	 * @param idArea
	 */
	public AreasEgresado(Egresado idEgresado, AreaInteres idArea) {
		super();
		this.idEgresado = idEgresado;
		this.idArea = idArea;
	}


	/**
	 * @return the idEgresado
	 */
	public Egresado getIdEgresado() {
		return idEgresado;
	}


	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(Egresado idEgresado) {
		this.idEgresado = idEgresado;
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
