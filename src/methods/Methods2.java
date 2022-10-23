package methods;

public class Methods2 {

	public static void main(String[] args) {
			
		String mesaj = "Bugun hava cok guzel";
		// String yeniMesaj = topla(); //Xeta verir cunki topla(); methodu int oldugu ucun biz bunu Stringe 
									   // Qoya bilmerik, eger topla String olsaydi xeta vermiyecekdi.
		int sayi = topla(35,7);
		System.out.println(sayi);
		
		int toplam = topla2(1,2,3,45,6);
		System.out.println(toplam);
	
		
	}
	
	public static int topla2(int... sayilar) {
		int toplam2 = 0;
		for(int sayi:sayilar) {  // Bu sayilar'daki herbir sayi ucun demekdir
			toplam2+=sayi;
		}
		
		return toplam2;
	}

	public static void ekle() {
			System.out.println("Eklendi"); // Bunu bele saxlasag ekrana hecne dondurmeyecek
										   // Cunki Javada kodlar MAIN methodundan baslayir
										   // Ona gorede biz bunun islemeyini isteyirikse 
										   // Gedib bu methodu MAIN methodunda cagirmaliyiq
	}

	public static int topla(int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	
}
