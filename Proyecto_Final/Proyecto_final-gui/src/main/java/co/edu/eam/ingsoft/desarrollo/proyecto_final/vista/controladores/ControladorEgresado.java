/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorEgresado {

	private BOEgresado boEgre;
	
	public ControladorEgresado(){
		boEgre = new BOEgresado();
	}
	
	public void crearEgresado(Egresado egresado)throws Exception{
	
		boEgre.crearEgresado(egresado);
	}
	
	public Egresado buscarEgresado (int cedula)throws Exception{
		return boEgre.buscarEgresado(cedula);
	}
	
	public void editarEgresado(Egresado egresado) throws Exception {
		boEgre.editarEgresado(egresado);
	}
	
	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		boEgre.registrarInfoLaboral(info);
	}
	
	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		return boEgre.buscarInfoLaboral(id);
	}
	
	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		boEgre.editarInfoLaboral(info);
	}
}
