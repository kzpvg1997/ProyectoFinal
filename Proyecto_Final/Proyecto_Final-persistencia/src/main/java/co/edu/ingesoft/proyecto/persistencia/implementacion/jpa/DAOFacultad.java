/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOFacultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOFacultad implements IDAOFacultad{

	public List<Facultad> listarFacultades() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Facultad.FACULTADES);
		List<Facultad> facultades = q.getResultList();
		return facultades;
	}

	public Facultad buscarFacultad(int idFacultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Facultad.class, idFacultad);
	}

	public void registrarFacultad(Facultad facultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(facultad);
		em.getTransaction().commit();
	}

	public void editarFacultad(Facultad facultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(facultad);
		em.getTransaction().commit();	
	}



}
