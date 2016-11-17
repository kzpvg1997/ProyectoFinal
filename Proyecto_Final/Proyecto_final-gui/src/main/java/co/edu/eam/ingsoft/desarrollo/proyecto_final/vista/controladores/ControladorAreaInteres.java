/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOAreaInteres;
import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorAreaInteres {

	private BOAreaInteres boArea;
	
	public ControladorAreaInteres(){
		
		boArea = new BOAreaInteres();
	}
	
	public void registrarAreaInteres(AreaInteres area) throws Exception {
		boArea.registrarAreaInteres(area);
	}
	
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		return boArea.buscarAreaInteres(id);
	}
	
	public void editarAreaInteres(AreaInteres area) throws Exception {
		boArea.editarAreaInteres(area);
	}
}
