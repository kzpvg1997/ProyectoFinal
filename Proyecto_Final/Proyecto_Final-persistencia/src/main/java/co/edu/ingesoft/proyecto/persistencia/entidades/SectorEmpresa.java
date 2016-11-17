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
	@NamedQuery(name=SectorEmpresa.SECTORES_EMPRESA,
			query="SELECT sec FROM SectorEmpresa sec")
	})
@Entity
@Table(name="tb_sectorlaboral")
public class SectorEmpresa implements Serializable{

	/**
	 * Consulta encargada de traer los SectoresEmpresa registrados
	 */
	public static final String SECTORES_EMPRESA = "SectorEmpresa.sectores";
	
	
	@Id
	@Column(name="id_sector")
	private int idSector;
	
	@Column(name="nombre",length=50)
	private String nombre;
	
	public SectorEmpresa(){
		
	}

	/**
	 * @param idSector
	 * @param nombre
	 */
	public SectorEmpresa(int idSector, String nombre) {
		super();
		this.idSector = idSector;
		this.nombre = nombre;
	}

	/**
	 * @return the idSector
	 */
	public int getIdSector() {
		return idSector;
	}

	/**
	 * @param idSector the idSector to set
	 */
	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}
	
	
}
