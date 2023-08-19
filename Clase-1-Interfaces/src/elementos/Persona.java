package elementos;

public class Persona {
	protected String nombre;
	protected String apellido;
	
	public Persona(String nombre, String apellido ) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}

}
