package negocio;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> multiplica = (num1, num2) -> (num1 * num2);
		
		BinaryOperator<Double> media = (num1,num2) -> (num1 + num2) /2;
		
		BiFunction<Double, Double, String> resultado = (num1, num2) ->{
			
			Double notaFinal = (num1 + num2) / 2;
			return notaFinal >=7 ? "Aprovado" : "Reprovado";
			
		};
		
		Function<Double, String> isAprovado = num -> num >= 7 ? "Aprovado" :  "Reprovado";
		
		Consumer<String> imprimeString = p -> System.out.println(p);
		
		Consumer<Double> imprime = p -> System.out.println(p);
		
		imprime.accept(multiplica.apply(12.0, 2.1));
		
		imprimeString.accept(resultado.apply(7.1, 7.1));
		
		imprimeString.accept(media.andThen(isAprovado).apply(7.8, 6.1));
		
	}
}
