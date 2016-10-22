/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.GeneroEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoCorreoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoDocumentoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoTelefonoEnum;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_egresado")
public class Egresado implements Serializable{
	
	@Column(name="nombre",nullable=false,length=50)
	private String Nombre;
	
	@Column(name="primer_apellido",nullable=false,length=50)
	private String primerApellido;
	
	@Column(name="segundo_apellido",length=50)
	private String segundoApellido;
	
	@Column(name="prefijo")
	private int prefijo;
	
	@Column(name="numero_tel",nullable=false,length=50)
	private int numeroTel;
	
	@Column(name="extension")
	private int extension;
	
	@Column(name="tipo_documento",nullable=false,length=50)
	@Enumerated(EnumType.STRING)
	private TipoDocumentoEnum tipoDocumento;
	
	@Id
	@Column(name="documento",nullable=false)
	private int id;
	
	@Column(name="genero",nullable=false,length=50)
	@Enumerated(EnumType.STRING)
	private GeneroEnum genero;
	
	@Column(name="tipo_telefono",length=50)
	@Enumerated(EnumType.STRING)
	private TipoTelefonoEnum tipoTel;
	
	@Column(name="correo",length=50)
	private String correo;
	
	@Column(name="tipo_correo",length=50)
	@Enumerated(EnumType.STRING)
	private TipoCorreoEnum tipoCorreo;
	
	@OneToOne
	@JoinColumn(name="id_programa")
	private Programa idPrograma;
	
	
	
	public Egresado(){
		
	}

	/**
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param prefijo
	 * @param numeroTel
	 * @param extension
	 * @param tipoDocumento
	 * @param id
	 * @param genero
	 * @param tipoTel
	 * @param correo
	 * @param tipoCorreo
	 * @param idPrograma
	 */
	public Egresado(String nombre, String primerApellido, String segundoApellido, int prefijo, int numeroTel,
			int extension, TipoDocumentoEnum tipoDocumento, int id, GeneroEnum genero, TipoTelefonoEnum tipoTel,
			String correo, TipoCorreoEnum tipoCorreo, Programa idPrograma) {
		super();
		Nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.prefijo = prefijo;
		this.numeroTel = numeroTel;
		this.extension = extension;
		this.tipoDocumento = tipoDocumento;
		this.id = id;
		this.genero = genero;
		this.tipoTel = tipoTel;
		this.correo = correo;
		this.tipoCorreo = tipoCorreo;
		this.idPrograma = idPrograma;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the prefijo
	 */
	public int getPrefijo() {
		return prefijo;
	}

	/**
	 * @param prefijo the prefijo to set
	 */
	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	/**
	 * @return the numeroTel
	 */
	public int getNumeroTel() {
		return numeroTel;
	}

	/**
	 * @param numeroTel the numeroTel to set
	 */
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	/**
	 * @return the extension
	 */
	public int getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(int extension) {
		this.extension = extension;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumentoEnum getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the genero
	 */
	public GeneroEnum getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

	/**
	 * @return the tipoTel
	 */
	public TipoTelefonoEnum getTipoTel() {
		return tipoTel;
	}

	/**
	 * @param tipoTel the tipoTel to set
	 */
	public void setTipoTel(TipoTelefonoEnum tipoTel) {
		this.tipoTel = tipoTel;
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
	 * @return the tipoCorreo
	 */
	public TipoCorreoEnum getTipoCorreo() {
		return tipoCorreo;
	}

	/**
	 * @param tipoCorreo the tipoCorreo to set
	 */
	public void setTipoCorreo(TipoCorreoEnum tipoCorreo) {
		this.tipoCorreo = tipoCorreo;
	}

	/**
	 * @return the idPrograma
	 */
	public Programa getIdPrograma() {
		return idPrograma;
	}

	/**
	 * @param idPrograma the idPrograma to set
	 */
	public void setIdPrograma(Programa idPrograma) {
		this.idPrograma = idPrograma;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Egresado other = (Egresado) obj;
		if (id != other.id)
			return false;
		return true;
	}
			
	
	
}
