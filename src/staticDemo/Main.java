package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 5;
		product.name = "Lenovo";
		product.price = 650;
		
		manager.add(product);
		
		DataBaseHelper.Crud.Delete();  //INNER CLASS
		DataBaseHelper.Connection.createConnection(); //INNER CLASS

	}

}
