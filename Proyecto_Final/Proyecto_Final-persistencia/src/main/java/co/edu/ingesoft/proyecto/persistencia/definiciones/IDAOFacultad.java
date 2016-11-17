/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;


/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos de Facultad
 */
public interface IDAOFacultad {

	/**
	 * Metodo encargado de listar las Facultades
	 * @return lista de facultades
	 * @throws Exception
	 */
	public List<Facultad> listarFacultades()throws Exception;
	/**
	 * Metodo responsable de buscar una Facultad
	 * @param idFacultad el id de la facultad que se desea buscar
	 * @return la Facultad
	 * @throws Exception en caso de que no exista
	 */
	public Facultad buscarFacultad(int idFacultad)throws Exception;
	/**
	 * metodo encargado de registrar una Facultad
	 * @param facultad la facultad que se desea registrar
	 * @throws Exception en caso de que esta facultad ya exista
	 */
	public void registrarFacultad(Facultad facultad)throws Exception;
	/**
	 * metodo para esitar una facultad
	 * @param facultad la facultad que se desea editar
	 * @throws Exception en caso de que la facultad no exista
	 */
	public void editarFacultad (Facultad facultad)throws Exception;
	
}
