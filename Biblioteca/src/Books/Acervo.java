package Books;

import java.util.ArrayList;

public class Acervo {
		private static ArrayList<Livros> estante = new ArrayList<Livros>();

		public static ArrayList<Livros> getEstante() {
			return estante;
		}

		public static void adicionar(Livros L) {
			estante.add(L);
		}
		
		static public String listar() {
			String saida ="";
			int i = 1;
			for (Livros L : estante) {
			    saida += "\n----------LIVRO CADASTRADO " + (i++) + "-------------" + "\n";
			    saida +=L.toString(); 
			}
			return saida; 
		}
	   public int buscar(String genero) {    
		   int cont = 0;
		   for(Livros L : estante) {
			   if(L.getGeneroLitera().equalsIgnoreCase(genero)) { 
				   System.out.println("=========LIVRO ENCONTRADO=======" + "\n" + L);
				   cont++;
			   }
		   }
		   return cont;
	   }
}
