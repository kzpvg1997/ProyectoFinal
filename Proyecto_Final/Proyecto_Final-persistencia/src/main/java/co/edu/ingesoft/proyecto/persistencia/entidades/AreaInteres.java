/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_area_interes")
public class AreaInteres implements Serializable{

	@Id
	@Column(name="id_area")
	private int idArea;
	
	@Column(name="nombre",length=50)
	private String nombreArea;
	
	public AreaInteres(){
		
	}

	/**
	 * @param idArea
	 * @param nombreArea
	 */
	public AreaInteres(int idArea, String nombreArea) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
	}

	/**
	 * @return the idArea
	 */
	public int getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the nombreArea
	 */
	public String getNombreArea() {
		return nombreArea;
	}

	/**
	 * @param nombreArea the nombreArea to set
	 */
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	
	
}
