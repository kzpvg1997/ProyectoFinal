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
	
	public List<Ciudad> listarCiudades() throws Exception {
		return dao.listarCiudades();
	}
	
	public List<Departamento> listarDepartamentos() throws Exception {
		return dao.listarDepartamentos();
	}

	public void registrarEmpresa(Empresa emp) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(emp.getNit());
		
		if(ep!=null){
			throw new ExcepcionNegocio("Esta empresa ya se encuentra registrada");
		}else{
			dao.registrarEmpresa(emp);
		}
	}
	
	public Empresa buscarEmpresa(int nit) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(nit);
		
		if(ep!=null){
			return ep;
		}else{
			throw new ExcepcionNegocio("Esta empresa con NIT  ''"+nit+"'' (NO) se encuentra registrada");
		}
	}
	public void editarEmpresa(Empresa emp) throws Exception {
		
		Empresa ep = dao.buscarEmpresa(emp.getNit());
		
		if(ep!=null){
			dao.editarEmpresa(emp);
		}else{
			throw new ExcepcionNegocio("Esta empresa con NIT  ''"+emp.getNit()+"'' (NO) se encuentra registrada");
		}
	}
	
	public Ciudad buscarCiudad(int id) throws Exception {
		Ciudad ciudad = dao.buscarCiudad(id);
		if(ciudad!=null){
			return ciudad;
		}else{
			throw new ExcepcionNegocio("Esta ciudad con id  ''"+id+"'' (NO) se encuentra registrada");
		}
	}
	public Departamento buscarDepartamento(int id) throws Exception {
		Departamento dep = dao.buscarDepartamento(id);
		if(dep!=null){
			return dep;
		}else{
			throw new ExcepcionNegocio("Este departamento con id  ''"+id+"'' (NO) se encuentra registrado");
		}
	}
	public SectorEmpresa buscarSectorEmpresa(int id) throws Exception {
		SectorEmpresa semp = dao.buscarSectorEmpresa(id);
		if(semp!=null){
			return semp;
		}else{
			throw new ExcepcionNegocio("Este sector empresarial con id  ''"+id+"'' (NO) se encuentra registrado");
		}
	}
	
	public List<Empresa> listarEmpresas() throws Exception {
		return dao.listarEmpresas();
	}
}
