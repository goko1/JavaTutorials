package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//referans oluþturma, instance alma.
		Product product1 = new Product(1,"Lenovo V14",10000,"16 GB Ram");
		
		Product product2 = new Product(1,"Lenovo V15",12000,"16 GB Ram");
		
		Product product3 = new Product(3,"HP 15",12000,"16 GB Ram");

		Product[] products = {product1,product2,product3};
		
		System.out.println(products.length);
		
		for (Product product : products) {
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
		}
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
		
	}

}
