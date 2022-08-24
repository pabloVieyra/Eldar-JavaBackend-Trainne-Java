package Test;

import java.time.LocalDate;

import Modelo.CardHolder;
import Modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sistema eldar = new Sistema();

		System.out.println("1-1)");
		// ------------------------------------> agregamos 1 Marca

		eldar.agregarMarca("visa");
		eldar.agregarMarca("nara");
		eldar.agregarMarca("amex");

		// ------------------------------------> agregamos 1 Tarjeta

		try {
			System.out.println(eldar.agregarTarjeta("visa", "1111222233334444", LocalDate.of(2022, 8, 24),
					new CardHolder("pablo", "Vieyra")));

		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}

		// ------------------------------------> traemos 1 Tarjeta

		System.out.println("\nTraer Tarjeta)");

		try {
			System.out.println(eldar.traerTarjeta("1111222233334444"));

		} catch (Exception e) {
			System.out.println(e);
		}

		// ------------------------------------> Nos fijamos si la operacion es valida

		System.out.println("\nOperacion Valida)");

		System.out.println(eldar.OperacionValida("1111222233334444", 1001));

		// ------------------------------------> Nos fijamos si la Tarjeta es valida

		System.out.println("\ntarjeta Valida)");
		try {
			System.out.println(eldar.tarjetaValida("1111222233334444"));

		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}

		// ------------------------------------> Nos fijamos si la Tarjeta es distinta

		System.out.println("\ntarjetas Distintas)");

		try {
			System.out.println(eldar.tarjetasDistintas("1111222233334444", "1111222233334444"));

		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}

		// ------------------------------------> Averiguamos la tasa final con la marca
		// y
		// el importe

		System.out.println("\nSaber tasa final)");

		System.out.println(eldar.saberTasa("Nara", 500));

	}

}
