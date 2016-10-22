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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_contacto")
public class Contacto implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name="id_empresa")
	private Empresa idEmpresa;
	
	@Column(name="nombre",nullable=false,length=50)
	private String nombre;
	
	@Column(name="cargo",nullable=false,length=50)
	private String cargo;
	
	@Column(name="correo",length=50)
	private String correo;
	
	@Column(name="telefono",nullable=false,length=50)
	private String telefono;
	
	
	public Contacto(){
		
	}


	/**
	 * @param idEmpresa
	 * @param nombre
	 * @param cargo
	 * @param correo
	 * @param telefono
	 */
	public Contacto(Empresa idEmpresa, String nombre, String cargo, String correo, String telefono) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.cargo = cargo;
		this.correo = correo;
		this.telefono = telefono;
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
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}


	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
