package negocio;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("Ipad",3210.99, 0.1);
		Function<Produto, Double> calcDesc = prod -> prod.getPreco() * (1-prod.getDesconto());
		UnaryOperator<Double> calcImposto = num -> {
			return num >= 2000 ? num * (1 - 0.085) : num;
		};
		
		UnaryOperator<Double> frete = num ->{
			return num >= 3000 ? 100.0 + num : 50.0+num;
		};
		
		UnaryOperator<Double> arredonda = num ->{
			return Double.parseDouble(String.format("%.2f", num).replace(',', '.'));
		};
		
		Consumer<Double> resultadoFinal = num -> System.out.println("R$ "+num);
		
		resultadoFinal.accept(calcDesc.andThen(calcImposto).andThen(frete).andThen(arredonda).apply(produto));
	}
}
