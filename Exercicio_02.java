package Exercicio_Matriz;
import java.util.Scanner;
public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int linha, coluna, m[][] = new int[16][16];
		System.out.printf("Digite: 0 = branco | 1 = preto | 2 = vermelho | 3 = bege\n\n");
		
		for(linha = 0; linha < 16; linha++) {
			System.out.printf("Informe os elementos da %d° linha:\n",(linha+1));
			for(coluna = 0; coluna < 16; coluna++) {
				System.out.printf("m[%d][%d] = ",linha,coluna);
				m[linha][coluna] = ler.nextInt();
			}
			System.out.print("\n");
		}
		System.out.printf("\n");
		for(linha = 0; linha < 16; linha++) {
			System.out.printf("%d° linha: ",(linha+1));
			for (coluna = 0; coluna < 16; coluna++) {
				System.out.printf("%d ", m[linha][coluna]);
			}
			System.out.printf("\n");
		}

	}

}
