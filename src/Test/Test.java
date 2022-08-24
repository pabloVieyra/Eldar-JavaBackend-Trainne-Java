package Test;

import java.time.LocalDate;

import Modelo.CardHolder;
import Modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sistema eldar = new Sistema();
		
		System.out.println("1-1)");
		
		try {
			System.out.println(eldar.agregarTarjeta("visa", "1111222233334444", LocalDate.of(2022, 8, 24), new CardHolder("pablo","Vieyra")));
			
		}catch(Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}
		
		
		System.out.println("\nTraer Tarjeta)");
		
		try {
			System.out.println(eldar.traerTarjeta("1111222233334444"));
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		System.out.println("\nOperacion Valida)");
		
		System.out.println(eldar.OperacionValida("1111222233334444", 1001));
		
		System.out.println("\ntarjeta Valida)");
		try {
			System.out.println(eldar.tarjetaValida("1111222233334444"));
			
		}catch(Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
		
		
		
		System.out.println("\ntarjetas Distintas)");
		
		try {
			System.out.println(eldar.tarjetasDistintas("1111222233334444","1111222233334444"));
			
		}catch(Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
		
		
		
		System.out.println("\nSaber tasa final)");
		
		System.out.println(eldar.saberTasa("Nara",500));
		
		
		
		
		

	}

}
