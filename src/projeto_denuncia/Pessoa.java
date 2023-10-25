package projeto_denuncia;

public abstract class Pessoa extends Contato {
	private String nome;
	private String cpf ;
	private String dataNasimento;
	public Pessoa(String nome, String cpf, 
			String dataNasimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasimento = dataNasimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNasimento() {
		return dataNasimento;
	}
	public void setDataNasimento(String dataNasimento) {
		this.dataNasimento = dataNasimento;
	}
	
	
	
	

}
