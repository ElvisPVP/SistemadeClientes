package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import modelo.Cliente;
import utilidad.Util;

/**
 * Creación de clase ExportadorCsv que toma los metodos de la clase Exportador
 * @author Elvis
 *
 */
public class ExportadorCsv extends Exportador{
	
	Util ut = new Util();
	
	/**
	 * Metodo exportar para los archivos con formato .csv
	 */
	@Override
	public void exportar(List<Cliente> listaClientes, String ruta) {
		String path = String.format("%s\\clientes.csv", ruta);
		File archivo = new File(path);
		if (archivo.exists() == false) {
			try {
				archivo.createNewFile();
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter escritor = new BufferedWriter(fw);
				for (Cliente cliente : listaClientes) {
					String cl = String.format("%s,%s,%s,%s,%s", cliente.getRun(), cliente.getNombreCliente(),
							cliente.getApellidoCliente(), cliente.getAniosCliente(), cliente.getNombreCategoria());
					escritor.write(cl);
					escritor.newLine();
				}
				escritor.close();
				System.out.println("Datos de clientes exportados correctamente en formato csv.");
				ut.limpiarPantallaNormal();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter escritor = new BufferedWriter(fw);
				for (Cliente cliente : listaClientes) {
					String cl = String.format("%s,%s,%s,%s,%s", cliente.getRun(), cliente.getNombreCliente(),
							cliente.getApellidoCliente(), cliente.getAniosCliente(), cliente.getNombreCategoria());
					escritor.write(cl);
					escritor.newLine();
				}
				escritor.close();
				System.out.println("Datos de clientes exportados correctamente en formato csv.");
				ut.limpiarPantallaNormal();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}

}
