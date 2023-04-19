package project3;

import java.util.Scanner;

public class exercicioo {

	public static void main(String[] args) {

		int primeiroNumero,numeroFinal,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com um numero ");
		primeiroNumero = leia.nextInt();
		
		System.out.println("\n Entre com um segundo numero");
		numeroFinal = leia.nextInt();
		
		if(primeiroNumero < numeroFinal) {
			for(x=primeiroNumero; x<=numeroFinal; x++) {
				if(x % 3 == 0 && x % 5 == 0) {
					System.out.println("\n O numero "+x+" É divisivel por 3 e 5");
					
				}
			}
		}else {
		System.out.println("\n O intervalo nao é valido, o primeiro numero é maior que o segundo");
		
		}
	}
}
		
				    
	


