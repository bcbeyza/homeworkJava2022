package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		
		//abstract sınıflar asla newlenmez.
		
		GameCalculator gameCalculator=new WomanGameCalculator();
		gameCalculator.hesapla();
		

	}

}
