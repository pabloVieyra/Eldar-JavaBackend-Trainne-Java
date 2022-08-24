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
	
	public boolean OperacionValida(long numeroDeTarjeta, long operacion) {
		boolean exitoso = false;
		if(operacion > 1000  ) {
			exitoso = true;
		}
		
		return exitoso;
	}
	
	public boolean tarjetaValida(long numeroDeTarjeta) {
		boolean exitoso = false;
		if(traerTarjeta(numeroDeTarjeta).getFechaDeVencimiento().isAfter(LocalDate.now()) == true) {
			exitoso = true;
		}
		return exitoso;
	}
	
	public boolean tarjetasDistintas(long numeroDeTarjeta,long numeroDeTarjeta2 ) {
		boolean iguales = true;
		if(traerTarjeta(numeroDeTarjeta).equals(traerTarjeta(numeroDeTarjeta2))) {
			iguales = false;
		}
		return iguales;
	}
	
	public long saberTasa(String marca,long importe ) {
		long tasa = 0;
		
		 switch (marca){

         case "visa":{

             System.out.println("Usted eligio la opcion visa.");
             tasa = importe*(LocalDate.now().getYear()/LocalDate.now().getMonthValue()) ;

             break;

         }

         case "Nara":{

             System.out.println("Usted eligio la opcion Nara.");
             tasa = (long) (importe*(0.5*LocalDate.now().getDayOfMonth())) ;

             break;
         }

         case "Amex":{

             System.out.println("Usted eligio la opcion Amex.");
             tasa = (long) (importe*(0.1*LocalDate.now().getMonthValue())) ;
             
             break;
         }

         default: {
             System.out.println("Opcion incorrecta");
         }
   }//cierra SWITCH
		
		
		
		return tasa;
	}
	
	
	

}
