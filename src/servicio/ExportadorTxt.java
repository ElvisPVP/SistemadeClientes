package servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import modelo.Cliente;
import utilidad.Util;

/**
 * Se crea clase ExportadorTxt que toma los metodos de Exportador
 */
public class ExportadorTxt extends Exportador {
	
	Util ut = new Util();

	/**
	 * Se crea metodo exportar para traer los valores de archivos con extensión .txt
	 */
	@Override
	public void exportar(List<Cliente> listaClientes, String ruta) {
		String path = String.format("%s\\clientes.txt", ruta);
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
				System.out.println("Datos de clientes exportados correctamente en formato txt.");
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
				System.out.println("Datos de clientes exportados correctamente en formato txt.");
				ut.limpiarPantallaNormal();
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}
}
