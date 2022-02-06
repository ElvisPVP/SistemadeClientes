package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

/**
 * Creación de la clase "ClienteServicio"
 * @author Elvis
 *
 */
public class ClienteServicio {

	/**
	 * Creación de arreglo List para Cliente
	 */
	private List<Cliente> listaClientes;
	
	/**
	 * Creación de Constructor
	 */
	public ClienteServicio()
	{
		listaClientes = new ArrayList<>();
	}
	
	
	/**
	 * Creación de Getters y Setters
	 * @return
	 */
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}



	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	/**
	 * Creación del To String
	 */
	@Override
	public String toString() {
		return "ClienteServicio [listaClientes=" + listaClientes + "]";
	}
	/**
	 * Creación del metodo agregar para ingresar la información al arreglo listaClientes
	 * @param cl
	 */
	public void agregar(Cliente cl)
	{
		if (buscar(cl.getRun()) == null) {
			listaClientes.add(cl);
			System.out.println("Cliente agregado");
		} else {
			System.out.println("El run ya está registrado");
		}
	}
	/**
	 * Creación del metodo buscar para identificar si el dato para ingresar esta incluido o no
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
