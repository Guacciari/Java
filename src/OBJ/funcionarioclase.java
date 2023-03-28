package OBJ;

public class funcionarioclase {

	private float orcamento;
	private String nome;
	private String endereço;
	private int cpf;
	private int rg;
	public funcionarioclase(float orcamento, String nome, String endereço, int cpf, int rg) {
		super();
		this.orcamento = orcamento;
		this.nome = nome;
		this.endereço = endereço;
		this.cpf = cpf;
		this.rg = rg;
	}
	public float getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public void leia () {
		System.out.println("*****************************************************");
		System.out.println("                informaçoes do(a) funcionario(a) "                   );
		System.out.println("*****************************************************");
		System.out.println("\n"+nome );
		System.out.println("\n"+endereço );
		System.out.println("\ncpf"+cpf );
		System.out.println("\nrg"+rg );
	}

}
