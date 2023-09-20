package denuncia;

public class Main {
	public static void main(String[] args) {
		 Orgao orgaoPoliciaCivil=null;
		 Orgao orgaoPoliclinica;
		 Orgao orgaoSamu=new  Orgao();
		 orgaoPoliciaCivil=new Orgao();
		 orgaoPoliciaCivil.setNome("Policia Civil");
		 orgaoPoliclinica=new Orgao();
		 orgaoPoliclinica.setNome("Policlinica Vitoria");		 
		 orgaoSamu.setNome("SAMU");
		 //String nome=null;
		 /*int x=8;
		 int y=x;
		 x=0;*/		 
		 Orgao orgaoSamu2=orgaoSamu;		 
		 orgaoSamu2.nome="SAMU VITORIA";
		 orgaoSamu.email="samu@";
		 orgaoSamu2.portal="www";
		 System.out.println("Orgao:"+(orgaoSamu.nome));
		 System.out.println("Orgao2:"+(orgaoSamu2.nome));
		 
		 Denunciante denunciante_1=new Denunciante();
		 denunciante_1.setCpf("001010");
		 denunciante_1.setNome("Fulano");
		 denunciante_1.setDataNascimento("02/01/2000");
		 denunciante_1.setRg("24234");
		 Denunciante denunciante_2=new Denunciante();
		 denunciante_2.setCpf("4555");
		 Denunciante denunciante_3=new Denunciante();
		 denunciante_3.setCpf("1234");
		 
		 Denunciado denunciado_1=new Denunciado();
		 denunciado_1.setRg("0099");
		 
		 Denunciado denunciado_2=new Denunciado();
		 denunciado_2.setRg("0098");
		 
		 Denunciado denunciado_3=new Denunciado();
		 denunciado_3.setRg("0096");
		 
		 
	}
}
