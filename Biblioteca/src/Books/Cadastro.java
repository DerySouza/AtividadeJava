package Books;

import javax.swing.JOptionPane;

public class Cadastro {
	public static void main(String[] args) {
		while (true) {
			String nomeDolivro = JOptionPane.showInputDialog("Digite o título do livro");
			String nomeDoAutor = JOptionPane.showInputDialog("Digite o nome do autor");
			String anoDepublic = JOptionPane.showInputDialog("Digite o ano de publicação");
			String[] valores = {"AVENTURA", "FANTASIA", "FICÇÃO", "ROMANCE", "TERROR"};
			String seletor = (String) JOptionPane.showInputDialog(null, "Escolha um gênero literário", "Gênero",
					JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
			Livros obecLivro = new Livros(nomeDolivro, nomeDoAutor, anoDepublic, seletor);
			Acervo.adicionar(obecLivro);
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais livros?");
			if (escolha == 1) {
				break;
			}

		}
		System.out.println(Acervo.listar());
		
		int buscar = JOptionPane.showConfirmDialog(null, "Buscar livro por gênero ?");
		if (buscar == 0) {
			String[] valores2 = {"AVENTURA", "FANTASIA", "FICÇÃO", "ROMANCE", "TERROR"};
			String seletor2 = (String) JOptionPane.showInputDialog(null, "Escolha um gênero literário", "Gênero",
					JOptionPane.QUESTION_MESSAGE, null, valores2, valores2[0]);
			Acervo quant = new Acervo();
			System.out.println(
					"Quantidade de livros encontrados por gênero " + seletor2 + " = " + quant.buscar(seletor2));
		}
	}
}
