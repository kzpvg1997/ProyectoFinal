/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOAreaInteres;
import co.edu.ingesoft.proyecto.persistencia.entidades.AreaInteres;
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

}
