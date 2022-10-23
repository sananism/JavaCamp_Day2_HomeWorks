package staticDemo;

public class ProductManager {
	public void add(Product product) {
	
		if(ProductValidator.isValid(product)) { // burda biz productValidator.isValid'in yerine
												//ProductValidatorun özünü new etmeden yaza bılerık
												// bunun ucun isValid methodunu static elemeyimiz
												// besdir.!
			System.out.println("Product added");
		}
		else {
			System.out.println("Product info is not valid");
		}
		
	
				ProductValidator productValidator = new ProductValidator();
				productValidator.nothing();
	
	}

}
