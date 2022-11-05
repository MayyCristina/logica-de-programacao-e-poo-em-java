import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma do primeiro valor com o segundo valor é: " + soma);
		
		sc.close();
		
	}

}
