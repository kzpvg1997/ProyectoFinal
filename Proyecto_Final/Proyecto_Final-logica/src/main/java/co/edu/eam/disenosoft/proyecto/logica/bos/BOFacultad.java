/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.util.List;

import org.hibernate.bytecode.buildtime.spi.ExecutionException;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOFacultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOFacultad;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOFacultad {

	private IDAOFacultad dao;
	
	public BOFacultad(){
		dao = new DAOFacultad();
	}
	/**
	 * Metodo encargado de listar las Facultades
	 * @return lista de facultades
	 * @throws Exception
	 */
	public List<Facultad> listarFacultades() throws Exception{
		
		return dao.listarFacultades();
	}
	/**
	 * Metodo responsable de buscar una Facultad
	 * @param idFacultad el id de la facultad que se desea buscar
	 * @return la Facultad
	 * @throws Exception en caso de que no exista
	 */
	public Facultad buscarFacultad(int idFacultad)throws Exception{
		return dao.buscarFacultad(idFacultad);
	}
	/**
	 * metodo encargado de registrar una Facultad
	 * @param facultad la facultad que se desea registrar
	 * @throws Exception en caso de que esta facultad ya exista
	 */
	public void registrarFacultad(Facultad facultad) throws Exception {
		
		Facultad fac = dao.buscarFacultad(facultad.getIdFacultad());
		
		if(fac!=null){
			throw new ExecutionException("la facultad con este ID ya se encuentra registrada");
		}else{
			dao.registrarFacultad(facultad);
		}
	}
	/**
	 * metodo para esitar una facultad
	 * @param facultad la facultad que se desea editar
	 * @throws Exception en caso de que la facultad no exista
	 */
	public void editarFacultad(Facultad facultad) throws Exception {
		
		Facultad fac = dao.buscarFacultad(facultad.getIdFacultad());
		
		if(fac!=null){
			dao.editarFacultad(facultad);
		}else{
			throw new ExecutionException("la facultad con este ID (NO) encuentra registrada");
		}
	}
}
