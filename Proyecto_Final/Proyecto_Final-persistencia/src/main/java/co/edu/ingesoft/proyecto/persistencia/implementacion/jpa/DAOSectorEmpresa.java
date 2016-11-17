/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOSectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.utilidades.AdministradorEntityManager;

/**
 * @author TOSHIBAP55W
 *
 */
public class DAOSectorEmpresa implements IDAOSectorEmpresa{
	/**
	 * Metodo encargado de listar los SectoresEmpresa
	 * @return lista de SectorEmpresa
	 * @throws Exception
	 */
	public List<SectorEmpresa> listarSectores() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorEmpresa.SECTORES_EMPRESA);
		List<SectorEmpresa> sectores = q.getResultList();
		return sectores;
	}

}
