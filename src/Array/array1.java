package Array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		float[] media = new float[3];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			System.out.println("\nSua média foi de: "+media[x]);
			
			somaMedia += media[x];//somaMedia = somaMedia + media[x]
			
			if(media[x]>=7 && media[x]<=10) {
				System.out.println("\nAlune aprovade");
			}else if(media[x]>=5 && media[x]<7) {
				System.out.println("\nAlune de exame");
			}else {
				System.out.println("\nAlune reprovade");
			}
		}
		mediaGeral = somaMedia / 3;
		System.out.printf("\nMédia geral: %.2f",mediaGeral);
		
		for(x=0;x<3;x++) {
			System.out.println("\nMédia do alune "+(x+1)+" : "+media[x]);
		}

	}

}
