package servicio;

import java.util.List;

import modelo.Cliente;

/**
 * Creación clase abstracta con un arreglo para los valores que se ingresen desde los archivos externos
 * @author Elvis
 *
 */
public abstract class Exportador {

	public abstract void exportar(List<Cliente> listaClientes, String ruta);
	

}
