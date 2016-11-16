/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

/**
 * @author TOSHIBAP55W
 *
 */
public class HistorialLaboralPK implements Serializable{

	private int idEgresado;
	
	private int idEmpresa;
	
	
	
	public HistorialLaboralPK(){
		
	}
	/**
	 * @param idEgresado
	 * @param idEmpresa
	 */
	public HistorialLaboralPK(int idEgresado, int idEmpresa) {
		super();
		this.idEgresado = idEgresado;
		this.idEmpresa = idEmpresa;
	}

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
	 * @return the idEmpresa
	 */
	public int getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	
	
	
}
