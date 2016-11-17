package co.edu.eam.disenosoft.proyecto.logica.pruebas.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEducacionEgresado;
import co.edu.eam.disenosoft.proyecto.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.proyecto.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.proyecto.logica.bos.BOPrograma;
import co.edu.ingesoft.proyecto.persistencia.entidades.EducacionEgresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Egresado;
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Programa;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.NivelEducativoEnum;

public class BOCrearBuscarEgresadoTest {


	private BOEgresado boEgresado;
	private BOEducacionEgresado boEducacionEgresado;
	private BOFacultad boFacultad;
	private BOPrograma boPrograma;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaEgresado-add.sql");
	}
	@Before
	public void setUp(){
		boEgresado = new BOEgresado();
		boEducacionEgresado = new BOEducacionEgresado();
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
	}
	@Test
	public void RegistrarEgresado() throws Exception{

		try{
			Egresado egresado = boEgresado.buscarEgresado(111);
			Facultad fa = boFacultad.buscarFacultad(4);
			Programa pro = boPrograma.buscarPrograma(4);

			EducacionEgresado edu = new EducacionEgresado();
			edu.setIdEgresado(egresado);
			edu.setFacultad(fa);
			edu.setPrograma(pro);
			edu.setNivelEducativo(NivelEducativoEnum.TECNOLÓGICO);
			edu.setNivelAcademico("5");
			edu.setAnio(2016);
			edu.setMes(10);
			edu.setNumeroDiploma(1);
			
			/**
			 * Para editar se comenta el metodo crear,  se descomenta el metodo editar y se comenta
			 * el @AfterClass para visualizar los cambios en la bd
			 */
			
			//boEducacionEgresado.editarEducaionEgresado(edu);	// Metodo para editar
			boEducacionEgresado.crearEducacionEgresado(edu);	//Metodo para crear
			
			EducacionEgresado educaEgresado =  boEducacionEgresado.buscarEducacion(egresado.getId());

			Assert.assertNotNull(educaEgresado);
			Assert.assertEquals("5" , educaEgresado.getNivelAcademico());

		}catch(Exception e){
			//e.printStackTrace();
			Assert.fail();
			
		}
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaEgresado-del.sql");
	}
	
}
