/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboralPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOEgresado {

	public void crearEgresado (Egresado egresado)throws Exception;
	
	public Egresado buscarEgresado (int cedula)throws Exception;
	
	public void editarEgresado (Egresado egresado)throws Exception;
	
	public void registrarInfoLaboral (InfoLaboralEgresado info)throws Exception;
	
	public InfoLaboralEgresado buscarInfoLaboral (int id)throws Exception;

	public void editarInfoLaboral (InfoLaboralEgresado info)throws Exception;
}
