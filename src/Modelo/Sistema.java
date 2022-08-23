package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	
	

	public Sistema(List<Tarjeta> tarjetas) {
		super();
		this.tarjetas = tarjetas;
	}
	
	public Sistema() {
		super();
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	
	public Tarjeta traerTarjeta(long numeroDeTarjeta) {
		return null;
	}
	
	public boolean OperacionValida(long numeroDeTarjeta) {
		return false;
	}
	
	public boolean tarjetaValida(long numeroDeTarjeta) {
		return false;
	}
	
	public boolean tarjetasDistintas(long numeroDeTarjeta,long numeroDeTarjeta2 ) {
		return false;
	}
	
	public boolean saberTasa(String marca,int importe ) {
		return false;
	}
	
	
	

}
