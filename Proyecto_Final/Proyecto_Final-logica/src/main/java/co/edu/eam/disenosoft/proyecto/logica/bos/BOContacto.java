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
	/**
	 * Metodo responsable de registrar un Contacto para empresa
	 * @param contacto el contacto que se desea registrar
	 * @throws Exception en caso de que ya se alla registrado
	 */
	public void registrarContacto(Contacto contacto) throws Exception {
		
		Contacto con = dao.buscarContacto(contacto.getIdEmpresa().getNit());
		if(con!=null){
			throw new ExcepcionNegocio("Este contacto ya esta asignado a una empresa");
		}else{
			dao.registrarContacto(contacto);
			
		}
	}
	/**
	 * Metodo encargado de buscar un Contacto
	 * @param nit el ID de la empresa que tiene el contacto
	 * @return el contacto
	 * @throws Exception en caso de que no Exista
	 */
	public Contacto buscarContacto(int nit) throws Exception {
		
		Contacto con = dao.buscarContacto(nit);
		if(con!=null){
			return con;
		}else{
			throw new ExcepcionNegocio("Esta empresa NO tiene contacto");
		}
	}
	/**
	 * Metodo encargado de editar un Contacto
	 * @param cont el contacto que se desea editar
	 * @throws Exception en caso de que no exista
	 */
	public void editarContacto(Contacto cont) throws Exception {
		
		Contacto con = dao.buscarContacto(cont.getIdEmpresa().getNit());
		if(con!=null){
			dao.editarContacto(cont);
		}else{
			throw new ExcepcionNegocio("Esta empresa NO tiene contacto");
		}
	}
}
