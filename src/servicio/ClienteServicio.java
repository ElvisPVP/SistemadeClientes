package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

/**
 * Creaci�n de la clase "ClienteServicio"
 * @author Elvis
 *
 */
public class ClienteServicio {

	/**
	 * Creaci�n de arreglo List para Cliente
	 */
	private List<Cliente> listaClientes;
	
	/**
	 * Creaci�n de Constructor
	 */
	public ClienteServicio()
	{
		listaClientes = new ArrayList<>();
	}
	
	
	/**
	 * Creaci�n de Getters y Setters
	 * @return
	 */
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}



	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	/**
	 * Creaci�n del To String
	 */
	@Override
	public String toString() {
		return "ClienteServicio [listaClientes=" + listaClientes + "]";
	}
	/**
	 * Creaci�n del metodo agregar para ingresar la informaci�n al arreglo listaClientes
	 * @param cl
	 */
	public void agregar(Cliente cl)
	{
		if (buscar(cl.getRun()) == null) {
			listaClientes.add(cl);
			System.out.println("Cliente agregado");
		} else {
			System.out.println("El run ya est� registrado");
		}
	}
	/**
	 * Creaci�n del metodo buscar para identificar si el dato para ingresar esta incluido o no
	 * @param run
	 * @return
	 */
	public Cliente buscar(String run)
	{
		for (Cliente cliente : listaClientes) {
			if (cliente.getRun().equals(run)) {
				return cliente;
			}
		} return null;
		
	}
	
	/**
	 * Metodo para mostrar los elementos del arreglo listaClientes
	 */
	public void listarClientes()
	{
		
		listaClientes.stream().forEach(cl -> System.out.println(cl.toString()));
		
	}
	
}
