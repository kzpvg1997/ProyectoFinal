/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOPrograma;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorPrograma {

	private BOPrograma boProg;
	
	public ControladorPrograma() {
		boProg= new BOPrograma();
	}
	/**
	 * Metodo encargado de listar los programas
	 * @return una lista con todos los programas
	 * @throws Exception
	 */
	public List<Programa> listarProgramas() throws Exception{
		
		return boProg.listarProgramas();
	}
	/**
	 * MEtodo para buscar un programa
	 * @param id por el cual se va buscar el programa
	 * @return el programa buscado
	 * @throws Exception
	 */
	public Programa buscarPrograma (int id)throws Exception{
		return boProg.buscarPrograma(id);
	}
	/**
	 * Metodo para registar un programa
	 * @param programa que se va registar
	 * @throws Exception
	 */
	public void registrarPrograma(Programa programa) throws Exception {
		boProg.registrarPrograma(programa);
	}
	/**
	 * MEtodo que se encarga de editar un programa
	 * @param programa que se va editar
	 * @throws Exception
	 */
	public void editarPrograma(Programa programa) throws Exception {
		boProg.editarPrograma(programa);
	}
}
