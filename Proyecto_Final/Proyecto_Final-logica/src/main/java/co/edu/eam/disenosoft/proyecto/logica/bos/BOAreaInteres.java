/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

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
	
	public void registrarAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres ar = dao.buscarAreaInteres(area.getIdArea());
		
		if(ar!=null){
			throw new ExcepcionNegocio("La area de interes con id= ''"+area.getIdArea()+"'' ya se encuantra registrada");
		}else{
			dao.registrarAreaInteres(area);
		}
		
	}

	public AreaInteres buscarAreaInteres(int id) throws Exception {
		
		return dao.buscarAreaInteres(id);
	}
	
	public void editarAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres ar = dao.buscarAreaInteres(area.getIdArea());
		
		if(ar!=null){
			dao.editarAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("La area de interes con ID= ''"+area.getIdArea()+"'' (NO) se encuantra registrada");
		}
	}
}
