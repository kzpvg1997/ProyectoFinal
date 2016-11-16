/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOAreaInteres {

	public void registrarAreaInteres (AreaInteres area)throws Exception;
	
	public AreaInteres buscarAreaInteres (int id)throws Exception;
	
	public void editarAreaInteres (AreaInteres area)throws Exception;
	
	public List<AreaInteres> listarTodas()throws Exception;
}
