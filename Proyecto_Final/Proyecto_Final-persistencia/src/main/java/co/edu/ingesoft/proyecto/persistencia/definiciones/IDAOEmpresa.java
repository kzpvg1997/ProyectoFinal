/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;

import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.InfoLaboralEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;


/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos para Empresa,InformacionLaboral,Ciudad,Departamento
 */
public interface IDAOEmpresa {
	/**
	 * Metodo encargado de listar las ciudades
	 * @return lista de ciudades
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudades() throws Exception;
	/**
	 * Metodo encargado de listar los departamentos
	 * @return  lista de Departamentos
	 * @throws Exception
	 */
	public List<Departamento> listarDepartamentos() throws Exception;
	/**
	 * Metodo encargado de listar las empresas
	 * @return lista de empresas
	 * @throws Exception
	 */
	public List<Empresa> listarEmpresas()throws Exception;
	/**
	 * Metodo encargado de listar LA informacionLaboral por Empresa
	 * @param empresa la empresa que se ingresa para listar
	 * @return lista informacionLaboral por Empresa
	 * @throws Exception
	 */
	public List<InfoLaboralEgresado> listarEgresadosEmpresa(Empresa empresa)throws Exception;
	/**
	 * Metodo encargado de registrar una empresa
	 * @param emp la empresa que se desea registrar
	 * @throws Exception en caso de que la empresa ya se encuentre registrada
	 */
	public void registrarEmpresa (Empresa emp)throws Exception;
	/**
	 * Metodo responsable de buscar una empresa por su nit
	 * @param nit la identificacion de la empresa
	 * @return la empresa
	 * @throws Exception en caso de que la empresa no exista
	 */
	public Empresa buscarEmpresa (int nit)throws Exception;
	/**
	 * Metodo encargado de editar la empresa
	 * @param emp la empresa que se desea editar
	 * @throws Exception en caso de que la empresa no Exista
	 */
	public void editarEmpresa (Empresa emp)throws Exception;
	/**
	 * Metodo encargado de buscar una Ciudad
	 * @param id el ID de la ciudad que se desea buscar
	 * @return la Ciudad
	 * @throws Exception en caso de que la Ciudad No exista
	 */
	public Ciudad buscarCiudad (int id)throws Exception;
	/**
	 * Metodo responsable de buscar un departamento
	 * @param id el ID del departamento que se desea buscar
	 * @return el Departamento
	 * @throws Exception en caso de el Departamento no exista
	 */
	public Departamento buscarDepartamento(int id)throws Exception;
	/**
	 * Metodo encargado de buscar un SectorEmpresa
	 * @param id el id del sectroEmpresa que se desaea buscar
	 * @return el sector empresa
	 * @throws Exception en caso de que no exista
	 */
	public SectorEmpresa buscarSectorEmpresa(int id)throws Exception;
	/**
	 * Metodo encargado de listar las ciudades por departamento
	 * @param departamento el departamento contenedor de las ciudades
	 * @return lista de ciudades
	 * @throws Exception en caso de que no existan ciudades
	 */
	public List<Ciudad> listarCiudadesPorDepartamento (Departamento departamento)throws Exception;
	
}
