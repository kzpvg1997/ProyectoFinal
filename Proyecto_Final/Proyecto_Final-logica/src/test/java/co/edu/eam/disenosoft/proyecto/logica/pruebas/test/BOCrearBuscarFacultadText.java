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
import co.edu.ingesoft.proyecto.persistencia.entidades.Facultad;

public class BOCrearBuscarFacultadText {

	private BOFacultad boFacultad;
	
	@BeforeClass
	public static void beforeClass(){
		
	}
	
	@Before
	public void setUp(){
		boFacultad = new BOFacultad();
	}
	
	@Test
	public void RegistrarFacultad() throws Exception{
		try{
			Facultad fa = new Facultad();
			fa.setIdFacultad(3);
			fa.setNombreFacultad("Mecanica");
			boFacultad.registrarFacultad(fa);

			Assert.assertNotNull(fa);
			Assert.assertEquals("Mecanica" , fa.getNombreFacultad());
			
		}catch(Exception e){
			Assert.fail();
		}
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaFacultad-del.sql");
		
	}
}
