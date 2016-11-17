/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;


/**
 * @author TOSHIBAP55W
 *
 */
public interface IDAOEmpresa {

	public List<Ciudad> listarCiudades() throws Exception;
	
	public List<Departamento> listarDepartamentos() throws Exception;
	
	public List<Empresa> listarEmpresas()throws Exception;
	
	public void registrarEmpresa (Empresa emp)throws Exception;
	
	public Empresa buscarEmpresa (int nit)throws Exception;
	
	public void editarEmpresa (Empresa emp)throws Exception;
	
	public Ciudad buscarCiudad (int id)throws Exception;
	
	public Departamento buscarDepartamento(int id)throws Exception;
	
	public SectorEmpresa buscarSectorEmpresa(int id)throws Exception;
}
