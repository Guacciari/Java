package project3;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {

		int idade,menor=0,maior=0;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\n Digite uma idade ");
		idade = leitura .nextInt();
		
		while (idade >= 0) {
			
			if (idade <= 21) {
				menor ++;
			} else if (idade >= 50) {
				maior ++;
				
			}
				System.out.println("\n Digite a sua idade: ");
				idade = leitura.nextInt();
				
			}
	        System.out.println("\nTotal de menores de 21: "+menor);
	        System.out.println("\ntotal de maiores de 50: "+maior);
	     
		
	}
	
}
	



