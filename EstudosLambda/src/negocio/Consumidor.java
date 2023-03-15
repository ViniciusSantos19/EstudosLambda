package negocio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
	
		Consumer<Produto> teste = p -> System.out.println(p.getPreco());
		
		Produto p = new Produto("Geladeira", 2200, 0.3);
		Produto p2 = new Produto("Microndas", 600, 0.3);
		Produto p3 = new Produto("Fogão", 1200, 0.3);
		Produto p4 = new Produto("Máquina de lavar", 1500, 0.3);
		Produto p5 = new Produto("Air Friyer", 500, 0.3);
		
		teste.accept(p);
		List<Produto> listaCompra = Arrays.asList(p,p2,p3,p4,p5);
		
		listaCompra.forEach(teste);
		
		//basicamente uma lambda de metodo void
	}
}
