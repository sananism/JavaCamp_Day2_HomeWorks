package abstractClasses;

public abstract class BaseGameCalculator {
	public abstract void score();  // ABSTRACT DIYEREK BIZ BU METHODUN KULLANILMASINI ZORUNLU EDIRIK
								   // YENI EGER BASKA BIR SINIF BU SINIFI EXTENDS EDERSE HEMIN SINIF 
							       // BU METHODU ISTIFADE ETMELIDIR!
	
	public final void gameOver() {
		System.out.println("Game Over");
	}

}
