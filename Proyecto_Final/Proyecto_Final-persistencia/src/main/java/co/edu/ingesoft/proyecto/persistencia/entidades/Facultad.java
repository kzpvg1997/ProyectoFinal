/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * @author TOSHIBAP55W
 *
 */
@NamedQueries({
	@NamedQuery(name=Facultad.FACULTADES,
			query="SELECT fa FROM Facultad fa")
	})
@Entity
@Table(name="tb_facultad")
public class Facultad implements Serializable{
	/**
	 * consulta encargada de traer las facultades registradas
	 */
	public static final String FACULTADES = "Facultad.facultades";
	
	@Id
	@Column(name="id_facultad")
	private int idFacultad;

	@Column(name="nombre",length=50)
	private String nombreFacultad;
	
	public Facultad(){
		
	}

	/**
	 * @param idFacultad
	 * @param nombreFacultad
	 */
	public Facultad(int idFacultad, String nombreFacultad) {
		super();
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
	}

	/**
	 * @return the idFacultad
	 */
	public int getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}

	/**
	 * @return the nombreFacultad
	 */
	public String getNombreFacultad() {
		return nombreFacultad;
	}

	/**
	 * @param nombreFacultad the nombreFacultad to set
	 */
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombreFacultad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFacultad;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facultad other = (Facultad) obj;
		if (idFacultad != other.idFacultad)
			return false;
		return true;
	}
		
		
}
