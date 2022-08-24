package Modelo;

import java.util.Objects;

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


	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardHolder other = (CardHolder) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	
	
	
	

}
