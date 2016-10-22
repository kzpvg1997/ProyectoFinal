/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

/**
 * @author TOSHIBAP55W
 *
 */
public class AreasEgresadoPK implements Serializable{

	private int idEgresado;
	
	private int idArea;

	/**
	 * @return the idEgresado
	 */
	public int getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(int idEgresado) {
		this.idEgresado = idEgresado;
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
	
	
	
}
