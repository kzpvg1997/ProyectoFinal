/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

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
	
	/**
	 * Metodo encargado de registrar un area de interes
	 * @param area que se va a registrar
	 * @throws Exception
	 */
	public void registrarAreaInteres(AreaInteres area) throws Exception {
		boArea.registrarAreaInteres(area);
	}
	
	/**
	 * Metodo que se encarga de buscar una area de interes
	 * @param id por el cual se va buscar e area de interes
	 * @return el area de interes que se encontro
	 * @throws Exception
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		return boArea.buscarAreaInteres(id);
	}
	/**
	 * Metodo que se encarga de editar un area de interes
	 * @param area que se va editar
	 * @throws Exception
	 */
	public void editarAreaInteres(AreaInteres area) throws Exception {
		boArea.editarAreaInteres(area);
	}
	/**
	 * Metodo que lista todas las areas de interes
	 * @return Una lista con todas las areas de intenres
	 * @throws Exception
	 */
	public List<AreaInteres> listarTodas() throws Exception{
		return boArea.listarTodas();
	}
}
