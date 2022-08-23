package Test;

import Modelo.CardHolder;
import Modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sistema eldar = new Sistema();
		
		System.out.println("1-1)");
		
		System.out.println(eldar.agregarTarjeta("visa", 1150358935, null, new CardHolder("pablo","Vieyra")));
		
		
		System.out.println("\nTraer Tarjeta)");
		
		System.out.println(eldar.traerTarjeta(1150358935));
		
		System.out.println("\nOperacion Valida)");
		
		System.out.println(eldar.OperacionValida(1150358935, 1001));
		
		System.out.println("\ntarjetaValida)");
		
		System.out.println(eldar.tarjetaValida(1150358935));
		
		System.out.println("\ntarjetasDistintas)");
		
		System.out.println(eldar.tarjetasDistintas(1150358935,1150358999));
		
		System.out.println("\nSaber tasa final)");
		
		System.out.println(eldar.saberTasa("Nara",500));
		
		
		
		
		

	}

}
