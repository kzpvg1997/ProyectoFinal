/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;



import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOOfertaEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorConexionJDBC;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOOfertaLaboral implements IDAOOfertaEmpresa{

	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(oferta);
		em.getTransaction().commit();
	}

	public int autoIncrementable() throws SQLException {
		
		Connection con = AdministradorConexionJDBC.getConexion();
		
		String sql = "select id_oferta+1 from tb_oferta_laboral order by id_oferta desc limit 1";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet res = pstmt.executeQuery();
		
		if(res.next()){
			
		return res.getInt(1);
			
		
		}
		con.close();
		return 0;
	}

	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(OfertaLaboral.class, idOferta);
	}

}
