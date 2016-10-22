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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author TOSHIBAP55W
 *
 */
@IdClass(OfertaAplicadaPK.class)
@Entity
@Table(name="tb_ofertaaplicada_egresados")
public class OfertaAplicada implements Serializable{
	
	@Id
	@OneToOne
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	@Id
	@OneToOne
	@JoinColumn(name="id_oferta")
	private OfertaLaboral idOferta;
	
	
	public OfertaAplicada(){
		
	}


	/**
	 * @param idEgresado
	 * @param idOferta
	 */
	public OfertaAplicada(Egresado idEgresado, OfertaLaboral idOferta) {
		super();
		this.idEgresado = idEgresado;
		this.idOferta = idOferta;
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
	 * @return the idOferta
	 */
	public OfertaLaboral getIdOferta() {
		return idOferta;
	}


	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(OfertaLaboral idOferta) {
		this.idOferta = idOferta;
	}
	
	
}
