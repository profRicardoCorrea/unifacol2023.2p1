package interfaces;

public abstract class NotaMetodo {
	public abstract float verNota(int matricula, int codDiciplina);
	
	public abstract void mudarNota(int matricula, int codDiciplina, float novaNota);
	
	public abstract void adicionarNota(int matricula, int codDiciplina, float novaNota);
	
	public void imprimirNota(int matricula, int codDiciplina) {
		System.out.println(verNota(matricula, codDiciplina));
	}
	

}
