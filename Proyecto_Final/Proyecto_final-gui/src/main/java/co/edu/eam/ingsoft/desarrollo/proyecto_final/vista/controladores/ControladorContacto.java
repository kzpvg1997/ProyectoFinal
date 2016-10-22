/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOContacto;
import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorContacto {

	private BOContacto boCont;
	
	public ControladorContacto(){
		boCont =  new BOContacto();
	}
	
	public void registrarContacto(Contacto contacto) throws Exception {
		boCont.registrarContacto(contacto);
	}
	
	public Contacto buscarContacto(int nit) throws Exception {
		return boCont.buscarContacto(nit);
	}
	
	public void editarContacto(Contacto cont) throws Exception {
		boCont.editarContacto(cont);
	}
}
