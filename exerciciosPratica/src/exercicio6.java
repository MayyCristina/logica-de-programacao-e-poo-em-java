import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int funcionarioNum = sc.nextInt();
	int horasTrabalhada = sc.nextInt();
	double valorHora = sc.nextDouble();
	
	double salario = horasTrabalhada * valorHora;
	
	System.out.println("NUMBER = " + funcionarioNum);
	System.out.printf("SALÁRIO = R$ %.2f", salario);
	
	sc.close();	
	}
}
