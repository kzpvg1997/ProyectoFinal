/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;

/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos de la EducacionEgresado
 */
public interface IDAOEducacionEgresado {

	/**
	 * Metodo encargado de crear una EducacionEgresado para un Egresado
	 * @param educacion la EducacionEgresado que se desea crear
	 * @throws Exception en caso que ya exista un registro de EducacionEgresado
	 */
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception;
	/**
	 * Metodo encargado de buscar la EducacionEgresado
	 * @param idEgresado el id del egresado que se desea buscar
	 * @return la EducacionEgresado
	 * @throws Exception en caso de que no exista
	 */
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception;
	/**
	 * Metodo para editar la EducacionEgresado
	 * @param educacion la educacion que se desea modificar
	 * @throws Exception en caso de que no exista educacion registrada
	 */
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception;
}
