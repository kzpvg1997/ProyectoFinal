/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.sql.SQLException;
import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOOfertaEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicada;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicadaPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOOfertaLaboral;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOOfertaLaboral {

	private IDAOOfertaEmpresa dao;
	
	public BOOfertaLaboral(){
		dao = new DAOOfertaLaboral();
				
	}
	
	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		dao.gernerarOferta(oferta);
		
	}
	
	public int autoIncrementable() throws SQLException {
		return dao.autoIncrementable();
	}
	
	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		return dao.buscarOfertaLaboral(idOferta);
	}
	
	public List<OfertaLaboral> listarOfertas() throws Exception {
		return dao.listarOfertas();
	}
	
	public void aplicarOfertaEgresado(OfertaAplicada ofertaApli) throws Exception {
		
		OfertaAplicadaPK ofpk = new OfertaAplicadaPK();
		ofpk.setIdEgresado(ofertaApli.getIdEgresado().getId());
		ofpk.setIdOferta(ofertaApli.getIdOferta().getIdOferta());
		OfertaAplicada oferA = buscarOfertaAplicada(ofpk);
		if(oferA!=null){
			throw new ExcepcionNegocio("El egresado ''"+ofertaApli.getIdEgresado().getNombre()+"'' "
					+ "Ya tiene esta oferta aplicada");
		}else{
			dao.aplicarOfertaEgresado(ofertaApli);
		}
		
	}
	
	public OfertaAplicada buscarOfertaAplicada(OfertaAplicadaPK idsoferta) throws Exception {
		
		return dao.buscarOfertaAplicada(idsoferta);
	}
}
