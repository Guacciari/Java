package Project.Java2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		
	System.out.println("\ndigite o numero a : ");
	a = leia.nextInt();
	
	System.out.println("\ndigite o numero b : ");
	b = leia.nextInt();
	
	
	System.out.println("\ndigite o numero c : ");
	c = leia.nextInt();
	
	soma = a+b;
	
	if(soma>c) {
	System.out.println("a soma é maior ");
	}
	else if(soma<c) {
		System.out.println("a soma é menor ");
	}
	else if(soma == c) {
		System.out.println("a soma é igual ");
		
	}
	
	}

}

