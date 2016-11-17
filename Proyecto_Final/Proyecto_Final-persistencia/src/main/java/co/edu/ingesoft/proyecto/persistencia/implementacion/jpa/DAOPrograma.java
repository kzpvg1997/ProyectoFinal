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
	/**
	 *Metodo encargado de listar los programas 
	 * @return lista de los programas registrados
	 * @throws Exception 
	 */
	public List<Programa> listarProgramas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Programa.PROGRAMAS);
		List<Programa> programas = q.getResultList();
		return programas;
	}
	/**
	 * Metodo responsable de la busqueda de un Programa
	 * @param id el id del programa que desea buscar
	 * @return el Programa
	 * @throws Exception en caso de que no exista el Programa
	 */
	public Programa buscarPrograma(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Programa.class, id);
	}
	/**
	 * Metodo encargado de registrar un programa
	 * @param programa el programa que se desa registrar
	 * @throws Exception en caso de que el programa ya se encuentre registrado
	 */
	public void registrarPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(programa);
		em.getTransaction().commit();
	}
	/**
	 * Metodo responsable de la edicion de un Prorama
	 * @param programa el programa que se desa editar
	 * @throws Exception en caso de que no exista el programa
	 */
	public void editarPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(programa);
		em.getTransaction().commit();	
	}

}
