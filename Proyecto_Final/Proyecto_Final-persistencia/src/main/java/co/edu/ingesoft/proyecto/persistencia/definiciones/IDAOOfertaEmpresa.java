/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;


import java.sql.SQLException;

import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;

/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOOfertaEmpresa {

	
	public void gernerarOferta (OfertaLaboral oferta)throws Exception;
	
	public int autoIncrementable ()throws SQLException;
	
	public OfertaLaboral buscarOfertaLaboral (int idOferta)throws Exception;
}
