/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOEducacionEgresado implements IDAOEducacionEgresado{

	public void crearEducacionEgresado(EducacionEgresado educacion) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(educacion);
		em.getTransaction().commit();
	}

	public EducacionEgresado buscarEducacion(int idEgresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(EducacionEgresado.class, idEgresado);
	}

	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(educacion);
		em.getTransaction().commit();
	}

}
