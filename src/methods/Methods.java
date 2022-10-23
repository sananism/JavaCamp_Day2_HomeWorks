package methods;

public class Methods {

	public static void main(String[] args) {
		
	 numberFinder();
		

	}
	
	
	 public static void numberFinder() {
			int [] sayilar = new int []{1,2,5,7,9,0};
			int aranacak = 2;
			boolean tapildi = false;
			for(int finder:sayilar) {
				if(finder == aranacak) {
					tapildi = true;
					break;
				}
			}
			if(tapildi) {
				giveMessage("Bulundu : " + aranacak);	// MESELEN : SYSO yazmadig sadece giveMessage methodunu cagirdig
			}else {
				giveMessage("Bulunamadi : " + aranacak);
			}
	 }
	 
	 public static void giveMessage(String message) {   // Burada her defe SYSO yazmag yerine bir defe bu methodda yazib
		 System.out.println(message);				   //  qalan yerlerde syso yazmag yerine sadece bu metodu cagirib  
	 }												  //   () icine istediyimiz Stringi(yazmag istediyimiz seyi) yaza bilerik		

}
