package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Queue<String> cliente = new LinkedList();

		Scanner leia = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 4) {

			System.out.println("*******************************************");
			System.out.println("                  MENU                     ");
			System.out.println("*******************************************");
			System.out.println(" 1 Adicionar cliente na fila ");
			System.out.println(" 2 Listar todos os clientes  ");
			System.out.println(" 3 Retirar cliente da fila   ");
			System.out.println(" 4 Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite seu nome: ");
				leia.nextLine();
				String nome = leia.nextLine();
				cliente.add(nome);
				break;

			case 2:
				System.out.println("clientes da fila ");
				System.out.println(cliente);
				break;
			case 3:
				if (cliente.isEmpty()) {
					System.out.println("a lista de cliente esta vazia ");

				} else {
					System.out.println(" o cliente foi chamado ");
					cliente.remove();

				}
				break;
			case 4:
				System.out.println("O programa foi finalizado ");
				break;
			default:
				System.out.println("escolha uma opçao valida ");

			}

		}

	}

}
