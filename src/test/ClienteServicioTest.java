package test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Cliente;


/**
 * Generar clase para ejecutar tests
 * @author Elvis
 *
 */
public class ClienteServicioTest {
	
	Cliente cl;

	/**
	 * Se utiliza antes de cada clase
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * Se utiliza desde de cada clase
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Se utiliza antes de todas las clases por 1 vez
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Se utiliza despues de todas las clases por 1 vez
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Se hace prueba con el metodo agregarCliente
	 */
	@Test
	public void agregarCliente() {
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cl);
		for (Cliente cliente : listaClientes) {
			System.out.println(listaClientes.size());
		}
		int Obtenido = listaClientes.size();
		int Esperado = 1;
		assertEquals(Esperado, Obtenido, 0);
		
	}
	
	/**
	 * Se hace prueba con el metodo agregarClienteNull
	 */
	@Test
	public void agregarClienteNull() {
		try {
			List<Cliente> listaClientes = new ArrayList<>();
		
			listaClientes.add(null);
			for (Cliente cliente : listaClientes) {
			System.out.println(cl.getRun());	
			}
			
			String Obtenido = cl.getNombreCliente();
			String Esperado = null;
			assertEquals(Obtenido, Esperado, 0);
			fail("Se esperaba Null Exception");
		} catch (NullPointerException e) {
			
		}
		
	}
	
	

}
