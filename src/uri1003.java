import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		double a = sc.nextDouble ();
		double b = sc.nextDouble ();
		double c = a + b;
		
		System.out.printf ("Soma = %.0f%n ", c);
	
		sc.close();
	}
}
