package negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Calculo3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x,y)-> { return x + y; };
		System.out.println(calc.apply(12.1, 5.0));
		
		List<String> nomes = Arrays.asList("Vini","João","L","Pablo");
		nomes.forEach(nome -> System.out.println(nome+" !!!"));
		
		System.out.println("\nMethod Reference");
		
		nomes.forEach(System.out::println);
		
		System.out.println("\nMethod Reference 2");
		nomes.forEach(nome -> imprime(nome));
		
		//nomes.forEach(Foreach::imprime);
	}
	
	static void imprime(String texto) {
		System.out.println(texto);
	}
}
