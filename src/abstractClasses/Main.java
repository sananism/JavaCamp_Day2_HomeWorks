package abstractClasses;

public class Main {

	public static void main(String[] args) {
		 
		BaseGameCalculator baseGameCalculator = new WomanGameCalculator(); // WOMAN 
		baseGameCalculator.score();
		baseGameCalculator.gameOver();

	}

}
