/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOSectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorSectorEmpresa {

	private BOSectorEmpresa boEmp;
	
	public ControladorSectorEmpresa(){
		boEmp = new BOSectorEmpresa();
	}
	/**
	 * Metodo que se encarga de litar el sector empresa
	 * @return una ista con todo el sector empresa
	 * @throws Exception
	 */
	public List<SectorEmpresa> listarSectores() throws Exception {
		return boEmp.listarSectores();
	}
}
