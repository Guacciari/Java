package Project.Java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float[] num = new float[5];

		float diferenças;
		int i;
		
		Scanner read = new Scanner (System.in);
		
		for(i = 1;i<=4;i++) {
			
			System.out.println("\n Digite o valor "+i);
			num [i] = read.nextFloat();
			
		}
		
		diferenças = (num[1]*num[2])-(num[3]*num[4]);
		
		System.out.print("\n diferenças entre "+num[1]+" * "+num[2]+" e "+num[3]+" * "+num[4]+" é "+diferenças);
}
		
	}


