package Project.Java;

import java.util.Scanner;

public class laçosComdicionais {

	public static void main(String[] args) {

		
				/*
				 Operador Lógico E --> &&
				 Entrada1	Entrada2	Saída
				 V			V			V
				 V			F			F
				 F			V			F
				 F			F			F
				 
				  Operador Lógico OU --> ||
				 Entrada1	Entrada2	Saída
				 V			V			V
				 V			F			V
				 F			V			V
				 F			F			F
				 
				 */
				
				
				
				
				float n1,n2,n3,media;
				int op;
				
				
				Scanner leitura = new Scanner(System.in);
				
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leitura.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leitura.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				n3 = leitura.nextFloat();
				
				media = (n1+n2+n3)/3;
				System.out.printf("\nMedia aritmética foi de: %.2f e a nota 1 foi de: %.2f",media,n1);//4.5 6.5  9.25
				
				if(media>=7 && media<=10) {
					System.out.println("\nAlune aprovade!!!");
				}
				else if(media>=5 && media<7) {
					System.out.println("\nAlune de exame!!!");
				}
				else if(media>=0 && media<5){
					System.out.println("\nAlune reprovade!!!");
				}
				else {
					System.out.println("\nMédia fora do intervalo de 0 a 10");
				}
				
				System.out.println("\n\t\tMenu de elogios");
				System.out.println("\n1- Feliz");
				System.out.println("\n2- Acolhedora");
				System.out.println("\n3- está de Parabéns");
				System.out.println("\n4- Nota 10");
				System.out.println("\n5- É Show");
				System.out.println("\nDigite a sua opção: ");
				op = leitura.nextInt();//2
				
				switch(op) {
				
				case 1:
					System.out.println("\nFamília Feliz");
					break;
				case 2:
					System.out.println("\nFamília Acolhedora");
					break;
				case 3: 
					System.out.println("\nFamília está de Parabéns");
					break;
				case 4:
					System.out.println("\nFamília Nota 10");
					break;
				case 5:
					System.out.println("\nFamília É Show");
					break;
				default:
					System.out.println("\nOpção inválida!!!");
					
					
				}


	}

}
