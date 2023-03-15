package negocio;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >=100 && num <=999;
		Consumer<Boolean> teste = p -> System.out.println(p);
		teste.accept(isPar.and(isTresDigitos).test(124));
	}
}
