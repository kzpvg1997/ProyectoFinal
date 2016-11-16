/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.sql.SQLException;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOOfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;

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
}
