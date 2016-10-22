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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@NamedQueries({
	@NamedQuery(name=Programa.PROGRAMAS,
			query="SELECT pro FROM Programa pro")
	})
@Entity
@Table(name="tb_programa")
public class Programa implements Serializable{

	public static final String PROGRAMAS = "Programa.programas";
	
	@OneToOne
	@JoinColumn(name="id_facultad")
	private Facultad idFacultad;
	
	@Id
	@Column(name="id_programa")
	private int idPrograma;
	

	@Column(name="nombre",length=50)
	private String nombrePrograma;
	
	public Programa(){
		
	}

	/**
	 * @param idFacultad
	 * @param idPrograma
	 * @param nombrePrograma
	 */
	public Programa(Facultad idFacultad, int idPrograma, String nombrePrograma) {
		super();
		this.idFacultad = idFacultad;
		this.idPrograma = idPrograma;
		this.nombrePrograma = nombrePrograma;
	}

	/**
	 * @return the idFacultad
	 */
	public Facultad getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(Facultad idFacultad) {
		this.idFacultad = idFacultad;
	}

	/**
	 * @return the idPrograma
	 */
	public int getIdPrograma() {
		return idPrograma;
	}

	/**
	 * @param idPrograma the idPrograma to set
	 */
	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}

	/**
	 * @return the nombrePrograma
	 */
	public String getNombrePrograma() {
		return nombrePrograma;
	}

	/**
	 * @param nombrePrograma the nombrePrograma to set
	 */
	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombrePrograma ;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFacultad == null) ? 0 : idFacultad.hashCode());
		result = prime * result + idPrograma;
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
		Programa other = (Programa) obj;
		if (idFacultad == null) {
			if (other.idFacultad != null)
				return false;
		} else if (!idFacultad.equals(other.idFacultad))
			return false;
		if (idPrograma != other.idPrograma)
			return false;
		return true;
	}
	
	
}
