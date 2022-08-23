package Modelo;

public class CardHolder {
	private String nombre;
	private String apellido;
	
	
	public CardHolder(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public CardHolder() {
		super();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "CardHolder [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
	
	

}
