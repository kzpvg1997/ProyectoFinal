package co.edu.eam.disenosoft.proyecto.logica.pruebas.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.disenosoft.proyecto.logica.bos.BOEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.Ciudad;
import co.edu.ingesoft.proyecto.persistencia.entidades.Departamento;
import co.edu.ingesoft.proyecto.persistencia.entidades.Empresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.SectorEmpresa;
import co.edu.ingesoft.proyecto.persistencia.entidades.enumeraciones.TipoEmpresaEnum;

public class BOCrearBuscarEmpresaTest {

	private BOEmpresa boEmpresa;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/PruebaEmpresa-add.sql");
	}
	
	@Before
	public void setUp(){
		boEmpresa = new BOEmpresa();
		
	}
	@Test
	public void RegistrarEmpresa() throws Exception{
		try{
			Ciudad ciudad = boEmpresa.buscarCiudad(4);
			SectorEmpresa semp = boEmpresa.buscarSectorEmpresa(3);
			
			Empresa emp = new Empresa();
			emp.setNit(2);
			emp.setCitioWeb("www.Hola.edu.co");
			emp.setDireccion("Mas alla de alla");
			emp.setFax("88");
			emp.setRazonSocial("HL");
			emp.setTelefono("01800");
			emp.setTipoEmpresa(TipoEmpresaEnum.MIXTA);
			emp.setCiudad(ciudad);
			emp.setSector(semp);
			
			boEmpresa.registrarEmpresa(emp);
			Empresa empresa = boEmpresa.buscarEmpresa(2);
			
			Assert.assertNotNull(empresa);
			Assert.assertEquals("HL" , empresa.getRazonSocial());

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
