/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.entidades;

import java.io.Serializable;

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
@IdClass(HistorialLaboralPK.class)
@Entity
@Table(name="tb_hist_laboral")
public class HistorialLaboral implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name="id_egresado")
	private InfoLaboralEgresado idEgresado;
	
	@Id
	@OneToOne
	@JoinColumn(name="id_empresa")
	private Empresa idEmpresa;
	
	
	public HistorialLaboral(){
		
	}

	/**
	 * @param idEgresado
	 * @param idEmpresa
	 */
	public HistorialLaboral(InfoLaboralEgresado idEgresado, Empresa idEmpresa) {
		super();
		this.idEgresado = idEgresado;
		this.idEmpresa = idEmpresa;
	}


	/**
	 * @return the idEgresado
	 */
	public InfoLaboralEgresado getIdEgresado() {
		return idEgresado;
	}


	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(InfoLaboralEgresado idEgresado) {
		this.idEgresado = idEgresado;
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
