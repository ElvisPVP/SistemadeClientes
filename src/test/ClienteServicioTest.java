package test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Cliente;



public class ClienteServicioTest {
	
	Cliente cl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
	
	@Test
	public agregarClienteNull() {
		List<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cl.getNombreCliente());
		for (Cliente cliente : listaClientes) {
			System.out.println(cl.getRun());
		}
		String Obtenido = cl.getNombreCliente();
		String Esperado = null;
		assertEquals(Obtenido, Esperado, 0);
	}
	
	

}
