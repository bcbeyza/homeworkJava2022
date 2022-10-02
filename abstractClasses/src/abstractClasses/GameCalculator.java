package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();//kim inherite ediyorsa hesaplayı override etmek zorunda
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}

}

//if we can use this word "final" we can't override this method.'