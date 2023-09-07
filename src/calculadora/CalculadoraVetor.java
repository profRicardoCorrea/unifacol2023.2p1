package calculadora;

import java.util.Iterator;

public class CalculadoraVetor {
	
	public static int soma(int numero1, int numero2) {		
		return numero1+numero2;
	}
	
	public static int multi(int numero1, int numero2) {		
		return numero1*numero2;
	}
	public static int div(int numero1, int numero2) {		
		return numero1/numero2;
	}
	public static int sub(int numero1, int numero2) {		
		return numero1-numero2;
	}
	
	
	public static void main(String[] args) {
		String [] operacoes= {"*","+"};
		int[] valores= {5,9,12};
		int res_mult=0;
		int res_soma=0;
		for (int i=0; i< operacoes.length;i++) {
			
			System.out.println(operacoes[i]);
			
			switch (operacoes[i]) {
			case "*": 
				res_mult=multi(valores[0], valores[1]);
				break;
			case "+":
				res_soma=soma(res_mult,valores[2]);
				break;
			
			default:
				
			}
			
		}
		System.out.println("RES FINAL:"+res_soma);
		
	}

}
