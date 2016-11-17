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
	/**
	 * Metodo que se encarga de crear un egresado
	 * @param egresado el cual se va registrar
	 * @throws Exception
	 */
	public void crearEgresado(Egresado egresado)throws Exception{
	
		boEgre.crearEgresado(egresado);
	}
	/**
	 * Metodo que se encarga de buscar un egresado
	 * @param cedula parametro por el cual se va buscar el egresado
	 * @return el reegresado encontrado
	 * @throws Exception
	 */
	public Egresado buscarEgresado (int cedula)throws Exception{
		return boEgre.buscarEgresado(cedula);
	}
	/**
	 * Metodo que se encarga de editar un egresado
	 * @param egresado que es va editar
	 * @throws Exception
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		boEgre.editarEgresado(egresado);
	}
	/**
	 * Metodo que se encarga de registrar una informacion laboral
	 * @param info informacion laboral que se va registar
	 * @throws Exception
	 */
	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		boEgre.registrarInfoLaboral(info);
	}
	/**
	 * Metodo que se encarga de buscar una informacion laboral
	 * @param id para buscar la informacion laboral
	 * @return la informacion laboral que se busco
	 * @throws Exception
	 */
	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		return boEgre.buscarInfoLaboral(id);
	}
	/**
	 * Metodo para editar la informacion laboral
	 * @param info informacion laboral que se va editar
	 * @throws Exception
	 */
	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		boEgre.editarInfoLaboral(info);
	}
}
