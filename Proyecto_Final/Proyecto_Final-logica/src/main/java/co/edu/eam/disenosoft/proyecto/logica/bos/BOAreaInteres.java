/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOAreaInteres;
import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOAreasInteres;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOAreaInteres {

	private IDAOAreaInteres dao;
	
	public BOAreaInteres(){
		dao = new DAOAreasInteres();
	}
	/**


	 *Metodo responsable de el registro de una AreaInteres 
	 * @param area el area que se desea crear
	 * @throws Exception en caso de que ya este creada

	 */
	public void registrarAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres ar = dao.buscarAreaInteres(area.getIdArea());
		
		if(ar!=null){
			throw new ExcepcionNegocio("La area de interes con id= ''"+area.getIdArea()+"'' ya se encuantra registrada");
		}else{
			dao.registrarAreaInteres(area);
		}
		
	}
	/**
	 * Metodo responsable de buscar un AreaInteres
	 * @param id el id del area que se desea buscar
	 * @return el area
	 * @throws Exception en caso de que no exista
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		
		return dao.buscarAreaInteres(id);
	}
	/**
	 * Metodo responsable de la edicion de un AreaInteres
	 * @param area el area que se desea editar
	 * @throws Exception en caso de que el area no Exista
	 */
	public void editarAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres ar = dao.buscarAreaInteres(area.getIdArea());
		
		if(ar!=null){
			dao.editarAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("La area de interes con ID= ''"+area.getIdArea()+"'' (NO) se encuantra registrada");
		}
	}
	/**
	 * Metodo responsable de listar todas las AreasInteres
	 * @return lista de AreasInteres
	 * @throws Exception 
	 */
	public List<AreaInteres> listarTodas()throws Exception{
		return dao.listarTodas();
	}
}
