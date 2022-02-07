package modelo;

/**
 * 
 * @author Elvis
 *
 */
public class Cliente{
	
	/**
	 * Se crean las variables
	 */
	private String run;
	private String nombreCliente;
	private String apellidoCliente;
	private String aniosCliente;
	Categoria nombreCategoria;
	
	/**
	 * Se crean los constructores
	 * @param run
	 * @param nombreCliente
	 * @param apellidoCliente
	 * @param aniosCliente
	 * @param nombreCategoria
	 */
	public Cliente(String run, String nombreCliente, String apellidoCliente, String aniosCliente,
			Categoria nombreCategoria) {
		super();
		this.run = run;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
		this.nombreCategoria = nombreCategoria;
	}
	/**
	 * Se generan getters y setters
	 * @return
	 */
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getAniosCliente() {
		return aniosCliente;
	}
	public void setAniosCliente(String aniosCliente) {
		this.aniosCliente = aniosCliente;
	}
	public Categoria getNombreCategoria() {
		return nombreCategoria;
	}
	public Categoria setNombreCategoria(Categoria nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
		return nombreCategoria;
	}
	/**
	 * Se genera el toString y se utiliza el StringBuilder para mayor orden
	 */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Run: %s \n", getRun()));
		sb.append(String.format("Nombre: %s \n", getNombreCliente()));
		sb.append(String.format("Apellido: %s \n", getApellidoCliente()));
		sb.append(String.format("Años como cliente: %s \n", getAniosCliente()));
		sb.append(String.format("Categoria del cliente: %s \n", getNombreCategoria()));
				
		return sb.toString();
	}
	
	

}
