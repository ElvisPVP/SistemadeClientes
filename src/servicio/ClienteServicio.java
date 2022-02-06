package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

public class ClienteServicio {

	private List<Cliente> listaClientes;
	
	public ClienteServicio()
	{
		listaClientes = new ArrayList<>();
	}
	
	

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}



	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}



	@Override
	public String toString() {
		return "ClienteServicio [listaClientes=" + listaClientes + "]";
	}

	public void agregar(Cliente cl)
	{
		if (buscar(cl.getRun()) == null) {
			listaClientes.add(cl);
			System.out.println("Cliente agregado");
		} else {
			System.out.println("El run ya está registrado");
		}
	}
	
	public Cliente buscar(String run)
	{
		for (Cliente cliente : listaClientes) {
			if (cliente.getRun().equals(run)) {
				return cliente;
			}
		} return null;
	}
	
	
	public void listarClientes()
	{
		//foreach
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.toString());
		}
		
//		//for
//		for (int i = 0; i < listaProducto.size(); i++) {
//			System.out.println(listaProducto.get(i));			
//		}
//		
//		//for con iterator
//		for (Iterator iterator = listaProducto.iterator(); iterator.hasNext();) {
//			System.out.println(iterator.next().toString());			
//		}
//		
//		//while
//		int i = 0;
//		while (i < listaProducto.size()) {
//			System.out.println(listaProducto.get(i));
//			i++;
//		}
//		
//		//while con iterator
//		Iterator<Producto> iter = listaProducto.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next().toString());			
//		}
//		
//		//clase Stream con Lambda
//		listaProducto.stream().forEach(pro -> System.out.println(pro.toString()));
//		//clase Stream con Lambda y métodos de java 8
//		listaProducto.stream().forEach(System.out::print);
	}
	
}
