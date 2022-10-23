package staticDemo;

public class ProductValidator {
	
	
	static {   // Ben staticlerde'de basda birsey yazdirmag isdiyirem desek eger, bunu yazirig
		System.out.println("Static Yapici blok calistirildi");
	}
	
	
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}
	
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {  //burda biz product
			return true;
		}
		else {
			return false;
		}
	}
	
	public void nothing() {
		
	}

}
