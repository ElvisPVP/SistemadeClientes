package vistas;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import modelo.Categoria;
import modelo.Cliente;
import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;
import utilidad.Util;

public class Menu {

	private Scanner sc;
	private ClienteServicio cs;
	private ArchivoServicio as;
	private ExportadorTxt et;
	private ExportadorCsv ec;
	private Util ut;
	private Categoria en;
	private String filename;
	private String fileName1;

	public Menu() {
		sc = new Scanner(System.in);
		cs = new ClienteServicio();
		as = new ArchivoServicio();
		et = new ExportadorTxt();
		ec = new ExportadorCsv();
		ut = new Util();

	}

	public void iniciarMenu() {
		int op = 0;
		System.out.println("Favor presione cualquier tecla alfanumerica");
		do {
			sc.next();
			System.out.println("1 Listar Clientes");
			System.out.println("2 Agregar Cliente");
			System.out.println("3 Editar Cliente");
			System.out.println("4 Cargar Datos");
			System.out.println("5 Exportar Datos");
			System.out.println("6 Salir");
			System.out.println("Ingrese una opción");
			op = sc.nextInt();

			switch (op) {
			case 1:
				listarCliente();
				break;
			case 2:
				agregarCliente();
				break;
			case 3:
				editarCliente();
				break;
			case 4:
				importarDatos();
				break;
			case 5:
				exportarDatos();
				break;
			case 6:
				terminarPrograma();
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (op != 6);

	}

	public void listarCliente() {
		ut.limpiarPantallaNormal();
		cs.listarClientes();
	}

	public void agregarCliente() {
		System.out.println("Crear cliente");
		System.out.println("Ingresa RUN del cliente");
		String run = sc.next();
		System.out.println("Ingresa nombre del cliente");
		String nombre = sc.next();
		System.out.println("Ingresa apellido del cliente");
		String apellido = sc.next();
		System.out.println("Ingresa los años del cliente en la tienda");
		String anios = sc.next();

		ut.limpiarPantallaNormal();
		Cliente cl = new Cliente(run, nombre, apellido, anios, Categoria.ACTIVO);

		cs.agregar(cl);

	}

	
	public void editarCliente() throws InputMismatchException {

		System.out.println("Editar cliente");
		System.out.println("Seleccione qué desea hacer");
		System.out.println("1.- Cambiar el estado del cliente");
		System.out.println("2.- Editar los datos ingresados del cliente");
		int op = sc.nextInt();
		Cliente cl;
		String run;
		switch (op) {
		case 1:
			System.out.println("Ingrese el run del cliente");
			run = sc.next();
			cl = cs.buscar(run);
			System.out.printf("El estado actual es: %s \n", cl.getNombreCategoria());
			System.out.println("1.- Si desea cambiar el estado del cliente a Inactivo");
			System.out.println("2.- Si desea cambiar el estado del cliente a Activo");
			try {
				int alt = sc.nextInt();
				if (alt == 1) {
					System.out.printf("Su nueva categoria es: %s \n", cl.setNombreCategoria(Categoria.INACTIVO));					
				}
				else if (alt == 2) {
					System.out.printf("Su nueva categoria es: %s \n", cl.setNombreCategoria(Categoria.ACTIVO));
				}
				else {
					System.out.println("Debe ingresar la opción 1 ó 2");
				}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Debe ingresar la opción 1 ó 2");
			} 
			
			
			break;
		case 2:
			System.out.println("Ingrese el run del cliente");
			run = sc.next();
			cl = cs.buscar(run);
			if (cl != null) {
				System.out.println("Actualizando datos del Cliente");
				
				System.out.printf("1.- El run del cliente es: %s \n", cl.getRun());
				System.out.printf("2.- El nombre del cliente es: %s \n", cl.getNombreCliente());
				System.out.printf("3.- El apellido del cliente es: %s \n", cl.getApellidoCliente());
				System.out.printf("4.- Los años del cliente en la tienda son: %s \n", cl.getAniosCliente());
				System.out.println("Ingrese la opción a editar de los datos del cliente:");
				int alternativa = sc.nextInt();
				
				switch (alternativa) {
				case 1:
					System.out.println("Ingrese el nuevo run del cliente");
					cl.setRun(sc.next());
					break;
				case 2:
					System.out.println("Ingrese el nuevo nombre del cliente");
					String nombre = sc.next();
					cl.setNombreCliente(nombre);
					break;
				case 3:
					System.out.println("Ingrese el nuevo apellido del cliente");
					String apellido = sc.next();
					cl.setApellidoCliente(apellido);
					;
					break;
				case 4:
					System.out.println("Ingrese los nuevos años del cliente en la tienda");
					sc.nextLine();
					try {
						String anios = sc.nextLine();
						cl.setAniosCliente(anios);
					} catch (Exception e) {
						throw new InputMismatchException();
					}
					break;
				default:
					System.out.println("Alternativa no válida");
					break;
				}
					System.out.println("Datos cambiados con éxito");
			} else {
				System.out.println("No existe un cliente con ese run");
			}
			break;

		default:
			System.out.println("Alternativa no válida");
			break;

		}

	}

	public void importarDatos() {
		String filename1 = ("src/DBClientes.csv");
		System.out.println("Cargar Datos");
		System.out.println("Ingresa la ruta en donde se encuentra el archivo\r\n" + filename1);
		String ruta = sc.next();
		List<Cliente> nueva = as.importar(ruta);
		if (nueva != null) {
			for (Cliente cliente : nueva) {
				cs.agregar(cliente);
			}
			System.out.println("Datos cargados correctamente en la lista");
		} else {
			System.out.println("No hay elementos para importar");
		}
	}

	public void exportarDatos() {
		System.out.println("Exportar Datos");
		System.out.println("Seleccione el formato a exportar");
		System.out.println("1.- Formato csv");
		System.out.println("2.- Formato txt");
		int opcion = sc.nextInt();
		String filename = ("/src/archivo");
		switch (opcion) {
		case 1:
			System.out.println("Ingresa la ruta en donde desea exportar el archivo" + filename + ".csv");
			String ruta = sc.next();
			ec.exportar(cs.getListaClientes(), ruta);
			break;
		case 2:
			System.out.println("Ingresa la ruta en donde desea exportar el archivo" + filename + ".txt");
			String ruta1 = sc.next();
			et.exportar(cs.getListaClientes(), ruta1);
			break;
		default:
			System.out.println("Alternativa no válida");
			break;
		}
		
	}

	public void terminarPrograma() {
		ut.printLine("Muchas gracias por utilizar nuestro programa");
		ut.esperar();
		ut.limpiarPantallaTerminar();
		ut.printLine("Hasta pronto");
	}
}
