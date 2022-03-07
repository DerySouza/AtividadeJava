package Books;

import javax.swing.JOptionPane;

public class Cadastro {
	public static void main(String[] args) {
		while (true) {
			String nomeDolivro = JOptionPane.showInputDialog("Digite o t�tulo do livro");
			String nomeDoAutor = JOptionPane.showInputDialog("Digite o nome do autor");
			String anoDepublic = JOptionPane.showInputDialog("Digite o ano de publica��o");
			String[] valores = {"AVENTURA", "FANTASIA", "FIC��O", "ROMANCE", "TERROR"};
			String seletor = (String) JOptionPane.showInputDialog(null, "Escolha um g�nero liter�rio", "G�nero",
					JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
			Livros obecLivro = new Livros(nomeDolivro, nomeDoAutor, anoDepublic, seletor);
			Acervo.adicionar(obecLivro);
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais livros?");
			if (escolha == 1) {
				break;
			}

		}
		System.out.println(Acervo.listar());
		
		int buscar = JOptionPane.showConfirmDialog(null, "Buscar livro por g�nero ?");
		if (buscar == 0) {
			String[] valores2 = {"AVENTURA", "FANTASIA", "FIC��O", "ROMANCE", "TERROR"};
			String seletor2 = (String) JOptionPane.showInputDialog(null, "Escolha um g�nero liter�rio", "G�nero",
					JOptionPane.QUESTION_MESSAGE, null, valores2, valores2[0]);
			Acervo quant = new Acervo();
			System.out.println(
					"Quantidade de livros encontrados por g�nero " + seletor2 + " = " + quant.buscar(seletor2));
		}
	}
}
