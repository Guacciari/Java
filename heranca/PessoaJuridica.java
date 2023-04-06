package heranca;


	public class PessoaJuridica extends Cliente {
		
		private String cnpj;
		
		// método construtor
		public PessoaJuridica(String nomeCliente, String email, int idade, int cpf, int telefone, String cnpj) {
			super(nomeCliente, email, idade, cpf, telefone);
			this.cnpj = cnpj;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		
		// método vizualizar todos os elementos da Pessoa Jurídica:
		public void vizualizar() {
			System.out.println("Nome do cliente: "+getNomeCliente()+"\nEmail: "+getEmail()+"\nIdade: "+getIdade()+
					"\nTelefone: "+getTelefone()+"\nCNPJ: "+getCnpj()+"\n\n");
			
		}
		
		
		
		
		
	}

