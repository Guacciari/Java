package Project.Java2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int op,un,n1,n2,n3,n4,n5,n6,total;
		
		n1 = 10;
		n2 = 15;
		n3 = 18;
		n4 = 12;
		n5 = 8;
		n6 = 13;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMENU");
		System.out.println("\n1- Cachorro Quente / R$10,00");
		System.out.println("\n2- X-Salada / R$15,00");
		System.out.println("\n3- X-Bacon / R$18,00");
		System.out.println("\n4- Bauru / R$12,00");
		System.out.println("\n5- Refrigerante / R$8,00");
		System.out.println("\n6- Suco de Laranja / R$13,00");
		System.out.println("\n\nDigite o número do seu pedido informado no menu a cima: ");
		op = leia.nextInt();
		
		System.out.println("\nDigite a quantidade: ");
		un = leia.nextInt();
		System.out.println("\n\n\t\tPedido Finalisado");
		
		switch(op) {
		
		case 1:
			total = n1*un;
			System.out.println("\n"+un+" unidades de Cachorro Quente\n\nTotal: R$"+total);
			break;
		case 2:
			total = n2*un;
			System.out.println("\n"+un+" unidades de X-Salada\n\nTotal: R$"+total);
			break;
		case 3:
			total = n3*un;
			System.out.println("\n"+un+" unidades de X-Bacon\n\nTotal: R$"+total);
			break;
		case 4:
			total = n4*un;
			System.out.println("\n"+un+" unidades de Bauru\n\nTotal: R$"+total);
			break;
		case 5:
			total = n5*un;
			System.out.println("\n"+un+" unidades de Refrigerante\n\nTotal: R$"+total);
			break;
		default:
			total = n6*un;
			System.out.println("\n"+un+" unidades de Suco de Laranja\n\nTotal: R$"+total);
			
			
		}

	}

	{

	}

}
