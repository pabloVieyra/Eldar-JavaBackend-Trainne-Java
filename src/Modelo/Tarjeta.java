package Modelo;

import java.time.LocalDate;

public class Tarjeta {
	private int id;
	private String marca;
	private long numeroTarjeta;
	private LocalDate fechaDeVencimiento;
	private CardHolder cardHolder;
	
	
	public Tarjeta(int id, String marca, long numeroTarjeta, LocalDate fechaDeVencimiento, CardHolder cardHolder) {
		super();
		this.id = id;
		this.marca = marca;
		this.numeroTarjeta = numeroTarjeta;
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


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public long getNumeroTarjeta() {
		return numeroTarjeta;
	}


	public void setNumeroTarjeta(long numeroTarjeta) {
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
	
	
	
	
	
	
	
	
	
	

}
