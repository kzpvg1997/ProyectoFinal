/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOPrograma;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOPrograma implements IDAOPrograma{

	public List<Programa> listarProgramas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.PROGRAMAS);
		List<Programa> programas = q.getResultList();
		return programas;
	}

	public Programa buscarPrograma(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Programa.class, id);
	}

	public void registrarPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(programa);
		em.getTransaction().commit();
	}

	public void editarPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(programa);
		em.getTransaction().commit();	
	}

}
