import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double triArea, cirArea, trapArea, quadArea, retArea;
		double pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triArea = (A * C) / 2;
		cirArea = pi * C * C;
		trapArea = ((A + B) * C) / 2;
		quadArea = B * B;
		retArea = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triArea);
		System.out.printf("CIRCULO: %.3f%n", cirArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapArea);
		System.out.printf("QUADRADO: %.3f%n", quadArea);
		System.out.printf("RETANGULO: %.3f", retArea);
		
		sc.close();
	}
}
