/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboralPK;
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
	
	public void crearEgresado(Egresado egresado)throws Exception{
		
		Egresado eg = dao.buscarEgresado(egresado.getId());
		
		if(eg!=null){
			
			throw new ExcepcionNegocio("Este egresado ya se encuentra registrado");
		}else{
			dao.crearEgresado(egresado);
		}
	}
	
	public Egresado buscarEgresado (int cedula)throws Exception{
		
		Egresado eg = dao.buscarEgresado(cedula);
		
		if(eg!=null){
			return eg;
		}else{
			throw new ExcepcionNegocio("Este egresado con cedula ''"+cedula+"'' (NO) existe");
		}
	}
	
	public void editarEgresado(Egresado egresado) throws Exception {
		
		Egresado eg = dao.buscarEgresado(egresado.getId());
		
		if(eg!=null){
			 dao.editarEgresado(egresado);
		}else{
			throw new ExcepcionNegocio("Este egresado no existe");
		}
	}
	
	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		
		InfoLaboralEgresado inf = dao.buscarInfoLaboral(info.getIdEgresado().getId());
		
		if(inf!=null){
			throw new ExcepcionNegocio("Este egresado ya tiene informacion registrada");
		}else{
			dao.registrarInfoLaboral(info);
		}
	}
	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		
		InfoLaboralEgresado inf = dao.buscarInfoLaboral(id);
		
		return inf;
		
	}
	
	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {

		InfoLaboralEgresado inf = dao.buscarInfoLaboral(info.getIdEgresado().getId());
		
		if(inf!=null){
			dao.editarInfoLaboral(info);
		}else{
			throw new ExcepcionNegocio("Este egresado no existe");
		}
	}
	
}
