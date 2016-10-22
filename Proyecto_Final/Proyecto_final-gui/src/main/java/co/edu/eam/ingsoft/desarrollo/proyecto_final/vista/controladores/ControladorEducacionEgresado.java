/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorEducacionEgresado {

	private BOEducacionEgresado boEduEgre;
	
	public  ControladorEducacionEgresado(){
		boEduEgre = new BOEducacionEgresado();
	}
	
	public void crearEducacionEgresado (EducacionEgresado educacion)throws Exception{
		boEduEgre.crearEducacionEgresado(educacion);
	}
	
	public EducacionEgresado buscarEducacion (int idEgresado)throws Exception{
		return boEduEgre.buscarEducacion(idEgresado);
	}
	
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		boEduEgre.editarEducaionEgresado(educacion);
	}
}
