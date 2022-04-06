package TahovýBoj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kostka kostka = new Kostka(10);					//vytvoøení objektu	(konstruktor)
		Bojovnik Imperius = new Bojovnik("Imperius",100,20,10,kostka);
		Bojovnik Arulus = new Bojovnik("Arulus" , 200, 50,10, kostka);
		Arena arena = new Arena(Imperius,Arulus,kostka);
		
		arena.zapas();
		
	}

}
