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
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
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
	/**
	 * Metodo encargado de generar una oferta laboral
	 * @param oferta la oferta que se desea registrar
	 * @throws Exception en caso de que ya exista una oferta
	 */
	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		dao.gernerarOferta(oferta);
		
	}
	/**
	 * Metodo encargado de el ID de oferta sea autoincrementable cogiendo el ultimo valor
	 * @return el ID+1
	 * @throws SQLException en caso de error en la conexion
	 */
	public int autoIncrementable() throws SQLException {
		return dao.autoIncrementable();
	}
	/**
	 * Metodo responsab;e de buscar una OfertaLaboral
	 * @param idOferta la id de la oferta (Autoincrementable)
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		return dao.buscarOfertaLaboral(idOferta);
	}
	/**
	 * Metodo encargado de listar las Ofertas Laborales
	 * @return lista de Ofertas laborales
	 * @throws Exception
	 */
	public List<OfertaLaboral> listarOfertas() throws Exception {
		return dao.listarOfertas();
	}
	/**
	 * Metodo encargado de aplicar una oferta laboral a un egresado
	 * @param ofertaApli la oferta que se desea aplicar
	 * @throws Exception en caso de que ya alla aplicado una oferta
	 */
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
	/**
	 * Metodo responsable de buscar una OfertaAplicada
	 * @param idsoferta el id del egresado, y el id de la ofertaLaboral
	 * @return la OfertaAplicada
	 * @throws Exception en caso de que no exista ofertaAplicada
	 */
	public OfertaAplicada buscarOfertaAplicada(OfertaAplicadaPK idsoferta) throws Exception {
		
		return dao.buscarOfertaAplicada(idsoferta);
	}
	/**
	 * Metodo encargado de buscar una oferta Laboral por programa academico
	 * @param pro el programa que recibe para buscar la oferta
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public List<OfertaLaboral> buscarOfertaPorPrograma(Programa programa) throws Exception {
		return dao.buscarOfertaPorPrograma(programa);
	}
	
	/**
	 * Metodo responsable de editar una oferta laboral para su cierre
	 * @param oferta la oferta que se desea editar
	 * @throws Exception en caso de que no exista la oferta
	 */
	public void editarOfertaLaboral(OfertaLaboral oferta) throws Exception {
		dao.editarOfertaLaboral(oferta);
	}
}
