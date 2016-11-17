/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.sql.SQLException;
import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOOfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicada;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicadaPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorOfertaLaboral {

	private BOOfertaLaboral boOfer;
	
	public ControladorOfertaLaboral(){
	
		boOfer= new BOOfertaLaboral();
	}
	/**
	 * Metodo que que se encarga de generar una oferta
	 * @param oferta que se va generar
	 * @throws Exception
	 */
	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		boOfer.gernerarOferta(oferta);
	}
	/**
	 * Metodo que auto incrementa
	 * @return el auto incrementable
	 * @throws SQLException
	 */
	public int autoIncrementable() throws SQLException {
		return boOfer.autoIncrementable();
	}
	/**
	 * Metodo que busca una oferta laboral
	 * @param idOferta para buscar una oferta
	 * @return la oferta laoral que se busco
	 * @throws Exception
	 */
	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		return boOfer.buscarOfertaLaboral(idOferta);
	}
	/**
	 * Metodo que lista las ofertas laborales
	 * @return una lista con las ofertas laborales
	 * @throws Exception
	 */
	public List<OfertaLaboral> listarOfertas() throws Exception {
		return boOfer.listarOfertas();
	}
	/**
	 * Metodo que sirve para aplicar una oferta
	 * @param ofertaApli
	 * @throws Exception
	 */
	public void aplicarOfertaEgresado(OfertaAplicada ofertaApli) throws Exception {
		boOfer.aplicarOfertaEgresado(ofertaApli);
	}
	/**
	 * Metodo para buscar una oferta aplicada
	 * @param idsoferta que sirve para buscar la oferta
	 * @return a oferta buscada
	 * @throws Exception
	 */
	public OfertaAplicada buscarOfertaAplicada(OfertaAplicadaPK idsoferta) throws Exception {
		return boOfer.buscarOfertaAplicada(idsoferta);
	}
	/**
	 * Metodo que sirve para listar las ofertas buscadas
	 * @param programa por el cual se va buscar la oferta
	 * @return la oferta buscada
	 * @throws Exception
	 */
	public List<OfertaLaboral> buscarOfertaPorPrograma(Programa programa) throws Exception {
		return boOfer.buscarOfertaPorPrograma(programa);
	}
}
