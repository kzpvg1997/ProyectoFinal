/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOEducacionEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOEducacionEgresado {

	private IDAOEducacionEgresado dao;
	
	public BOEducacionEgresado(){
		dao = new DAOEducacionEgresado();
	}
	
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception{
		
		dao.crearEducacionEgresado(educacion);
	}
	
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception{
		return dao.buscarEducacion(idEgresado);
	}
	
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		dao.editarEducaionEgresado(educacion);
	}
}
