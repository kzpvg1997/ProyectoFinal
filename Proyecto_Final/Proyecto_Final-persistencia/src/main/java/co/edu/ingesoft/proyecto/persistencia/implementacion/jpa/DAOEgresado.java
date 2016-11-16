/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import javax.persistence.EntityManager;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.HistorialLaboralPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOEgresado implements IDAOEgresado{

	public void crearEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(egresado);
		em.getTransaction().commit();
		
	}

	public Egresado buscarEgresado(int cedula) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Egresado.class, cedula);
	}

	public void editarEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(egresado);
		em.getTransaction().commit();	
	}

	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(info);
		em.getTransaction().commit();
		
	}

	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InfoLaboralEgresado.class, id);
	}

	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(info);
		em.getTransaction().commit();
	}

	

}
