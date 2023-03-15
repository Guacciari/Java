package Project.Java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	

		double nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite sua primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("\n Digite a segunda nota: ");
		nota2 = leia.nextDouble();

		System.out.print("\n Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("\n Digite a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("sua media é "+media);
		
	}

}
