package basico;

public class Sinal {
public static void main(String[] args) {
	String sinal="AMARELO";
	
	if(sinal=="VERDE")
		System.out.println("Siga");
	else if(sinal == "VERMELHO")
		System.out.println("PARE");
	else if(sinal == "AMARELO")
		System.out.println("ATENCAO");
	else
		System.out.println("SEM ENERGIA");
}
}
