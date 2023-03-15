package Project.Java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		float salario,abono,novoSalario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n Digite seu salario: ");
		salario = read.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = read.nextFloat();
		
		novoSalario = salario+abono;
		 
		System.out.printf("\n seu salario é: %.2f",novoSalario);
		
		

	}
	
	
}
