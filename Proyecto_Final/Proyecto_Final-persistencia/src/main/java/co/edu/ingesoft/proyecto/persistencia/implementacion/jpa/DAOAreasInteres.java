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
	
	/**
	 *Metodo responsable de el registro de una AreaInteres 
	 * @param area el area que se desea crear
	 * @throws Exception en caso de que ya este creada
	 */
	public void registrarAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(area);
		em.getTransaction().commit();
	}
	/**
	 * Metodo responsable de buscar un AreaInteres
	 * @param id el id del area que se desea buscar
	 * @return el area
	 * @throws Exception en caso de que no exista
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(AreaInteres.class, id);
	}
	/**
	 * Metodo responsable de la edicion de un AreaInteres
	 * @param area el area que se desea editar
	 * @throws Exception en caso de que el area no Exista
	 */
	public void editarAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(area);
		em.getTransaction().commit();	
	}
	/**
	 * Metodo responsable de listar todas las AreasInteres
	 * @return lista de AreasInteres
	 * @throws Exception 
	 */
	public List<AreaInteres> listarTodas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(AreaInteres.AREAS_INTERES);
		List<AreaInteres> areas = q.getResultList();
		return areas;
	}

}
