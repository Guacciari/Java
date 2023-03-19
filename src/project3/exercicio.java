package project3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {

		int num,pos=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\n Digite um numero: ");
			num = leia.nextInt();
			
			if(num >=0)
			pos += num;
		}while(num !=0);
		System.out.println("\n A soma dos numeros possitivos são de:"+pos);

	}

}
