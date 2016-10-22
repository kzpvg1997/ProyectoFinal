/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOContacto;
import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOContacto;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOContacto {

	private IDAOContacto dao;
	
	public BOContacto(){
		dao =new DAOContacto();
	}
	
	public void registrarContacto(Contacto contacto) throws Exception {
		
		Contacto con = dao.buscarContacto(contacto.getIdEmpresa().getNit());
		if(con!=null){
			throw new ExcepcionNegocio("Este contacto ya esta asignado a una empresa");
		}else{
			dao.registrarContacto(contacto);
			
		}
	}
	
	public Contacto buscarContacto(int nit) throws Exception {
		
		Contacto con = dao.buscarContacto(nit);
		if(con!=null){
			return con;
		}else{
			throw new ExcepcionNegocio("Esta empresa NO tiene contacto");
		}
	}
	
	public void editarContacto(Contacto cont) throws Exception {
		
		Contacto con = dao.buscarContacto(cont.getIdEmpresa().getNit());
		if(con!=null){
			dao.editarContacto(cont);
		}else{
			throw new ExcepcionNegocio("Esta empresa NO tiene contacto");
		}
	}
}
