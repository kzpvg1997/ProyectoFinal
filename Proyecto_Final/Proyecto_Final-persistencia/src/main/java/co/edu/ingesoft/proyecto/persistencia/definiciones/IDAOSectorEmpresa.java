/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;


/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos para SectorEmpresa
 */
public interface IDAOSectorEmpresa {
	/**
	 * Metodo encargado de listar los SectoresEmpresa
	 * @return lista de SectorEmpresa
	 * @throws Exception
	 */
	public List<SectorEmpresa> listarSectores()throws Exception;
}
