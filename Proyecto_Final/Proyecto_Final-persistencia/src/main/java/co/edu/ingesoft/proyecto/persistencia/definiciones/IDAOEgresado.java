/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;

/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos de Egresado e InformacionLaboral
 */
public interface IDAOEgresado {
	/**
	 * Metodo encargado de crear un egresado
	 * @param egresado el egresado que se desea crear
	 * @throws Exception en caso que el egresado ya este registrado
	 */
	public void crearEgresado (Egresado egresado)throws Exception;
	/**
	 * Metodo encargado de buscar un egresado
	 * @param cedula la cedula o ID del egresado que se desea buscar
	 * @return el egresado
	 * @throws Exception en caso que el Egresado no exista
	 */
	public Egresado buscarEgresado (int cedula)throws Exception;
	/**
	 * Metodo encargado de editar un Egresado
	 * @param egresado el egresado que se desea editar
	 * @throws Exception en caso de que el egresado no exista
	 * 
	 */
	public void editarEgresado (Egresado egresado)throws Exception;
	
	/**
	 * Metodo encargado de registrar la InformacionLaboral de un Egresado
	 * @param info la informacion que se desea registrar
	 * @throws Exception en caso de que la informacion ya este registrada
	 */
	public void registrarInfoLaboral (InfoLaboralEgresado info)throws Exception;
	/**
	 * Metodo encargado de buscar la InfotmacionLaboral del Egresafo
	 * @param id el id del egresado que desea obtener la informacion laboral
	 * @return la informacion laboral del Egresado
	 * @throws Exception en caso de que no exista informacion registrada
	 */
	public InfoLaboralEgresado buscarInfoLaboral (int id)throws Exception;
	/**
	 * Metodo encargado de editar la informacion laboral de un egresado
	 * @param info la informacion laboral que se desea editar
	 * @throws Exception en caso de que no exista informacionLaboral
	 */
	public void editarInfoLaboral (InfoLaboralEgresado info)throws Exception;
	/**
	 *  Metodo encargado de listar la informacion laboral
	 * @return la informacion laboral de u  egresado
	 * @throws Exception en caso de que no exista informacion laboral
	 */
	public List<InfoLaboralEgresado> listarInformacionLaboral() throws Exception;
	/**
	 * Lista la informacion Laboral de un egresado por Programa academico
	 * @param programa el programa a la cula se le desea saber la lista
	 * @return lista de informacion
	 * @throws Exception en caso de que no exista informacion
	 */
	public List<InfoLaboralEgresado> listarInfoporPrograma(Programa programa)throws Exception;
}
