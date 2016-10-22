/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOEducacionEgresado {

	
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception;
	
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception;
	
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception;
}
