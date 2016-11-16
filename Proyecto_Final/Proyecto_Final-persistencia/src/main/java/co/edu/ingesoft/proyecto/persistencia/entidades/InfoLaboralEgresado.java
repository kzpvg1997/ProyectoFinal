/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.SituacionActualEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;

/**
 * @author TOSHIBAP55W
 */


@Entity
@Table(name="tb_info_laboral")
public class InfoLaboralEgresado implements Serializable{
	
	@Id
	@OneToOne
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	@Column(name="situacion_actual",nullable=false,length=50)
	@Enumerated(EnumType.STRING)
	private SituacionActualEnum situacionActual;
	
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa idEmpresa;
	
	@Column(name="tipo_empresa",length=50)
	@Enumerated(EnumType.STRING)
	private TipoEmpresaEnum tipoempresa;
	
	@Column(name="sector_laboral",length=50)
	private String sectorLaboral;
	
	
	@Column(name="cargo_empresa",length=50)
	private String cargoEmpresa;
	
	@Column(name="fecha_ingreso")
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	
	@Column(name="fecha_salida")
	@Temporal(TemporalType.DATE)
	private Date fechaSalida;
	

	public InfoLaboralEgresado(){
		
	}


	/**
	 * @param idEgresado
	 * @param situacionActual
	 * @param idEmpresa
	 * @param tipoempresa
	 * @param sectorLaboral
	 * @param cargoEmpresa
	 * @param fechaIngreso
	 * @param fechaSalida
	 */
	public InfoLaboralEgresado(Egresado idEgresado, SituacionActualEnum situacionActual, Empresa idEmpresa,
			TipoEmpresaEnum tipoempresa, String sectorLaboral, String cargoEmpresa, Date fechaIngreso,
			Date fechaSalida) {
		super();
		this.idEgresado = idEgresado;
		this.situacionActual = situacionActual;
		this.idEmpresa = idEmpresa;
		this.tipoempresa = tipoempresa;
		this.sectorLaboral = sectorLaboral;
		this.cargoEmpresa = cargoEmpresa;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}



	/**
	 * @return the idEgresado
	 */
	public Egresado getIdEgresado() {
		return idEgresado;
	}


	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(Egresado idEgresado) {
		this.idEgresado = idEgresado;
	}


	/**
	 * @return the situacionActual
	 */
	public SituacionActualEnum getSituacionActual() {
		return situacionActual;
	}


	/**
	 * @param situacionActual the situacionActual to set
	 */
	public void setSituacionActual(SituacionActualEnum situacionActual) {
		this.situacionActual = situacionActual;
	}


	/**
	 * @return the tipoempresa
	 */
	public TipoEmpresaEnum getTipoempresa() {
		return tipoempresa;
	}


	/**
	 * @param tipoempresa the tipoempresa to set
	 */
	public void setTipoempresa(TipoEmpresaEnum tipoempresa) {
		this.tipoempresa = tipoempresa;
	}


	/**
	 * @return the sectorLaboral
	 */
	public String getSectorLaboral() {
		return sectorLaboral;
	}


	/**
	 * @param sectorLaboral the sectorLaboral to set
	 */
	public void setSectorLaboral(String sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
	}


	/**
	 * @return the cargoEmpresa
	 */
	public String getCargoEmpresa() {
		return cargoEmpresa;
	}


	/**
	 * @param cargoEmpresa the cargoEmpresa to set
	 */
	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}


	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}


	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}


	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
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

	
	
}
