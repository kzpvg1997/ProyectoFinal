/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_ciudad")
public class Ciudad implements Serializable{

	@Id
	@Column(name="id_ciudad")
	private int idCiudad;
	
	@Column(name="nombre",length=50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento idDepartamento;
	
	
	public Ciudad(){
		
	}


	/**
	 * @param idCiudad
	 * @param nombre
	 * @param idDepartamento
	 */
	public Ciudad(int idCiudad, String nombre, Departamento idDepartamento) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.idDepartamento = idDepartamento;
	}


	/**
	 * @return the idCiudad
	 */
	public int getIdCiudad() {
		return idCiudad;
	}


	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
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


	/**
	 * @return the idDepartamento
	 */
	public Departamento getIdDepartamento() {
		return idDepartamento;
	}


	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre ;
	}
	
	
}
