/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOAreaInteres {

	public void registrarAreaInteres (AreaInteres area)throws Exception;
	
	public AreaInteres buscarAreaInteres (int id)throws Exception;
	
}
