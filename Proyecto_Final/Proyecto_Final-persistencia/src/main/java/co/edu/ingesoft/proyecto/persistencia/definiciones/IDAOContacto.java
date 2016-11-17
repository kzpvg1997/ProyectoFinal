/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;

/**
 * @author TOSHIBAP55W
 * clase encargada de la declaracion de los diferentes metodos para Contacto
 */
public interface IDAOContacto {
	/**
	 * Metodo responsable de registrar un Contacto para empresa
	 * @param contacto el contacto que se desea registrar
	 * @throws Exception en caso de que ya se alla registrado
	 */
	public void registrarContacto (Contacto contacto)throws Exception;
	/**
	 * Metodo encargado de buscar un Contacto
	 * @param nit el ID de la empresa que tiene el contacto
	 * @return el contacto
	 * @throws Exception en caso de que no Exista
	 */
	public Contacto buscarContacto (int nit)throws Exception;
	/**
	 * Metodo encargado de editar un Contacto
	 * @param cont el contacto que se desea editar
	 * @throws Exception en caso de que no exista
	 */
	public void editarContacto (Contacto cont)throws Exception;
}
