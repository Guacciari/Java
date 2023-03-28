package estruturadedados;

public class exercicio2 {

	public static void main(String[] args) {



		import java.util.Iterator;
		import java.util.Scanner;
		import java.util.Stack;


		public class exercicio2 {

			public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				Stack<String> pilhaLivros = new Stack<String>();
				String livro;
				int opcao;
				
				
				
				while (true) {

					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                RETIRADA DE LIVROS                   ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1: Adicionar um novo livro na pilha.     ");
					System.out.println("            2: Listar todos os livros da pilha.      ");
					System.out.println("            3: Retirar um livro da pilha.            ");
					System.out.println("            0: O programa deve ser finalizado.       ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     ");

					opcao = leia.nextInt();

					if (opcao == 0) {
						System.out.println("\nPrograma Finalizado!");
						leia.close();
						System.exit(0);
					}
					
					
					switch (opcao) {
						case 1:
							System.out.println("Digite o nome do novo Livro: \n\n");
							leia.nextLine();
							livro = leia.nextLine();
							pilhaLivros.push(livro);
							System.out.println("\nLivro Adicionado!");
							
							break;
						case 2:
							System.out.println("Todos os Livros: \n\n");
							
							Iterator<String> iLivro = pilhaLivros.iterator();
							
							while(iLivro.hasNext()) {
								System.out.println(iLivro.next());
							}
							
							break;
						case 3:
							if(pilhaLivros.isEmpty()) {
								System.out.println("\nA pilha de livros está vazia! ");

							}else {
								System.out.println("\nRetirando seguite Livro: " + pilhaLivros.pop());
							}
							
							break;
						
						default:
							
							System.out.println("\nOpção Inválida!\n");
							break;
					}
				}

			}

		}