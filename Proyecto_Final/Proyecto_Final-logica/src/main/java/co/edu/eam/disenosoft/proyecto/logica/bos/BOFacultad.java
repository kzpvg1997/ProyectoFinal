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
	public List<Facultad> listarFacultades() throws Exception{
		
		return dao.listarFacultades();
	}
	
	public Facultad buscarFacultad(int idFacultad)throws Exception{
		return dao.buscarFacultad(idFacultad);
	}
	
	public void registrarFacultad(Facultad facultad) throws Exception {
		
		Facultad fac = dao.buscarFacultad(facultad.getIdFacultad());
		
		if(fac!=null){
			throw new ExecutionException("la facultad con este ID ya se encuentra registrada");
		}else{
			dao.registrarFacultad(facultad);
		}
	}
}
