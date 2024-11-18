package view;
import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class ArvoreEx02Principal {

	public static void main (String[] args) {
		
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		int tamanhovet = vetor.length;
		
		ArvoreInt arvoreint = new ArvoreInt();
		
		for (int i = 0; i < tamanhovet; i ++) {
			arvoreint.insert(vetor[i]);
		}
		
		try {
			arvoreint.prefixSearch();
			System.out.println();
			arvoreint.infixSearch();
			System.out.println();
			arvoreint.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
