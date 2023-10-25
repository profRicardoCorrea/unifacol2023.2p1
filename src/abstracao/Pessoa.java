package abstracao;

import entidades.Contato;

public abstract class Pessoa  {
	public String nome;
	private String vulgo;
	private String cpf ;
	private String dataNasimento;
	private String rg;
	private String sexo;
	private Contato  contato;
	
	public abstract void vaildarCpf();
	public abstract String pegarCpf(String nome);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVulgo() {
		return vulgo;
	}
	public void setVulgo(String vulgo) {
		this.vulgo = vulgo;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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