package fatec_ipi_paoo_tarde_ex1_consume;



public class TesteLambdaComMinhaInterface {

	public static void main(String[] args) {
		// Ex 1
		OperacaoAritmetica soma = (x, y) -> {return x + y;};
		OperacaoAritmetica multiplicacao = (x, y) -> {return x * y;};
		fazOperaco(soma);
		fazOperaco(multiplicacao);
		fazOperaco( (t, s) -> t / s);
	}
	
	public static void fazOperaco (OperacaoAritmetica op) {
		System.out.println(op.calcular(8, 2));
	}

}

// Interface
interface OperacaoAritmetica {
	public int calcular (int a, int b);
}
