package Modelo;

import java.time.LocalDate;
import java.util.Objects;

//Clase tarjeta que contiene los datos basicos y 2 clases (cardHolder y Marca)

public class Tarjeta {
	private int id;
	private Marca marca;
	private String numeroTarjeta;
	private LocalDate fechaDeVencimiento;
	private CardHolder cardHolder;

	public Tarjeta(int id, Marca marca, String numeroTarjeta, LocalDate fechaDeVencimiento, CardHolder cardHolder)
			throws Exception {
		super();
		this.id = id;
		this.marca = marca;
		this.setNumeroTarjeta(numeroTarjeta);
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.cardHolder = cardHolder;
	}

	public Tarjeta() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) throws Exception {
		if (numeroTarjeta.length() != 16)
			throw new Exception("El numero tiene que ser de 16 digitos , recordar poner los numero sin espacios");
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public CardHolder getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(CardHolder cardHolder) {
		this.cardHolder = cardHolder;
	}

	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", marca=" + marca + ", numeroTarjeta=" + numeroTarjeta + ", fechaDeVencimiento="
				+ fechaDeVencimiento + ", cardHolder=" + cardHolder + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardHolder, fechaDeVencimiento, id, marca, numeroTarjeta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(cardHolder, other.cardHolder)
				&& Objects.equals(fechaDeVencimiento, other.fechaDeVencimiento) && id == other.id
				&& Objects.equals(marca, other.marca) && numeroTarjeta == other.numeroTarjeta;
	}

}
