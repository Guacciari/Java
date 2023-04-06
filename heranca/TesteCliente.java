package heranca;

public class TesteCliente {

	public static void main(String[] args) {

		PessoaFisica cliente1 = new PessoaFisica("Gustavo", "gustavoaranha@gmail.com", 24, 1000000003, 119999991,
				"GustavoAcciari");

		cliente1.vizualizar();

		PessoaFisica cliente2 = new PessoaFisica("Edgar Alan Poe", "edgar99@gmail.com", 19, 2000000007, 119299997,
				"PeterPan");

		cliente2.vizualizar();

		PessoaJuridica cliente3 = new PessoaJuridica("itachi", "itachi@gmail.com", 20, 9, 119294499, "139.254.213-30");

		cliente3.vizualizar();

		PessoaJuridica cliente4 = new PessoaJuridica("Steve Universo", "Batman@gmail.com", 50, 4, 119197998,
				"165.134.353-96");

		cliente4.vizualizar();

	}

}
