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

	public List<Ciudad> listarCiudades() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.CIUDADES_EMPRESA);
		List<Ciudad> ciudades = q.getResultList();
		return ciudades;
	}

	public List<Departamento> listarDepartamentos() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.DEPARTAMENTOS_EMPRESA);
		List<Departamento> departamentos = q.getResultList();
		return departamentos;
	}

	public void registrarEmpresa(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	}

	public Empresa buscarEmpresa(int nit) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, nit);
	}

	public void editarEmpresa(Empresa emp) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
	}

	public Ciudad buscarCiudad(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Ciudad.class, id);
		
	}

	public Departamento buscarDepartamento(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Departamento.class, id);
	}

	public SectorEmpresa buscarSectorEmpresa(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(SectorEmpresa.class, id);
	}

	public List<Empresa> listarEmpresas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.EMPRESAS);
		List<Empresa> empresas = q.getResultList();
		return empresas;
	}

	public List<InfoLaboralEgresado> listarEgresadosEmpresa(Empresa empresa) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Empresa.EMPLEADOS_POR_EMPRESA);
		q.setParameter(1, empresa);
		List<InfoLaboralEgresado> egresados = q.getResultList();
		return egresados;
	}
}
