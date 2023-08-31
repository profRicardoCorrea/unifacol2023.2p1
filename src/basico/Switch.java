package basico;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Switch {
	public static void main(String []args) {
		int x=0;
		//Scanner sc1 = new Scanner(System.in);
		//System.out.println("Digite uma opção:");
		x =6;
	/*switch(x) {
		  case 1,7,10:
			  System.out.println("Opcao 1");
		  break;
		  
		  case 2:
			  System.out.println("Opcao 2");
		    break;
		  case 3:
			  System.out.println("Opcao 3");
			  break;
		  case 4:
			  System.out.println("Opcao 4");
			  break;
		  default:
			  System.out.println("SEM Opcao");
		}
		*/
		
			/*while (x>0){
				System.out.println(">>>"+x);
				x--;
				if(x==5)
					continue;
				System.out.println("apos continue:"+x);
				*/
		/*for (int i = 0; i <= 5; i++) {
			  System.out.println(i);
			  
			}*/
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda1", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda", "BMW", "Ford", "Mazda"};
		//
		/*for (int i = 0; i<cars.length;i++) {
			System.out.println("i:"+i+">>Marca:"+cars[i]+"TAMANHO:"+cars.length);
			
		}*/
		
		for (String marca : cars) {
			/*if(marca.equals("Mazda1")) {
				System.out.println(">>Marca:"+marca);
				for (long i=0; i<100000;i++) {
					System.out.println("----"+i);;
					
				}
				break;
			}*/
			if(!marca.equals("Mazda1")) 
				continue;
			else {
				System.out.println(">>Marca:"+marca);
				for (int i=0; i<100000;i++) {
					System.out.println("----"+i+">>"+marca);
					
				}
				break;
			}
			
			
		}
		
		
				
	}
}
