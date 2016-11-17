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
	
	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		boOfer.gernerarOferta(oferta);
	}
	
	public int autoIncrementable() throws SQLException {
		return boOfer.autoIncrementable();
	}
	
	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		return boOfer.buscarOfertaLaboral(idOferta);
	}
	
	public List<OfertaLaboral> listarOfertas() throws Exception {
		return boOfer.listarOfertas();
	}
	
	public void aplicarOfertaEgresado(OfertaAplicada ofertaApli) throws Exception {
		boOfer.aplicarOfertaEgresado(ofertaApli);
	}
	
	public OfertaAplicada buscarOfertaAplicada(OfertaAplicadaPK idsoferta) throws Exception {
		return boOfer.buscarOfertaAplicada(idsoferta);
	}

	public List<OfertaLaboral> buscarOfertaPorPrograma(Programa programa) throws Exception {
		return boOfer.buscarOfertaPorPrograma(programa);
	}
}
