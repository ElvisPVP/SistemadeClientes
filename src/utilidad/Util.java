package utilidad;

public class Util {
	
	public void limpiarPantallaNormal()
	{
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}
	}
	
	public void limpiarPantallaTerminar()
	{
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}
	
	public void printLine(String mensaje) 
	{
		System.out.println(mensaje);
	}
	
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
