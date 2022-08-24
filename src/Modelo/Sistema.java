package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	// En esta clase voy a utilizar una lista de tarjetas y marcas con su logica de negocio
	// para despues implementarla en el test
	public List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
	public List<Marca> marcas = new ArrayList<Marca>();

	// Contructores + getters and setters

	public Sistema(List<Tarjeta> tarjetas, List<Marca> marcas) {
		super();
		this.tarjetas = tarjetas;
		this.marcas = marcas;
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

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	// Este metodo es para agregar 1 marca nueva, id en 1 si no hay elementos en el
	// array osino se fija cual agarrar
	public boolean agregarMarca(String marca) {
		boolean carga = false;

		if (marcas.size() == 0) {
			marcas.add(new Marca(1, marca));
			carga = true;

		} else {
			Marca aux = new Marca();
			aux.setMarca(marca);
			aux.setId(marcas.get(marcas.size() - 1).getId() + 1);

			carga = marcas.add(aux);
		}

		return carga;
	}

	// Aqui nos traemos la marca y si no existe largamos exception
	public Marca traerMarca(String marca) throws Exception {
		Marca aux = new Marca();
		for (int i = 0; i < marcas.size(); i++) {
			if (marcas.get(i).getMarca().equals(marca)) {
				aux = marcas.get(i);

			}
		}

		if (aux.getMarca() == null)
			throw new Exception("Error La Marca no existe");

		return aux;
	}

	// verificamos si todos los parametros de la tarjeta esten bien
	public boolean verificarTarjeta(Tarjeta tarjeta) {
		boolean existe = false;
		if (tarjeta.getFechaDeVencimiento() == null && tarjeta.getMarca() == null
				&& tarjeta.getNumeroTarjeta() == null) {
			existe = true;

		}
		return existe;
	}

	// Este metodo es para agregar 1 Tarjeta nueva, id en 1 si no hay elementos en
	// el array osino se fija cual agarrar
	public boolean agregarTarjeta(String marca, String numeroTarjeta, LocalDate fechaDeVencimiento,
			CardHolder cardHolder) throws Exception {
		boolean carga = false;

		if (tarjetas.size() == 0) {
			tarjetas.add(new Tarjeta(1, traerMarca(marca), numeroTarjeta, fechaDeVencimiento, cardHolder));
			carga = true;

		} else {
			Tarjeta aux = new Tarjeta();
			aux.setMarca(traerMarca(marca));
			aux.setId(tarjetas.get(tarjetas.size() - 1).getId() + 1);
			aux.setNumeroTarjeta(numeroTarjeta);
			aux.setFechaDeVencimiento(fechaDeVencimiento);
			aux.setCardHolder(cardHolder);

			carga = tarjetas.add(aux);
		}

		return carga;
	}

	// Aqui nos traemos la Tarjeta y si no existe largamos exception
	public Tarjeta traerTarjeta(String numeroDeTarjeta) throws Exception {
		Tarjeta aux = new Tarjeta();
		for (int i = 0; i < tarjetas.size(); i++) {
			if (tarjetas.get(i).getNumeroTarjeta() == numeroDeTarjeta) {
				aux = tarjetas.get(i);

			}
		}

		if (verificarTarjeta(aux) == true)
			throw new Exception("Error La tarjeta no existe");

		return aux;
	}

	// Aqui verificamos que la operacion sea menor a 1000
	public boolean OperacionValida(String numeroDeTarjeta, long operacion) {
		boolean exitoso = false;
		if (operacion < 1000) {
			exitoso = true;
		}

		return exitoso;
	}

	// Aqui verificamos que la fecha de vencimiento sea anterior a la fecha actual
	public boolean tarjetaValida(String numeroDeTarjeta) throws Exception {
		boolean exitoso = traerTarjeta(numeroDeTarjeta).getFechaDeVencimiento().isAfter(LocalDate.now());
		return exitoso;
	}

	// Aqui verificamos con un equal si 2 tarjeta son iguales
	public boolean tarjetasDistintas(String numeroDeTarjeta, String numeroDeTarjeta2) throws Exception {
		boolean iguales = true;
		if (traerTarjeta(numeroDeTarjeta).equals(traerTarjeta(numeroDeTarjeta2))) {
			iguales = false;
		}
		return iguales;
	}

	// Calculamos la tasa dependiendo la Marca
	public long saberTasa(String marca, long importe) {
		long tasa = 0;

		switch (marca) {

		case "visa": {

			System.out.println("Usted eligio la opcion visa.");
			tasa = (importe / 100) * (LocalDate.now().getYear() / LocalDate.now().getMonthValue());

			break;

		}

		case "Nara": {

			System.out.println("Usted eligio la opcion Nara.");
			tasa = (long) ((importe / 100) * (0.5 * LocalDate.now().getDayOfMonth()));

			break;
		}

		case "Amex": {

			System.out.println("Usted eligio la opcion Amex.");
			tasa = (long) ((importe / 100) * (0.1 * LocalDate.now().getMonthValue()));

			break;
		}

		default: {
			System.out.println("Opcion incorrecta, esa marca no trabajamos actualmente");
		}
		}// cierra SWITCH

		return tasa;
	}

}
