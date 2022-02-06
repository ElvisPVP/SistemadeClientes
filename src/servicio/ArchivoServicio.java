package servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Categoria;
import modelo.Cliente;



public class ArchivoServicio extends Exportador{
	
	private Categoria en;

	@Override
	public void exportar(List<Cliente> listaClientes, String ruta) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Cliente> importar(String ruta) {
		List<Cliente> lista = new ArrayList<>();
		String path = String.format("%s\\DBClientes.csv", ruta);
		File archivo = new File(path);
		if (archivo.exists()) {
			try {
				FileReader rd = new FileReader(archivo);
				BufferedReader lector = new BufferedReader(rd);

				String data = lector.readLine();
				while (data != null) {
					String[] datos = data.split(",");
					Cliente cl = new Cliente(datos[0], datos[1], datos[2], datos[3], Categoria.INACTIVO);
					lista.add(cl);
					data = lector.readLine();
				}
				lector.close();
			} catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
				// Archivo no existe
			} catch (IOException e) {
				System.out.println(e.getMessage());
				// no pude leer el archivo
			}
		} else {
			System.out.println("Archivo no existe en esa ruta");
			return null;
		}

		return lista;
	}

}
