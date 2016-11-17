/**
 * 
 */
package co.edu.ingesoft.proyecto.persistencia.definiciones;


import java.sql.SQLException;
import java.util.List;

import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicada;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaAplicadaPK;
import co.edu.ingesoft.proyecto.persistencia.entidades.OfertaLaboral;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;

/**
 * @author TOSHIBAP55W
 *clase encargada de la declaracion de los diferentes metodos para OfertaEmpresa y OfertaAplicada
 */
public interface IDAOOfertaEmpresa {

	/**
	 * Metodo encargado de generar una oferta laboral
	 * @param oferta la oferta que se desea registrar
	 * @throws Exception en caso de que ya exista una oferta
	 */
	public void gernerarOferta (OfertaLaboral oferta)throws Exception;
	/**
	 * Metodo encargado de el ID de oferta sea autoincrementable cogiendo el ultimo valor
	 * @return el ID+1
	 * @throws SQLException en caso de error en la conexion
	 */
	public int autoIncrementable ()throws SQLException;
	/**
	 * Metodo responsab;e de buscar una OfertaLaboral
	 * @param idOferta la id de la oferta (Autoincrementable)
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public OfertaLaboral buscarOfertaLaboral (int idOferta)throws Exception;
	/**
	 * Metodo encargado de listar las Ofertas Laborales
	 * @return lista de Ofertas laborales
	 * @throws Exception
	 */
	public List<OfertaLaboral> listarOfertas()throws Exception;
	/**
	 * Metodo encargado de aplicar una oferta laboral a un egresado
	 * @param ofertaApli la oferta que se desea aplicar
	 * @throws Exception en caso de que ya alla aplicado una oferta
	 */
	public void aplicarOfertaEgresado (OfertaAplicada ofertaApli)throws Exception;
	/**
	 * Metodo responsable de buscar una OfertaAplicada
	 * @param idsoferta el id del egresado, y el id de la ofertaLaboral
	 * @return la OfertaAplicada
	 * @throws Exception en caso de que no exista ofertaAplicada
	 */
	public OfertaAplicada buscarOfertaAplicada (OfertaAplicadaPK idsoferta)throws Exception;
	/**
	 * Metodo encargado de buscar una oferta Laboral por programa academico
	 * @param pro el programa que recibe para buscar la oferta
	 * @return la oferta Laboral
	 * @throws Exception en caso de que no exista
	 */
	public List<OfertaLaboral> buscarOfertaPorPrograma (Programa pro)throws Exception;
	
}
