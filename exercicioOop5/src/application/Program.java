package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Invoice;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Invoiced item number: ");
		int num = sc.nextInt();
		System.out.println("Item: ");
		String name = sc.next();
		System.out.println("Quantity of item purchased: ");
		int quantity = sc.nextInt();
		System.out.println("Item unit price: ");
		double price = sc.nextDouble();
		
		Invoice invoice = new Invoice(num, name, quantity, price);	
				
		System.out.println("total invoice amount: " + "\n" + invoice);
		
		sc.close();
	}
}
