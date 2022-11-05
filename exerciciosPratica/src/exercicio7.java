import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int peca1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int peca2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		double valor = peca1 * preco1 + peca2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valor);
		
		sc.close();
	}
}
