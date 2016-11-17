/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOEmpresa implements IDAOEmpresa{
	
	/**
	 * Metodo encargado de listar las ciudades
	 * @return lista de ciudades
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudades() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.CIUDADES_EMPRESA);
		List<Ciudad> ciudades = q.getResultList();
		return ciudades;
	}
	/**
	 * Metodo encargado de listar los departamentos
	 * @return  lista de Departamentos
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamentos() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.DEPARTAMENTOS_EMPRESA);
		List<Departamento> departamentos = q.getResultList();
		return departamentos;
	}
	/**
	 * Metodo encargado de registrar una empresa
	 * @param emp la empresa que se desea registrar
	 * @throws Exception en caso de que la empresa ya se encuentre registrada
	 */
	public void registrarEmpresa(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	}
	/**
	 * Metodo responsable de buscar una empresa por su nit
	 * @param nit la identificacion de la empresa
	 * @return la empresa
	 * @throws Exception en caso de que la empresa no exista
	 */
	public Empresa buscarEmpresa(int nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, nit);
	}
	/**
	 * Metodo encargado de editar la empresa
	 * @param emp la empresa que se desea editar
	 * @throws Exception en caso de que la empresa no Exista
	 */
	public void editarEmpresa(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
	}
	/**
	 * Metodo encargado de buscar una Ciudad
	 * @param id el ID de la ciudad que se desea buscar
	 * @return la Ciudad
	 * @throws Exception en caso de que la Ciudad No exista
	 */
	public Ciudad buscarCiudad(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Ciudad.class, id);
		
	}
	/**
	 * Metodo responsable de buscar un departamento
	 * @param id el ID del departamento que se desea buscar
	 * @return el Departamento
	 * @throws Exception en caso de el Departamento no exista
	 */
	public Departamento buscarDepartamento(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Departamento.class, id);
	}
	/**
	 * Metodo encargado de buscar un SectorEmpresa
	 * @param id el id del sectroEmpresa que se desaea buscar
	 * @return el sector empresa
	 * @throws Exception en caso de que no exista
	 */
	public SectorEmpresa buscarSectorEmpresa(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(SectorEmpresa.class, id);
	}
	/**
	 * Metodo encargado de listar las empresas
	 * @return lista de empresas
	 * @throws Exception
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.EMPRESAS);
		List<Empresa> empresas = q.getResultList();
		return empresas;
	}
	/**
	 * Metodo encargado de listar LA informacionLaboral por Empresa
	 * @param empresa la empresa que se ingresa para listar
	 * @return lista informacionLaboral por Empresa
	 * @throws Exception
	 */
	public List<InfoLaboralEgresado> listarEgresadosEmpresa(Empresa empresa) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.EMPLEADOS_POR_EMPRESA);
		q.setParameter(1, empresa);
		List<InfoLaboralEgresado> egresados = q.getResultList();
		return egresados;
	}
}
