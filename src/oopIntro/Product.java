package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Default constructor oluþtu.");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.Id=id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int Id;
	String name;
	double unitPrice;
	String detail;

}
