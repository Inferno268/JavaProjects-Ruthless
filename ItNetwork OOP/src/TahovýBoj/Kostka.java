package TahovýBoj;

import java.util.Random;

public class Kostka {
	private int pocetSten;
	Random rd = new Random();
	public Kostka() {
		pocetSten=6;
		Random rd = new Random();
	}
	public Kostka(int aPocetSten) {
		pocetSten = aPocetSten;
		Random rd = new Random(); 				//Konstruktory
	}
	public int vratPocetSten() {				//metody
		return pocetSten;
	}
	public int hod() {
		return rd.nextInt(pocetSten) +1;
	}
	@Override
	public String toString() {
		return String.format("Kostka s "+ pocetSten + " stìnami");
	}

}
