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
	
	public List<Programa> listarProgramas() throws Exception{
		
		return boProg.listarProgramas();
	}

	public Programa buscarPrograma (int id)throws Exception{
		return boProg.buscarPrograma(id);
	}
	
	public void registrarPrograma(Programa programa) throws Exception {
		boProg.registrarPrograma(programa);
	}
}
