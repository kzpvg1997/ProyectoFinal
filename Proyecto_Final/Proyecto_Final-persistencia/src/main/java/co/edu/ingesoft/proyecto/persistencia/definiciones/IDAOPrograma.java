/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;


/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos para Programa
 */
public interface IDAOPrograma {
	/**
	 *Metodo encargado de listar los programas 
	 * @return lista de los programas registrados
	 * @throws Exception 
	 */
	public List<Programa> listarProgramas()throws Exception;
	/**
	 * Metodo responsable de la busqueda de un Programa
	 * @param id el id del programa que desea buscar
	 * @return el Programa
	 * @throws Exception en caso de que no exista el Programa
	 */
	public Programa buscarPrograma (int id)throws Exception;
	/**
	 * Metodo encargado de registrar un programa
	 * @param programa el programa que se desa registrar
	 * @throws Exception en caso de que el programa ya se encuentre registrado
	 */
	public void registrarPrograma (Programa programa)throws Exception;
	/**
	 * Metodo responsable de la edicion de un Prorama
	 * @param programa el programa que se desa editar
	 * @throws Exception en caso de que no exista el programa
	 */
	public void editarPrograma (Programa programa)throws Exception;
}
