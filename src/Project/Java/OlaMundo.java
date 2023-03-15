package Project.Java;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Gustavo Acciari Vilela";
		int idade = 19,x=2;
		double altura = 1.75,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nO seu nome é: "+nome);
		System.out.println("\nA sua idade é: "+idade+" anos de vida...");
		System.out.println("\nA sua altura é: "+altura+" metro(s)...");
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nMédia aritmética foi de: "+media);
		System.out.printf("\nMédia aritmética foi de: %.2f",media);
		
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3,3);
		x = idade % x;
		

	}

}
