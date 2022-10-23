package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		Product product2 = new Product();
		product2._name = "TV";
		product._name = "Kompyuter";
		product._id= 85;
		product._description ="Lenovo";
		product._price = 6500;
		product._stockAmount = 5;
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add(product2);
		
		System.out.println(product._name);
		System.out.println(product.getKod());

	}

}
