package negocio;

import java.util.function.Consumer;
import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "par" : "impar";
		
		//Function<Integer,Integer, String> maiorOuMenor = (num, num2) -> num > num2 ? num+" é maior" : num+" é menor";
		
		Consumer<String> teste = p -> System.out.println(p);
		
		teste.accept(parOuImpar.apply(123));
		//metodo que pega um parametro de um tipo  e entrega de outro
	}
}
