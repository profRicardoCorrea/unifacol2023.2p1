package entidades;

public class Funcionario  extends Pessoa{
	
	private String setor;
	private String funcao;
	
	public Funcionario(String setor, String funcao) {
		super();
		this.setor = setor;
		this.funcao = funcao;
	}
	public Funcionario() {}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
}
