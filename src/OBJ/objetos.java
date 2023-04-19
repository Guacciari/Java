package OBJ;

public class objetos {

	private float orçamento;
	private String nome;
	private String endereço;
	private int cfp;
	private int rg;

	public objetos(float orçamento, String nome, String endereço, int cfp, int rg) {
		super();
		this.orçamento = orçamento;
		this.nome = nome;
		this.endereço = endereço;
		this.cfp = cfp;
		this.rg = rg;
	}

	public float getOrçamento() {
		return orçamento;
	}

	public void setOrçamento(float orçamento) {
		this.orçamento = orçamento;
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

	public int getCfp() {
		return cfp;
	}

	public void setCfp(int cfp) {
		this.cfp = cfp;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public void leia() {
		System.out.println("O(A) cliente " + nome + " residente do endereço " + endereço + " do " + cfp + " e " + rg
				+ " tem o orçamento de "+orçamento );
	}
}
