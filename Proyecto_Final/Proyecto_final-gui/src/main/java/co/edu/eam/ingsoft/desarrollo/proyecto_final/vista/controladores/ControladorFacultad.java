/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOFacultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorFacultad {

	private BOFacultad boFac;
	
	public ControladorFacultad(){
		boFac = new BOFacultad();
	}
	/**
	 * MEtodo que se encarga de listar todas las facultades
	 * @return las facultades 
	 * @throws Exception
	 */
	public List<Facultad> listarFacultades() throws Exception{
		
		return boFac.listarFacultades();
	}
	/**
	 * MEtodo que se encarga de buscar las facultades
	 * @param idFacultad por el cual se va buscar la facultad
	 * @return la faculta buscada
	 * @throws Exception
	 */
	public Facultad buscarFacultad(int idFacultad)throws Exception{
		return boFac.buscarFacultad(idFacultad);
	}
	/**
	 * Metodo para registar una facultad
	 * @param facultad que se va registrar
	 * @throws Exception
	 */
	public void registrarFacultad(Facultad facultad) throws Exception {
	boFac.registrarFacultad(facultad);	
	}
	/**
	 * Metodo que se encarga de editar una facultad
	 * @param facultad la cual va ser editada
	 * @throws Exception
	 */
	public void editarFacultad(Facultad facultad) throws Exception {
		boFac.editarFacultad(facultad);
	}
}
