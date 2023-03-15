package negocio;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> multiplica = num -> num * 2;
		
		Consumer<Integer> teste = p -> System.out.println(p);
		teste.accept(multiplica.apply(13));
	}
}
