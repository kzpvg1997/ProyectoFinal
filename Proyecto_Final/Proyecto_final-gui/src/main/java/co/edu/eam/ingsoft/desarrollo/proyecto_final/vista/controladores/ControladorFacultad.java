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
	
	public List<Facultad> listarFacultades() throws Exception{
		
		return boFac.listarFacultades();
	}
	
	public Facultad buscarFacultad(int idFacultad)throws Exception{
		return boFac.buscarFacultad(idFacultad);
	}
	
	public void registrarFacultad(Facultad facultad) throws Exception {
	boFac.registrarFacultad(facultad);	
	}
}
