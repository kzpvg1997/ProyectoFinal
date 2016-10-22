/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOContacto;
import co.edu.ingesoft.proyecto.persistencia.entidades.Contacto;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOContacto implements IDAOContacto{

	public void registrarContacto(Contacto contacto) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(contacto);
		em.getTransaction().commit();
	}

	public Contacto buscarContacto(int nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Contacto.class, nit);
	}

	public void editarContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(cont);
		em.getTransaction().commit();
	}

}
