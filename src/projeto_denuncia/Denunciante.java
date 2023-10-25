package projeto_denuncia;

public class Denunciante extends Pessoa {
	
	String rg;
	
	public Denunciante(String nome, String cpf, String dataNasimento, String rg) {
		super(nome, cpf, dataNasimento);
		this.rg = rg;
		
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
