/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;


import java.sql.SQLException;
import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicada;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicadaPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOOfertaEmpresa {

	
	public void gernerarOferta (OfertaLaboral oferta)throws Exception;
	
	public int autoIncrementable ()throws SQLException;
	
	public OfertaLaboral buscarOfertaLaboral (int idOferta)throws Exception;
	
	public List<OfertaLaboral> listarOfertas()throws Exception;
	
	public void aplicarOfertaEgresado (OfertaAplicada ofertaApli)throws Exception;
	
	public OfertaAplicada buscarOfertaAplicada (OfertaAplicadaPK idsoferta)throws Exception;
	
}
