package fatec_ipi_paoo_tarde_ex1_consume;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Teste1 {

	public static void main(String[] args) {
		Livro l1 = new Livro ("Concrete Mathematics", "Knuth");
		Livro l2 = new Livro ("Introduction to Algorithms", "Cormen");
		List <Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		
		// Ex 1
		for (Livro livro : livros) {
			//System.out.println("Exemplo 01: " + livro.getAutor());
			System.out.println("Exemplo 01:" + livro.toString());
		}
		
		// Ex 2 - Classe aninhada
		ExibeAutor exibeAutor = new ExibeAutor();
		livros.forEach(exibeAutor);
		
		// Ex 3
		Consumer <Livro> exibeAutor2 = new Consumer <Livro>() {
			@Override
			public void accept(Livro l) {
				//System.out.println("Exemplo 03: " + l.getAutor());
				System.out.println("Exemplo 03: " + l.toString());
			}
		};
		livros.forEach(exibeAutor2);
		
		// Ex 4
		livros.forEach(new Consumer <Livro> () {
			@Override
			public void accept(Livro l) {
				//System.out.println("Exemplo 04: " + l.getAutor());
				System.out.println("Exemplo 04: " + l.toString());
			}  
		});
		
		//********* Uso de lambda ***********
		
		
		// Ex 1
		Consumer <Livro> lambda1 = (Livro l) -> {System.out.println(" lambda 01: " + l.toString());};
		livros.forEach(lambda1);
		
		// Ex 2
		Consumer <Livro> lambda2 = l -> {System.out.println(" lambda 02: " + l.toString());};
		livros.forEach(lambda2);
		
		// Exe 3
		Consumer <Livro> lambda3 = l -> System.out.println (" lambda 03: " + l.toString()); //
		livros.forEach(lambda3);
		
		// Ex 4
		livros.forEach(l -> System.out.println ("lambda 04 - Livro é novo: " + l.toString()));
		livros.forEach(l -> l.abrir());
		livros.forEach(l -> System.out.println("lambda 04 - Livro é novo: " + l.toString()));
	}
}

//  ex 02 - classe aninhada
class ExibeAutor implements Consumer <Livro> {
	@Override
	public void accept(Livro l) {
		//System.out.println("Exemplo 2: " + l.getAutor());
		System.out.println("Exemplo 02: " + l.toString());
	}
}