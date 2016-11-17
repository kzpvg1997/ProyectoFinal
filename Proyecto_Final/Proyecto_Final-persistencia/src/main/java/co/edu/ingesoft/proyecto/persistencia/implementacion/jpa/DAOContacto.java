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
	
	/**
	 * Metodo responsable de registrar un Contacto para empresa
	 * @param contacto el contacto que se desea registrar
	 * @throws Exception en caso de que ya se alla registrado
	 */
	public void registrarContacto(Contacto contacto) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(contacto);
		em.getTransaction().commit();
	}
	/**
	 * Metodo encargado de buscar un Contacto
	 * @param nit el ID de la empresa que tiene el contacto
	 * @return el contacto
	 * @throws Exception en caso de que no Exista
	 */
	public Contacto buscarContacto(int nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Contacto.class, nit);
	}
	/**
	 * Metodo encargado de editar un Contacto
	 * @param cont el contacto que se desea editar
	 * @throws Exception en caso de que no exista
	 */
	public void editarContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(cont);
		em.getTransaction().commit();
	}

}
