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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;

/**
 * @author TOSHIBAP55W
 *
 */
@NamedQueries({
	@NamedQuery(name=Empresa.CIUDADES_EMPRESA,
			query="SELECT ci FROM Ciudad ci "),
	@NamedQuery(name=Empresa.DEPARTAMENTOS_EMPRESA,
	query="SELECT dep FROM Departamento dep"),
	
	@NamedQuery(name=Empresa.EMPRESAS,
	query="SELECT emp FROM Empresa emp"),
	
	 @NamedQuery(name=Empresa.EMPLEADOS_POR_EMPRESA,
		query="SELECT inf FROM InfoLaboralEgresado inf WHERE inf.idEmpresa=?1")

	})

@Entity
@Table(name="tb_empresa")
public class Empresa implements Serializable{
	
	public static final String CIUDADES_EMPRESA = "Empresa.ciudades";
	
	public static final String DEPARTAMENTOS_EMPRESA = "Empresa.departamentos";
	
	public static final String EMPRESAS = "Empresa.empresas";
	
	public static final String EMPLEADOS_POR_EMPRESA = "Empresa.empleadosEmpresa";
	
	@Id
	@Column(name="id_empresa")
	private int nit;
	
	@Column(name="nombre_empresa",nullable=false,length=50)
	private String nombreEmpresa;
	
	@ManyToOne
	@JoinColumn(name="id_sector")
	private SectorEmpresa sector;
	
	@ManyToOne
	@JoinColumn(name="id_ciudad",insertable=false,updatable=false)
	private Ciudad ciudad;
	
	@Column(name="razon_social",nullable=false,length=50)
	private String razonSocial;
	
	@Column(name="tipo_empresa",nullable=false,length=50)
	@Enumerated(EnumType.STRING)
	private TipoEmpresaEnum tipoEmpresa;

	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Departamento departamento;
	
	@Column(name="direccion",nullable=false,length=50)
	private String direccion;
	
	@Column(name="telefono",nullable=false,length=50)
	private String telefono;
	
	@Column(name="fax",length=50)
	private String fax;
	
	@Column(name="citio_web",length=50)
	private String citioWeb;
	
	
	public Empresa(){
		
	}


	/**
	 * @param nit
	 * @param sector
	 * @param ciudad
	 * @param razonSocial
	 * @param tipoEmpresa
	 * @param departamento
	 * @param direccion
	 * @param telefono
	 * @param fax
	 * @param citioWeb
	 */
	public Empresa(int nit, SectorEmpresa sector, Ciudad ciudad, String razonSocial, TipoEmpresaEnum tipoEmpresa,
			Departamento departamento, String direccion, String telefono, String fax, String citioWeb,String nombreEmpresa) {
		super();
		this.nit = nit;
		this.sector = sector;
		this.ciudad = ciudad;
		this.razonSocial = razonSocial;
		this.tipoEmpresa = tipoEmpresa;
		this.departamento = departamento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fax = fax;
		this.citioWeb = citioWeb;
		this.nombreEmpresa=nombreEmpresa;
	}


	/**
	 * @return the nit
	 */
	public int getNit() {
		return nit;
	}


	/**
	 * @param nit the nit to set
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}


	/**
	 * @return the sector
	 */
	public SectorEmpresa getSector() {
		return sector;
	}


	/**
	 * @param sector the sector to set
	 */
	public void setSector(SectorEmpresa sector) {
		this.sector = sector;
	}


	/**
	 * @return the ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}


	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}


	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	/**
	 * @return the tipoEmpresa
	 */
	public TipoEmpresaEnum getTipoEmpresa() {
		return tipoEmpresa;
	}


	/**
	 * @param tipoEmpresa the tipoEmpresa to set
	 */
	public void setTipoEmpresa(TipoEmpresaEnum tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}


	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}


	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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


	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}


	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}


	/**
	 * @return the citioWeb
	 */
	public String getCitioWeb() {
		return citioWeb;
	}


	/**
	 * @param citioWeb the citioWeb to set
	 */
	public void setCitioWeb(String citioWeb) {
		this.citioWeb = citioWeb;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombreEmpresa;
	}
	
	
	
	
	
}
