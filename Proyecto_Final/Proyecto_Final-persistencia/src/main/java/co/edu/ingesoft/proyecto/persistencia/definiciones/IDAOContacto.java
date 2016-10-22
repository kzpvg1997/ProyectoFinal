/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOContacto {

	public void registrarContacto (Contacto contacto)throws Exception;
	
	public Contacto buscarContacto (int nit)throws Exception;
	
	public void editarContacto (Contacto cont)throws Exception;
}
