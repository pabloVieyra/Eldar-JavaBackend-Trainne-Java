package Test;

import java.time.LocalDate;

import Modelo.CardHolder;
import Modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sistema eldar = new Sistema();
		
		System.out.println("1-1)");
		
		System.out.println(eldar.agregarTarjeta("visa", 1150358935, LocalDate.of(2022, 8, 24), new CardHolder("pablo","Vieyra")));
		
		
		System.out.println("\nTraer Tarjeta)");
		
		System.out.println(eldar.traerTarjeta(1150358935));
		
		System.out.println("\nOperacion Valida)");
		
		System.out.println(eldar.OperacionValida(1150358935, 1001));
		
		System.out.println("\ntarjeta Valida)");
		
		System.out.println(eldar.tarjetaValida(1150358935));
		
		System.out.println("\ntarjetas Distintas)");
		
		System.out.println(eldar.tarjetasDistintas(1150358935,1150358935));
		
		System.out.println("\nSaber tasa final)");
		
		System.out.println(eldar.saberTasa("Nara",500));
		
		
		
		
		

	}

}
