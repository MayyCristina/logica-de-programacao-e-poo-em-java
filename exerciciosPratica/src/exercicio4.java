import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		
		System.out.printf("A área do circulo é = %.4f", area);
		
		sc.close();	
	}
}
