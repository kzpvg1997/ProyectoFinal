/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;


/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOSectorEmpresa {

	public List<SectorEmpresa> listarSectores()throws Exception;
}
