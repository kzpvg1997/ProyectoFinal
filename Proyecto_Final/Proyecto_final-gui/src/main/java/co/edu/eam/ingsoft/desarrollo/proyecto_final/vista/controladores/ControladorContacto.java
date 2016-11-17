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
	/**
	 * Metodo que registra un contacto
	 * @param contacto que se va ha registrar
	 * @throws Exception
	 */
	public void registrarContacto(Contacto contacto) throws Exception {
		boCont.registrarContacto(contacto);
	}
	/**
	 * MEtodo que busca un contacto
	 * @param nit parametro por el cual se va buscar el contacto
	 * @return el contacto encontrado
	 * @throws Exception
	 */
	public Contacto buscarContacto(int nit) throws Exception {
		return boCont.buscarContacto(nit);
	}
	/**
	 * Metodo que se encarga de editar un contacto
	 * @param cont a editar
	 * @throws Exception
	 */
	public void editarContacto(Contacto cont) throws Exception {
		boCont.editarContacto(cont);
	}
}
