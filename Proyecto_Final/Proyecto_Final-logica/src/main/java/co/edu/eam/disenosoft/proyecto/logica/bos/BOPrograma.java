/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOPrograma;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOPrograma;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOPrograma {

	private IDAOPrograma dao;
	
	public BOPrograma(){
		dao = new DAOPrograma();
	}
	/**
	 *Metodo encargado de listar los programas 
	 * @return lista de los programas registrados
	 * @throws Exception 
	 */
	public List<Programa> listarProgramas() throws Exception{
		return dao.listarProgramas();
	}
	/**
	 * Metodo responsable de la busqueda de un Programa
	 * @param id el id del programa que desea buscar
	 * @return el Programa
	 * @throws Exception en caso de que no exista el Programa
	 */
	public Programa buscarPrograma (int id)throws Exception{
		
		return dao.buscarPrograma(id);
	}
	/**
	 * Metodo encargado de registrar un programa
	 * @param programa el programa que se desa registrar
	 * @throws Exception en caso de que el programa ya se encuentre registrado
	 */
	public void registrarPrograma(Programa programa) throws Exception {
		dao.registrarPrograma(programa);
	}
	/**
	 * Metodo responsable de la edicion de un Prorama
	 * @param programa el programa que se desa editar
	 * @throws Exception en caso de que no exista el programa
	 */
	public void editarPrograma(Programa programa) throws Exception {
		
		Programa pro = dao.buscarPrograma(programa.getIdPrograma());
		if(pro!=null){
			dao.editarPrograma(programa);
		}else{
			throw new ExcepcionNegocio("El programa con ID  ''"+programa.getIdPrograma()+" (NO) se encuentra registrado");
			}
	}
}
