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
	
	public List<Programa> listarProgramas() throws Exception{
		return dao.listarProgramas();
	}
	
	public Programa buscarPrograma (int id)throws Exception{
		
		return dao.buscarPrograma(id);
	}
	
	public void registrarPrograma(Programa programa) throws Exception {
		dao.registrarPrograma(programa);
	}
}
