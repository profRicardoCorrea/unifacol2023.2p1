package calculadora;

public class Calculadora {
	
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
		//4+9*2/2-5
		int res_mult=multi(9,2);//18
		int div_res=div(2,res_mult);
		int soma_res=soma(4,div_res);
		System.out.println(soma_res-5);
	}

}
