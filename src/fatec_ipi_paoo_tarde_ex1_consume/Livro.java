package fatec_ipi_paoo_tarde_ex1_consume;

public class Livro {
	private String titulo, autor;
	private boolean novo;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		novo = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isNovo() {
		return novo;
	}
	
	public void abrir () {
		this.novo = false; 
	}
	
	// to string
	@Override
	public String toString() {
		return "Livro{" + "nome=" + titulo + ", autor=" + autor + ", novo=" + novo + "}";
	}
}
