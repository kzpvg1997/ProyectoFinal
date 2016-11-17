/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;
import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;

/**
 * @author TOSHIBAP55W
 * clase encargada de las declaraciones de los diferentes metodos para AreasInteres
 *
 */
public interface IDAOAreaInteres {
	/**
	 *Metodo responsable de el registro de una AreaInteres 
	 * @param area el area que se desea crear
	 * @throws Exception en caso de que ya este creada
	 */
	public void registrarAreaInteres (AreaInteres area)throws Exception;
	/**
	 * Metodo responsable de buscar un AreaInteres
	 * @param id el id del area que se desea buscar
	 * @return el area
	 * @throws Exception en caso de que no exista
	 */
	public AreaInteres buscarAreaInteres (int id)throws Exception;
	/**
	 * Metodo responsable de la edicion de un AreaInteres
	 * @param area el area que se desea editar
	 * @throws Exception en caso de que el area no Exista
	 */
	public void editarAreaInteres (AreaInteres area)throws Exception;
	/**
	 * Metodo responsable de listar todas las AreasInteres
	 * @return lista de AreasInteres
	 * @throws Exception 
	 */
	public List<AreaInteres> listarTodas()throws Exception;
}
