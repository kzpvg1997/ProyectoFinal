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
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.GeneroEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.NivelEducativoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoCorreoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoDocumentoEnum;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoTelefonoEnum;

public class BOEditarEgresadoText {



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
			Programa pro = boPrograma.buscarPrograma(3);
			
			egresado.setId(111);
			egresado.setNombre("Julian");
			egresado.setCorreo("tan@hot.com");
			egresado.setExtension(11);
			egresado.setGenero(GeneroEnum.MASCULINO);
			egresado.setNumeroTel(3114);
			egresado.setPrefijo(57);
			egresado.setPrimerApellido("RT");
			egresado.setSegundoApellido("Tabares");
			egresado.setTipoCorreo(TipoCorreoEnum.PERSONAL);
			egresado.setTipoDocumento(TipoDocumentoEnum.CEDULA);
			egresado.setTipoTel(TipoTelefonoEnum.PERSONAL);
			egresado.setIdPrograma(pro);
			
			boEgresado.editarEgresado(egresado);
			
			Assert.assertNotNull(egresado);
			Assert.assertEquals("Julian" , egresado.getNombre());
			
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaEliminarEgresado-del.sql");
	}
}
