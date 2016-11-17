/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOSectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOSectorEmpresa;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOSectorEmpresa {

	private IDAOSectorEmpresa dao;
	
	public BOSectorEmpresa(){
		dao = new DAOSectorEmpresa();
	}
	/**
	 * Metodo encargado de listar los SectoresEmpresa
	 * @return lista de SectorEmpresa
	 * @throws Exception
	 */
	public List<SectorEmpresa> listarSectores() throws Exception {
		return dao.listarSectores();
	}
}
