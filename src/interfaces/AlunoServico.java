package interfaces;

public class AlunoServico extends NotaMetodo{

	@Override
	public float verNota(int matricula, int codDiciplina) {
		
		return 5.7f;
	}

	@Override
	public void mudarNota(int matricula, int codDiciplina, float novaNota) {
		System.out.println("Aluno:"+matricula+" Disciplina:"+codDiciplina+" Nota:"+novaNota);
		
	}

	@Override
	public void adicionarNota(int matricula, int codDiciplina, float novaNota) {
		System.out.println("Aluno:"+matricula+" Disciplina:"+codDiciplina+" Nota:"+novaNota);
		
		
	}
	
	
	
	public void imprimirNota(int matricula, int codDiciplina) {
		System.out.println("OI");
	}
	

}
