/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;


/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOPrograma {

	public List<Programa> listarProgramas()throws Exception;
	
	public Programa buscarPrograma (int id)throws Exception;
	
	public void registrarPrograma (Programa programa)throws Exception;
	
	public void editarPrograma (Programa programa)throws Exception;
}
