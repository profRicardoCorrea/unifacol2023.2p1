package entidades;

public class Denunciante extends Pessoa {
	private Contato contato;
	private Endereco endereco;
	private boolean manterAnonimato;
	
	public Denunciante() {}
	public Denunciante(Contato contato, Endereco endereco, boolean manterAnonimato) {
		 
		this.contato = contato;
		this.endereco = endereco;
		this.manterAnonimato = manterAnonimato;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isManterAnonimato() {
		return manterAnonimato;
	}
	public void setManterAnonimato(boolean manterAnonimato) {
		this.manterAnonimato = manterAnonimato;
	} 
	
}
