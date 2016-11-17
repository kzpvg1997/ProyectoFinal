package co.edu.eam.disenosoft.proyecto.logica.pruebas.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;

public class BOEditarEmpresaText {


	private BOEmpresa boEmpresa;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaAgregarEmpresa-add.sql");
	}
	
	@Before
	public void setUp(){
		boEmpresa = new BOEmpresa();
		
	}
	@Test
	public void RegistrarEmpresa() throws Exception{
		try{
			Ciudad ciudad = boEmpresa.buscarCiudad(5);
			SectorEmpresa semp = boEmpresa.buscarSectorEmpresa(3);
			
			Empresa emp = new Empresa();
			emp.setNit(2);
			emp.setCitioWeb("www.leganPizza.com");
			emp.setDireccion("Montenegro");
			emp.setFax("57");
			emp.setRazonSocial("PizzaO");
			emp.setTelefono("316");
			emp.setTipoEmpresa(TipoEmpresaEnum.COOPERATIVA);
			emp.setCiudad(ciudad);
			emp.setSector(semp);
			
			
			boEmpresa.editarEmpresa(emp);
			Empresa empresa = boEmpresa.buscarEmpresa(2);
			
			Assert.assertNotNull(empresa);
			Assert.assertEquals("316" , empresa.getTelefono());

		}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
			
		}
	}
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaEmpresa-del.sql");
	}
}
