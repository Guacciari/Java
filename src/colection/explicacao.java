package colection;

import java.util.ArrayList;
import java.util.Scanner;

public class explicacao {

	public static void main(String[] args) {

		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n---------------------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa de estoque?");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}else {
					System.out.println("\nEste produto não existe!!!");
				}
				System.out.println("\nOProdutos do estoque:");
				System.out.println(estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do"+verifica+" : ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nEste produto não existe!!!");
				}
				System.out.println("\nProdutos do estoque:");
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nProdutos do estoque:");
				System.out.println(estoque);
				break;
				
			case 0:
				System.out.println("\nMuito obrigado por utilizar do nosso sistema... Volte sempre!!!");
				break;
				
				default:
					System.out.println("\nOpção inválida...Digite novamente");
				
			}
			
		}while(op != 0);

	}

}