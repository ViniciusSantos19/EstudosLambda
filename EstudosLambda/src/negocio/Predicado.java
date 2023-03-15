package negocio;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Produto produto = new Produto("Manteiga", 10, 0.15);
		Predicate<Produto> isCaro = prod ->  (prod.getPreco() * (1 - prod.getDesconto()
				)) >= 7;
		System.out.println(isCaro.test(produto));
		//basicamento uma lambda de metodo boolean
	}

}
