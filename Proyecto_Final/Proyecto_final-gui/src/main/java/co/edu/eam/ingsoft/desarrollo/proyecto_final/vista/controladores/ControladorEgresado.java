/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;

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
	
	/**
	 *  Metodo encargado de listar la informacion laboral
	 * @return la informacion laboral de u  egresado
	 * @throws Exception en caso de que no exista informacion laboral
	 */
	public List<InfoLaboralEgresado> listarInformacionLaboral() throws Exception {
		return boEgre.listarInformacionLaboral();
	}
	
	/**
	 * Lista la informacion Laboral de un egresado por Programa academico
	 * @param programa el programa a la cula se le desea saber la lista
	 * @return lista de informacion
	 * @throws Exception en caso de que no exista informacion
	 */
	public List<InfoLaboralEgresado> listarInfoporPrograma(Programa programa) throws Exception {
		return boEgre.listarInfoporPrograma(programa);
	}
}
