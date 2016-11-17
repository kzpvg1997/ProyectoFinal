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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.NivelEducativoEnum;

/**
 * @author TOSHIBAP55W
 *
 */
@Entity
@Table(name="tb_info_academica")
public class EducacionEgresado implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(name="id_egresado")
	private Egresado idEgresado;
	
	@OneToOne
	@JoinColumn(name="id_facultad")
	private Facultad facultad;
	
	@OneToOne
	@JoinColumn(name="id_programa")
	private Programa programa;
	
	@Column(name="nivel_educativo",nullable=false,length=50)
	@Enumerated(EnumType.STRING)
	private NivelEducativoEnum nivelEducativo;
	
	@Column(name="nivel_academico",length=50)
	private String nivelAcademico;
	
	@Column(name="año_grado",nullable=false)
	private int anio;
	
	@Column(name="mes_grado",nullable=false,length=15)
	private int mes;
	
	@Column(name="numero_diploma",nullable=false)
	private int numeroDiploma;
	
	
	public EducacionEgresado(){
		
	}


	/**
	 * @param idEgresado
	 * @param facultad
	 * @param programa
	 * @param nivelEducativo
	 * @param nivelAcademico
	 * @param anio
	 * @param mes
	 * @param numeroDiploma
	 */
	public EducacionEgresado(Egresado idEgresado, Facultad facultad, Programa programa,
			NivelEducativoEnum nivelEducativo, String nivelAcademico, int anio, int mes, int numeroDiploma) {
		super();
		this.idEgresado = idEgresado;
		this.facultad = facultad;
		this.programa = programa;
		this.nivelEducativo = nivelEducativo;
		this.nivelAcademico = nivelAcademico;
		this.anio = anio;
		this.mes = mes;
		this.numeroDiploma = numeroDiploma;
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
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}


	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}


	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}


	/**
	 * @return the nivelEducativo
	 */
	public NivelEducativoEnum getNivelEducativo() {
		return nivelEducativo;
	}


	/**
	 * @param nivelEducativo the nivelEducativo to set
	 */
	public void setNivelEducativo(NivelEducativoEnum nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
	}


	/**
	 * @return the nivelAcademico
	 */
	public String getNivelAcademico() {
		return nivelAcademico;
	}


	/**
	 * @param nivelAcademico the nivelAcademico to set
	 */
	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}


	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}


	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}


	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}


	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}


	/**
	 * @return the numeroDiploma
	 */
	public int getNumeroDiploma() {
		return numeroDiploma;
	}


	/**
	 * @param numeroDiploma the numeroDiploma to set
	 */
	public void setNumeroDiploma(int numeroDiploma) {
		this.numeroDiploma = numeroDiploma;
	}

	
		
}


