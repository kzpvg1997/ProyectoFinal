/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorEducacionEgresado {

	private BOEducacionEgresado boEduEgre;
	
	public  ControladorEducacionEgresado(){
		boEduEgre = new BOEducacionEgresado();
	}
	/**
	 * Metodo que se encarga de crea una educacion 
	 * @param educacionque va ser registrada
	 * @throws Exception
	 */
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception{
		boEduEgre.crearEducacionEgresado(educacion);
	}
	/**
	 * MEtodo encargado de buscar una educacion
	 * @param idEgresado para metro por el cual se va buscar la educacion
	 * @return la educacion buscada
	 * @throws Exception
	 */
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception{
		return boEduEgre.buscarEducacion(idEgresado);
	}
	/**
	 * Metodo que esta encargado de editar una educacion
	 * @param educacion educacion que se va ha editar
	 * @throws Exception
	 */
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		boEduEgre.editarEducaionEgresado(educacion);
	}
}
