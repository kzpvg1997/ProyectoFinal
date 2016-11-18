/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOEgresado implements IDAOEgresado{
	
	/**
	 * Metodo encargado de crear un egresado
	 * @param egresado el egresado que se desea crear
	 * @throws Exception en caso que el egresado ya este registrado
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(egresado);
		em.getTransaction().commit();
		
	}
	/**
	 * Metodo encargado de buscar un egresado
	 * @param cedula la cedula o ID del egresado que se desea buscar
	 * @return el egresado
	 * @throws Exception en caso que el Egresado no exista
	 */
	public Egresado buscarEgresado(int cedula) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Egresado.class, cedula);
	}
	/**
	 * Metodo encargado de editar un Egresado
	 * @param egresado el egresado que se desea editar
	 * @throws Exception en caso de que el egresado no exista
	 * 
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(egresado);
		em.getTransaction().commit();	
	}
	/**
	 * Metodo encargado de registrar la InformacionLaboral de un Egresado
	 * @param info la informacion que se desea registrar
	 * @throws Exception en caso de que la informacion ya este registrada
	 */
	public void registrarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(info);
		em.getTransaction().commit();
		
	}
	/**
	 * Metodo encargado de buscar la InfotmacionLaboral del Egresafo
	 * @param id el id del egresado que desea obtener la informacion laboral
	 * @return la informacion laboral del Egresado
	 * @throws Exception en caso de que no exista informacion registrada
	 */
	public InfoLaboralEgresado buscarInfoLaboral(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InfoLaboralEgresado.class, id);
	}
	/**
	 * Metodo encargado de editar la informacion laboral de un egresado
	 * @param info la informacion laboral que se desea editar
	 * @throws Exception en caso de que no exista informacionLaboral
	 */
	public void editarInfoLaboral(InfoLaboralEgresado info) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(info);
		em.getTransaction().commit();
	}
	/**
	 *  Metodo encargado de listar la informacion laboral
	 * @return la informacion laboral de u  egresado
	 * @throws Exception en caso de que no exista informacion laboral
	 */
	public List<InfoLaboralEgresado> listarInformacionLaboral() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InfoLaboralEgresado.LISTAR_INFO_LABORAL);
		List<InfoLaboralEgresado> informaciones = q.getResultList();
		return informaciones;
	}
	/**
	 * Lista la informacion Laboral de un egresado por Programa academico
	 * @param programa el programa a la cula se le desea saber la lista
	 * @return lista de informacion
	 * @throws Exception en caso de que no exista informacion
	 */
	public List<InfoLaboralEgresado> listarInfoporPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InfoLaboralEgresado.LISTAR_INFO_POR_PROGRAMA);
		q.setParameter(1, programa);
		List<InfoLaboralEgresado> informaciones = q.getResultList();
		return informaciones;
	}
}
