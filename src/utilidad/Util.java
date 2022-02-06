package utilidad;

/**
 * Creación de clase Util
 * @author Elvis
 *
 */
public class Util {
	
	/**
	 * Metodo para limpiar 20 líneas de código
	 */
	public void limpiarPantallaNormal()
	{
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	/**
	 * Metodo para limpiar 100 lineas de código
	 */
	public void limpiarPantallaTerminar()
	{
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}
	
	/**
	 * Se utiliza para escribir algun mensaje 
	 * @param mensaje
	 */
	public void printLine(String mensaje) 
	{
		System.out.println(mensaje);
	}
	
	
	/**
	 * Se utiliza para dar un tiempo de espera al ejecutarse
	 */
	public void esperar()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
