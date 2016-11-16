/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOAreaInteres;
import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOAreasInteres implements IDAOAreaInteres{

	public void registrarAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(area);
		em.getTransaction().commit();
	}

	public AreaInteres buscarAreaInteres(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(AreaInteres.class, id);
	}

	public void editarAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(area);
		em.getTransaction().commit();	
	}

	public List<AreaInteres> listarTodas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(AreaInteres.AREAS_INTERES);
		List<AreaInteres> areas = q.getResultList();
		return areas;
	}

}
