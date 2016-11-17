/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOEducacionEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOEducacionEgresado {

	private IDAOEducacionEgresado dao;
	
	public BOEducacionEgresado(){
		dao = new DAOEducacionEgresado();
	}
	/**
	 * Metodo encargado de crear una EducacionEgresado para un Egresado
	 * @param educacion la EducacionEgresado que se desea crear
	 * @throws Exception en caso que ya exista un registro de EducacionEgresado
	 */
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception{
		
		dao.crearEducacionEgresado(educacion);
	}
	/**
	 * Metodo encargado de buscar la EducacionEgresado
	 * @param idEgresado el id del egresado que se desea buscar
	 * @return la EducacionEgresado
	 * @throws Exception en caso de que no exista
	 */
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception{
		return dao.buscarEducacion(idEgresado);
	}
	/**
	 * Metodo para editar la EducacionEgresado
	 * @param educacion la educacion que se desea modificar
	 * @throws Exception en caso de que no exista educacion registrada
	 */
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		dao.editarEducaionEgresado(educacion);
	}
}
