package servicio;

import java.util.List;

import modelo.Cliente;

public abstract class Exportador {

	public abstract void exportar(List<Cliente> listaClientes, String ruta);
	
//	public abstract void exportadorCsv(List<Cliente> listaClientes, String ruta);
//	
//	public abstract List<Cliente> importar(String ruta);
}
