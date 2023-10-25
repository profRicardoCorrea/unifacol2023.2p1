package entidades;

public abstract class Pessoa  {
	private String nome;
	private String vulgo;
	private String cpf ;
	private String dataNasimento;
	private String rg;
	private String sexo;
	private Contato  contato;

	public Pessoa() {}
	
	public Pessoa(String nome) {		
		this.nome = nome;		 
	}
	
	public Pessoa(String nome, String rg) {		
		this.nome = nome;
		this.rg = rg;
		this.dataNasimento = dataNasimento;
	}

	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public String getVulgo() {
		return vulgo;
	}

	public void setVulgo(String vulgo) {
		this.vulgo = vulgo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
	
	

}
