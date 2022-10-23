package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[]
											{ new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for(BaseKrediManager kredis: krediManagers) {
			System.out.println(kredis.hesapla(1000));
		}
		
		
	}

}
