package basico;

public class Fatorial {
public static int soma(int x) {
	System.out.println("x:"+x);
	return x;
}
public static void main(String[] args) {
			int n=5;
			//n=n+1;
			n++;
			//--n;
			//System.out.println("n:"+(n--));
			//System.out.println("n:"+(--n));
			System.out.println(soma(n++));
			System.out.println(n);
		}
	
}
