package entidades;

public class Denuncia{
	private Denunciante denunciante;
	private Denunciado denunciado;
	private String dataDenuncia;
	private String descricao;
	//enum TipoDenuncia
	private String tipo;
	//enum  SituacaoDenuncia
	private	String situacao;
	private Orgao orgao;
	//enum CategoriaDenuncia
	private String categoria;	 
	 
	public Denuncia(Denunciante denunciante, Denunciado denunciado, String dataDenuncia, String descricao, String tipo,
			String situacao, Orgao orgao, String categoria) {
		 
		this.denunciante = denunciante;
		this.denunciado = denunciado;
		this.dataDenuncia = dataDenuncia;
		this.descricao = descricao;
		this.tipo = tipo;
		this.situacao = situacao;
		this.orgao = orgao;
		this.categoria = categoria;
	}
	
	public Denuncia( ) {
		 
	}

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
	
	 
	

}
