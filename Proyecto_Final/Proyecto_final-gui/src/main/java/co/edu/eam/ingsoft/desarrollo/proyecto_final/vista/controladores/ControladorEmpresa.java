/**
 * 
 */
package co.edu.eam.ingsoft.desarrollo.proyecto_final.vista.controladores;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;

/**
 * @author TOSHIBAP55W
 *
 */
public class ControladorEmpresa {

	private BOEmpresa boEmp;
	
	public ControladorEmpresa() {
		boEmp = new BOEmpresa();
	}
	/**
	 * Metodo encargado de listar todas las ciudades 
	 * @return una lista con la ciudades
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudades() throws Exception {
		return boEmp.listarCiudades();
	}
	/**
	 * MEtodo que se encarga de listar los departamentos
	 * @return una lista con todos los departamentos listados
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamentos() throws Exception {
		return boEmp.listarDepartamentos();
	}
	/**
	 * Metodo para regitar una empresa
	 * @param emp que se va registrar
	 * @throws Exception
	 */
	public void registrarEmpresa(Empresa emp) throws Exception {
		boEmp.registrarEmpresa(emp);
	}
	/**
	 * MEtodo que se encarga de buscar una empresa
	 * @param nit por la cual se va buscar la empresa
	 * @return la empresa que se ha buscado
	 * @throws Exception
	 */
	public Empresa buscarEmpresa(int nit) throws Exception {
		return boEmp.buscarEmpresa(nit);
	}
	/**
	 * MEtodo que se encarga deeditar una empresa
	 * @param emp empresa que se va editar
	 * @throws Exception
	 */
	public void editarEmpresa(Empresa emp) throws Exception {
		boEmp.editarEmpresa(emp);
	}
	/**
	 * Metodo que se encarga de listar las empresas
	 * @return todas las empresas listadas
	 * @throws Exception
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		return boEmp.listarEmpresas();
	}
	/**
	 * Metodo que se encarga de listar toda la informacion laboral
	 * @param empresa por la cual se va listar la info laboral
	 * @return el listado de la inforamcion laboral
	 * @throws Exception
	 */
	public List<InfoLaboralEgresado> listarEgresadosEmpresa(Empresa empresa) throws Exception {
		return boEmp.listarEgresadosEmpresa(empresa);
	}
	
	/**
	 * Metodo encargado de listar las ciudades por departamento
	 * @param departamento el departamento contenedor de las ciudades
	 * @return lista de ciudades
	 * @throws Exception en caso de que no existan ciudades
	 */
	public List<Ciudad> listarCiudadesPorDepartamento(Departamento departamento) throws Exception {
		return boEmp.listarCiudadesPorDepartamento(departamento);
	}
}
