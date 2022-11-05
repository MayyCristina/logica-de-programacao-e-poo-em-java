package entities;

public class Invoice {
	private int num;
	private String name;
	private int quantity;
	private double price;
	
	public Invoice(int num, String name, int quantity, double price) {
		this.num = num;
		this.name = name;
		
		if (quantity < 0) {
			quantity = 0;
		}
		else if (price < 0.0) {
			price = 0.0;
		}
		this.quantity = quantity;
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price; 
	}
	public double getInvoiceAmount() {
		return quantity * price;
	}
	public String toString() {
		return  "Num: "
				+ num + "\n"
	            + "Name item: " + String.format("%s", name) + "\n"
	            + "Quantity: " + String.format("%d" , quantity) + "\n"
	            + "Price: R$ " +  String.format("%.2f", price) + "\n"
	            + "Total invoice amount: R$ " + String.format("%.2f", getInvoiceAmount());
	}
}