package denuncia;

public class Denuncia {
	Denunciante denunciante;
	Denunciado denunciado;
	String dataDenuncia;
	String descricao;
	String tipo;
	String situacao;
	Orgao orgao;
	
	public Denunciante getDenunciante() {
		return denunciante;
	}
	public void setDenunciante(Denunciante denunciante) {
		this.denunciante = denunciante;
	}
	public Denunciado getDenunciado() {
		return denunciado;
	}
	public void setDenunciado(Denunciado denunciado) {
		this.denunciado = denunciado;
	}
	public String getDataDenuncia() {
		return dataDenuncia;
	}
	public void setDataDenuncia(String dataDenuncia) {
		this.dataDenuncia = dataDenuncia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Orgao getOrgao() {
		return orgao;
	}
	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
	

}
