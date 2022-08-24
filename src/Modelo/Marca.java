package Modelo;

import java.util.Objects;

//Clase marca para despues llamarla en tarjeta y en Sistema

public class Marca {
	private int id;
	private String Marca;

	// Contructores + getters and setters
	public Marca(int id, String marca) {
		super();
		this.id = id;
		Marca = marca;
	}

	public Marca() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", Marca=" + Marca + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Marca, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		return Objects.equals(Marca, other.Marca) && id == other.id;
	}

}
