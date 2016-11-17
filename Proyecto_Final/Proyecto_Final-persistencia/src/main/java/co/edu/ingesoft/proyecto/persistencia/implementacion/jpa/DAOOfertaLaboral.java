/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOOfertaEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicada;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicadaPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorConexionJDBC;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOOfertaLaboral implements IDAOOfertaEmpresa{
	/**
	 * Metodo encargado de generar una oferta laboral
	 * @param oferta la oferta que se desea registrar
	 * @throws Exception en caso de que ya exista una oferta
	 */
	public void gernerarOferta(OfertaLaboral oferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(oferta);
		em.getTransaction().commit();
	}
	/**
	 * Metodo encargado de el ID de oferta sea autoincrementable cogiendo el ultimo valor
	 * @return el ID+1
	 * @throws SQLException en caso de error en la conexion
	 */
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
	/**
	 * Metodo responsab;e de buscar una OfertaLaboral
	 * @param idOferta la id de la oferta (Autoincrementable)
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public OfertaLaboral buscarOfertaLaboral(int idOferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(OfertaLaboral.class, idOferta);
	}
	/**
	 * Metodo encargado de listar las Ofertas Laborales
	 * @return lista de Ofertas laborales
	 * @throws Exception
	 */
	public List<OfertaLaboral> listarOfertas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.OFERTAS);
		List<OfertaLaboral> ofertas = q.getResultList();
		return ofertas;
	}
	/**
	 * Metodo encargado de aplicar una oferta laboral a un egresado
	 * @param ofertaApli la oferta que se desea aplicar
	 * @throws Exception en caso de que ya alla aplicado una oferta
	 */
	public void aplicarOfertaEgresado(OfertaAplicada ofertaApli) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(ofertaApli);
		em.getTransaction().commit();
	}
	/**
	 * Metodo responsable de buscar una OfertaAplicada
	 * @param idsoferta el id del egresado, y el id de la ofertaLaboral
	 * @return la OfertaAplicada
	 * @throws Exception en caso de que no exista ofertaAplicada
	 */
	public OfertaAplicada buscarOfertaAplicada(OfertaAplicadaPK idsoferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(OfertaAplicada.class, idsoferta);
	}
	/**
	 * Metodo encargado de buscar una oferta Laboral por programa academico
	 * @param pro el programa que recibe para buscar la oferta
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public List<OfertaLaboral> buscarOfertaPorPrograma(Programa pro) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.OFERTAS_POR_PROGRAMA);
		q.setParameter(1, pro);
		List<OfertaLaboral> ofertas = q.getResultList();
		return ofertas;
	}

}
