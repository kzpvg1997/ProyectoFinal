/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.sql.SQLException;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOOfertaEmpresa;
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
}
