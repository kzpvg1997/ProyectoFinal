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
	/**
	 * Metodo encargado de listar las Facultades
	 * @return lista de facultades
	 * @throws Exception
	 */
	public List<Facultad> listarFacultades() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Facultad.FACULTADES);
		List<Facultad> facultades = q.getResultList();
		return facultades;
	}
	/**
	 * Metodo responsable de buscar una Facultad
	 * @param idFacultad el id de la facultad que se desea buscar
	 * @return la Facultad
	 * @throws Exception en caso de que no exista
	 */
	public Facultad buscarFacultad(int idFacultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Facultad.class, idFacultad);
	}
	/**
	 * metodo encargado de registrar una Facultad
	 * @param facultad la facultad que se desea registrar
	 * @throws Exception en caso de que esta facultad ya exista
	 */
	public void registrarFacultad(Facultad facultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(facultad);
		em.getTransaction().commit();
	}
	/**
	 * metodo para esitar una facultad
	 * @param facultad la facultad que se desea editar
	 * @throws Exception en caso de que la facultad no exista
	 */
	public void editarFacultad(Facultad facultad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(facultad);
		em.getTransaction().commit();	
	}



}
