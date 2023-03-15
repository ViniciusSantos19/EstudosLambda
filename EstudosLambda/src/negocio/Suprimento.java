package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suprimento {
	public static void main(String[] args) {
		Supplier<List<String>> umaLista = () -> Arrays.asList("Vini", "Ana", "Bia", "Mike");
		System.out.println(umaLista.get());
	}
}
