package abstracao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa p1= new Funcionario();
		p1.setNome("P1");
		Pessoa p2=new Aluno();
		p2.setNome("P2");
		
		Aluno a1=new Aluno();
		a1.nome="Aluno 1";
		a1.curso=CursosEnum.DIREITO;
		System.out.println(">>>"+(TipoDenunciaSimples.ViolenciaSimbolica));
		System.out.println(">>>"+(TipoDenuncia.ViolenciaSimbolica));
		
		/*ArrayList<Pessoa> pessoas=new ArrayList<>();
		pessoas.add(p2);
		pessoas.add(p1);
		
		System.out.println(pessoas);
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.nome);
		}
		System.out.println(pessoas.get(0).getNome());
		*/
		
		
		
	} 
}
