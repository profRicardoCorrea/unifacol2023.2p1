package poo;

public class MainAluno {
	public static void main(String[] args) {
		// Criando um objeto da classe Aluno
		Aluno aluno_1 = new Aluno();
		
		// Usando métodos do objeto
		aluno_1.definirMatricula(12124);
		// Acessando atributo do objeto Matricula
		System.out.println("Matricula do aluno: " + aluno_1.obterMatricula());
		
		// Usando métodos do objeto
		aluno_1.definirNome("Fulano da Silva");
		// Acessando atributo do objeto Matricula
		System.out.println("Nome do aluno: " + aluno_1.obterNome());
	}

}
