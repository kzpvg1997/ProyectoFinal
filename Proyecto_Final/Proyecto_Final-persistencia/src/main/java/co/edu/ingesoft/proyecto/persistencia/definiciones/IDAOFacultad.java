/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;



/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOFacultad {

	public List<Facultad> listarFacultades()throws Exception;

	public Facultad buscarFacultad(int idFacultad)throws Exception;
	
	public void registrarFacultad(Facultad facultad)throws Exception;
	
	public void editarFacultad (Facultad facultad)throws Exception;
	
}
