package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enther rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.rectangleArea();
		System.out.printf("AREA: %.2f%n", + area);
		double perimeter = rectangle.rectanglePerimeter();
		System.out.printf("PERIMETER: %.2f%n", + perimeter);
		double diagonal = rectangle.rectangleDiagonal();
		System.out.printf("DIAGONAL: %.2f%n", + diagonal);
		
		sc.close();	
	}
}


