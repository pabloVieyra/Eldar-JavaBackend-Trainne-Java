package Modelo;

import java.time.LocalDate;
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
	
	
	
	public boolean agregarTarjeta( String marca, long numeroTarjeta, LocalDate fechaDeVencimiento, CardHolder cardHolder) {
		boolean carga = false;
		
		if(tarjetas.size() == 0) {
			tarjetas.add(new Tarjeta(1, marca,numeroTarjeta,fechaDeVencimiento,cardHolder));
			carga= true;

		}else {	
			Tarjeta aux = new Tarjeta();
			aux.setMarca(marca); 
			aux.setId(tarjetas.get(tarjetas.size()-1).getId()+1);
			aux.setNumeroTarjeta(numeroTarjeta);
			aux.setFechaDeVencimiento(fechaDeVencimiento);
			aux.setCardHolder(cardHolder);
	    
	    carga = tarjetas.add(aux);
		}
		
		return carga;
	}
	
	
	
	
	
	public Tarjeta traerTarjeta(long numeroDeTarjeta) {
		Tarjeta aux= new Tarjeta();
		for(int i=0;  i< tarjetas.size(); i++) {
			if(tarjetas.get(i).getNumeroTarjeta() == numeroDeTarjeta) {
				aux = tarjetas.get(i);	
				}
			}
			
			return aux;
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
	
	public long saberTasa(String marca,int importe ) {
		return 0;
	}
	
	
	

}
