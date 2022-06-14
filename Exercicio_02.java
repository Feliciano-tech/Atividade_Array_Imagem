package Exercicio_Matriz;
import java.util.Scanner;
public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); // imprimir texto. 
		int linha, coluna, m[][] = new int[16][16]; // declaração de variaveis do tipo int e array do tipo int no tamanho de 16x16. 
		System.out.printf("Digite: 0 = branco | 1 = preto | 2 = vermelho | 3 = bege\n\n"); //imprimir texte.
		
		for(linha = 0; linha < 16; linha++) { // inicio do laco em que a condicao de laco e enquanto "linha" for menor que 16 repita.
			System.out.printf("Informe os elementos da %d° linha:\n",(linha+1)); // imprimir texto.
			for(coluna = 0; coluna < 16; coluna++) { // inicio do laco em que a condicao de laco e enquanto "coluna" for menor que 16 repita.
				System.out.printf("m[%d][%d] = ",linha,coluna); // imprimir texto.
				m[linha][coluna] = ler.nextInt(); // scanear teclado.
			}
			System.out.print("\n"); // pular linha.
		}
		System.out.printf("\n"); // pular linha.
		for(linha = 0; linha < 16; linha++) { // inicio do laco em que a condicao de laco e enquanto "linha" for menor que 16 repita.
			System.out.printf("%d° linha: ",(linha+1));
			for (coluna = 0; coluna < 16; coluna++) { // inicio do laco em que a condicao de laco e enquanto "coluna" for menor que 16 repita.
				System.out.printf("%d ", m[linha][coluna]); // imprimir texto
			}
			System.out.printf("\n"); // pular linha.
		}

	}

}
