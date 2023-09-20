package poo;

public class Aluno {
	String nome;
	int matricula;
	
	public void definirNome(String novoNome) {
		this.nome=novoNome;
	}
	
	public String obterNome() {
		return this.nome;
	}
	
	public void definirMatricula(int novaMatricula) {
		this.matricula=novaMatricula;
	}
	
	public int obterMatricula() {
		return this.matricula;
	}
}

