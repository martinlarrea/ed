package elementos;

public class Contenedor {
	protected Object elemento;
	
	public Contenedor( Object elemento ) {
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
