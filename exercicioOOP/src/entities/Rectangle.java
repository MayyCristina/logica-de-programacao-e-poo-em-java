package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	
	public double rectangleArea() {
		return width * height;
	}
	public double rectanglePerimeter() {
		return 2 * (width + height);
	}
	public double rectangleDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
