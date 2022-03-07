package Books;

public class Livros {
	private String titulo;
	private String autor;
	private String anoDePubli;
	private String generoLitera;

	public Livros(String titulo, String autor, String anoDePubli, String generoLitera) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePubli = anoDePubli;
		this.generoLitera = generoLitera;
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

	public String getAnoDePubli() {
		return anoDePubli;
	}

	public void setAnoDePubli(String anoDePubli) {
		this.anoDePubli = anoDePubli;
	}

	public String getGeneroLitera() {
		return generoLitera;
	}

	public void setGeneroLitera(String generoLitera) {
		this.generoLitera = generoLitera;
	}

	@Override
	public String toString() {
		return "Título = " + titulo + "\nautor = " + autor + "\nAno de Publicação = " + anoDePubli + "\nGênero = "
				+ generoLitera;
	}
    
	
}
