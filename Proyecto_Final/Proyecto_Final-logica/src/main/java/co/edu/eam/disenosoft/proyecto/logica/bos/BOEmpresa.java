/**
 * 
 */
package co.edu.eam.disenosoft.proyecto.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.proyecto.logica.excepciones.ExcepcionNegocio;
import co.edu.ingesoft.proyecto.persistencia.definiciones.IDAOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.implementacion.jpa.DAOEmpresa;

/**
 * @author TOSHIBAP55W
 *
 */
public class BOEmpresa {

	private IDAOEmpresa dao;
	
	public BOEmpresa(){
		dao = new  DAOEmpresa();
	}
	/**
	 * Metodo encargado de listar las ciudades
	 * @return lista de ciudades
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudades() throws Exception {
		return dao.listarCiudades();
	}
	/**
	 * Metodo encargado de listar los departamentos
	 * @return  lista de Departamentos
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamentos() throws Exception {
		return dao.listarDepartamentos();
	}
	/**
	 * Metodo encargado de registrar una empresa
	 * @param emp la empresa que se desea registrar
	 * @throws Exception en caso de que la empresa ya se encuentre registrada
	 */
	public void registrarEmpresa(Empresa emp) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(emp.getNit());
		
		if(ep!=null){
			throw new ExcepcionNegocio("Esta empresa ya se encuentra registrada");
		}else{
			dao.registrarEmpresa(emp);
		}
	}
	/**
	 * Metodo responsable de buscar una empresa por su nit
	 * @param nit la identificacion de la empresa
	 * @return la empresa
	 * @throws Exception en caso de que la empresa no exista
	 */
	public Empresa buscarEmpresa(int nit) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(nit);
		
		if(ep!=null){
			return ep;
		}else{
			throw new ExcepcionNegocio("Esta empresa con NIT  ''"+nit+"'' (NO) se encuentra registrada");
		}
	}
	/**
	 * Metodo encargado de editar la empresa
	 * @param emp la empresa que se desea editar
	 * @throws Exception en caso de que la empresa no Exista
	 */
	public void editarEmpresa(Empresa emp) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(emp.getNit());
		
		if(ep!=null){
			dao.editarEmpresa(emp);
		}else{
			throw new ExcepcionNegocio("Esta empresa con NIT  ''"+emp.getNit()+"'' (NO) se encuentra registrada");
		}
	}
	/**
	 * Metodo encargado de buscar una Ciudad
	 * @param id el ID de la ciudad que se desea buscar
	 * @return la Ciudad
	 * @throws Exception en caso de que la Ciudad No exista
	 */
	public Ciudad buscarCiudad(int id) throws Exception {
		Ciudad ciudad = dao.buscarCiudad(id);
		if(ciudad!=null){
			return ciudad;
		}else{
			throw new ExcepcionNegocio("Esta ciudad con id  ''"+id+"'' (NO) se encuentra registrada");
		}
	}
	/**
	 * Metodo responsable de buscar un departamento
	 * @param id el ID del departamento que se desea buscar
	 * @return el Departamento
	 * @throws Exception en caso de el Departamento no exista
	 */
	public Departamento buscarDepartamento(int id) throws Exception {
		Departamento dep = dao.buscarDepartamento(id);
		if(dep!=null){
			return dep;
		}else{
			throw new ExcepcionNegocio("Este departamento con id  ''"+id+"'' (NO) se encuentra registrado");
		}
	}
	/**
	 * Metodo encargado de buscar un SectorEmpresa
	 * @param id el id del sectroEmpresa que se desaea buscar
	 * @return el sector empresa
	 * @throws Exception en caso de que no exista
	 */
	public SectorEmpresa buscarSectorEmpresa(int id) throws Exception {
		SectorEmpresa semp = dao.buscarSectorEmpresa(id);
		if(semp!=null){
			return semp;
		}else{
			throw new ExcepcionNegocio("Este sector empresarial con id  ''"+id+"'' (NO) se encuentra registrado");
		}
	}
	/**
	 * Metodo encargado de listar las empresas
	 * @return lista de empresas
	 * @throws Exception
	 */
	public List<Empresa> listarEmpresas() throws Exception {
		return dao.listarEmpresas();
	}
	/**
	 * Metodo encargado de listar LA informacionLaboral por Empresa
	 * @param empresa la empresa que se ingresa para listar
	 * @return lista informacionLaboral por Empresa
	 * @throws Exception
	 */
	public List<InfoLaboralEgresado> listarEgresadosEmpresa(Empresa empresa) throws Exception {
		return dao.listarEgresadosEmpresa(empresa);
	}
}
