package projeto_denuncia;

public class Denuncia extends Teste {
	protected Denunciante denunciante;
	protected Denunciado denunciado;
	protected String dataDenuncia;
	private String descricao;
	public String tipo;
	public	String situacao;
	public Orgao orgao;
	
	
	
	public Denuncia(Denunciante denunciante, 
			Denunciado denunciado, 
			String dataDenuncia, String descricao, String tipo,
			String situacao, Orgao orgao, int codigo) {
		super(codigo);
		this.denunciante = denunciante;
		this.denunciado = denunciado;
		this.dataDenuncia = dataDenuncia;
		this.descricao = descricao;
		this.tipo = tipo;
		this.situacao = situacao;
		this.orgao = orgao;
	}
	public Denuncia() {super(0);}
	public Denuncia(int x,int y) {super(0);}
	
	public Denuncia(int codigo) {
		super(0);
	}
	
	
	
	public Denunciante getDenunciante() {
		return denunciante;
	}
	public Denunciante getDenunciante(int x) {
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
