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
	
	/**
	 * Metodo encargado de crear una EducacionEgresado para un Egresado
	 * @param educacion la EducacionEgresado que se desea crear
	 * @throws Exception en caso que ya exista un registro de EducacionEgresado
	 */
	public void crearEducacionEgresado(EducacionEgresado educacion) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(educacion);
		em.getTransaction().commit();
	}
	/**
	 * Metodo encargado de buscar la EducacionEgresado
	 * @param idEgresado el id del egresado que se desea buscar
	 * @return la EducacionEgresado
	 * @throws Exception en caso de que no exista
	 */
	public EducacionEgresado buscarEducacion(int idEgresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(EducacionEgresado.class, idEgresado);
	}
	/**
	 * Metodo para editar la EducacionEgresado
	 * @param educacion la educacion que se desea modificar
	 * @throws Exception en caso de que no exista educacion registrada
	 */
	public void editarEducaionEgresado(EducacionEgresado educacion) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(educacion);
		em.getTransaction().commit();
	}

}
