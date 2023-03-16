package Project.Java2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
	double numero;
	
	Scanner leia = new Scanner(System.in);

	System.out.println("digite um numero: ");
	numero = leia.nextInt();
	
	if(numero>=0 && numero % 2 == 0) {
		System.out.println("o numero "+numero+" é par, e positvo");
	}
	else if(numero>=0 && numero % 2 != 0) {
		System.out.println("o numero "+numero+" é impar e positivo");
	}
	else if(numero<0 && numero % 2 == 0) {
		System.out.println("o numero "+numero+" é par, e negativo");
	}
	else if(numero<0 && numero % 2 !=0) {
		System.out.println("o numero "+numero+" é impar e negativo");
	}
	
	

	
	
	

	}

}
