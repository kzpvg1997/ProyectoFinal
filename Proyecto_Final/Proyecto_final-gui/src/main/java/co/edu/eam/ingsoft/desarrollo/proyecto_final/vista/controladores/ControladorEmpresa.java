/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorEmpresa {

	private BOEmpresa boEmp;
	
	public ControladorEmpresa() {
		boEmp = new BOEmpresa();
	}
	
	public List<Ciudad> listarCiudades() throws Exception {
		return boEmp.listarCiudades();
	}
	
	public List<Departamento> listarDepartamentos() throws Exception {
		return boEmp.listarDepartamentos();
	}
	
	public void registrarEmpresa(Empresa emp) throws Exception {
		boEmp.registrarEmpresa(emp);
	}
	
	public Empresa buscarEmpresa(int nit) throws Exception {
		return boEmp.buscarEmpresa(nit);
	}
	
	public void editarEmpresa(Empresa emp) throws Exception {
		boEmp.editarEmpresa(emp);
	}
}
