package entidades;

public class Orgao {
	
	private String nome;
	private String descricao;
	private String sigla;	
	private String portal;
	private Endereco endereco;
	private Funcionario[] responsaveis=new Funcionario[10] ;
	
	public Orgao(String nome, String descricao, String sigla, Funcionario[] responsaveis) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.sigla = sigla;
		this.responsaveis = responsaveis;
	}
	
	public Orgao() {	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPortal() {
		return portal;
	}
	public void setPortal(String portal) {
		this.portal = portal;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Funcionario[] getResponsaveis() {
		return responsaveis;
	}
	public void setResponsaveis(Funcionario[] responsaveis) {
		this.responsaveis = responsaveis;
	}
}
