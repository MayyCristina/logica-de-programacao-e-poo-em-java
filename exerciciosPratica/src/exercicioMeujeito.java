import java.util.Locale;

public class exercicioMeujeito {
	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", wich price is $" +price1);
		System.out.println(product2 + ", wich price is $" +price2);
		System.out.println();
		System.out.println("Record:" + age + " years old, " + "code " + code + " and gender: " + gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f", measure);
		System.out.println();
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
