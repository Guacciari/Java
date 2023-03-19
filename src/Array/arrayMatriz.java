package Array;

import java.util.Scanner;

public class arrayMatriz {

	public static void main(String[] args) {

		
		int[][] numeros = new int[3][3];
		int linha,coluna,somaMatriz=0,somaDiagonal=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um numero: ");
				numeros[linha][coluna] = leia.nextInt();
				somaMatriz += numeros[linha][coluna];
				
				if(linha == coluna) {
					somaDiagonal += numeros[linha][coluna];
				}
				
			}
		}
		
		System.out.println("\nSoma dos valores da matriz: "+somaMatriz);
		System.out.println("\nSoma dos valores da diagonal principal: "+somaDiagonal);
		

	}

}