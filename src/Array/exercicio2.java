package Array;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		int[] vet = new int[10];
		int impar, par, soma = 0, media, x;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 10; x++) {
			System.out.println(" entre com um numero");
			vet[x] = leia.nextInt();
			soma = soma + vet[x];

		}
		for (x = 0; x < 10; x++) {
			if (x % 2 == 1) {
				impar = vet[x];
				System.out.println("\n O numero " + impar + " esta no indice impar ");

			}
		}
		for (x = 0; x < 10; x++) {
			if (vet[x] % 2 == 0) {
				par = vet[x];
				System.out.println("\n O numero " + par + " é par");

			}
		}
		media = soma/10;
		System.out.println("\n A soma de todos so indices é "+soma);

	}

}
