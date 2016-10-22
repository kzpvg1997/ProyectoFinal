/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

/**
 * @author TOSHIBAP55W
 *
 */
public class OfertaAplicadaPK implements Serializable{

	
	private int idEgresado;
	
	private int idOferta;
	
	public OfertaAplicadaPK(){
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEgresado;
		result = prime * result + idOferta;
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
		OfertaAplicadaPK other = (OfertaAplicadaPK) obj;
		if (idEgresado != other.idEgresado)
			return false;
		if (idOferta != other.idOferta)
			return false;
		return true;
	}
	
	
}
