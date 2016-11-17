/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOEgresado {

	private IDAOEgresado dao;
	private IDAOEducacionEgresado daoEdu;
	
	public BOEgresado(){
		dao = new DAOEgresado();
		daoEdu =  new DAOEducacionEgresado();
	}
	/**
	 * Metodo encargado de crear un egresado
	 * @param egresado el egresado que se desea crear
	 * @throws Exception en caso que el egresado ya este registrado
	 */
	public void crearEgresado(Egresado egresado)throws Exception{
		
		Egresado eg = dao.buscarEgresado(egresado.getId());
		
		if(eg!=null){
			
			throw new ExcepcionNegocio("Este egresado ya se encuentra registrado");
		}else{
			dao.crearEgresado(egresado);
		}
	}
	/**
	 * Metodo encargado de buscar un egresado
	 * @param cedula la cedula o ID del egresado que se desea buscar
	 * @return el egresado
	 * @throws Exception en caso que el Egresado no exista
	 */
	public Egresado buscarEgresado (int cedula)throws Exception{
		
		Egresado eg = dao.buscarEgresado(cedula);
		
		if(eg!=null){
			return eg;
		}else{
			throw new ExcepcionNegocio("Este egresado con cedula ''"+cedula+"'' (NO) existe");
		}
	}
	/**
	 * Metodo encargado de editar un Egresado
	 * @param egresado el egresado que se desea editar
	 * @throws Exception en caso de que el egresado no exista
	 * 
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		
		Egresado eg = dao.buscarEgresado(egresado.getId());
		
		if(eg!=null){
			 dao.editarEgresado(egresado);
		}else{
			throw new ExcepcionNegocio("Este egresado no existe");
		}
	}
	/**
	 * Metodo encargado de registrar la InformacionLaboral de un Egresado
	 * @param info la informacion que se desea registrar
	 * @throws Exception en caso de que la informacion ya este registrada
	 */
	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		
		InfoLaboralEgresado inf = dao.buscarInfoLaboral(info.getIdEgresado().getId());
		
		if(inf!=null){
			throw new ExcepcionNegocio("Este egresado ya tiene informacion registrada");
		}else{
			dao.registrarInfoLaboral(info);
		}
	}
	/**
	 * Metodo encargado de buscar la InfotmacionLaboral del Egresafo
	 * @param id el id del egresado que desea obtener la informacion laboral
	 * @return la informacion laboral del Egresado
	 * @throws Exception en caso de que no exista informacion registrada
	 */
	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		
		InfoLaboralEgresado inf = dao.buscarInfoLaboral(id);
		
		return inf;
		
	}
	/**
	 * Metodo encargado de editar la informacion laboral de un egresado
	 * @param info la informacion laboral que se desea editar
	 * @throws Exception en caso de que no exista informacionLaboral
	 */
	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {

		InfoLaboralEgresado inf = dao.buscarInfoLaboral(info.getIdEgresado().getId());
		
		if(inf!=null){
			dao.editarInfoLaboral(info);
		}else{
			throw new ExcepcionNegocio("Este egresado no existe");
		}
	}
	
}
