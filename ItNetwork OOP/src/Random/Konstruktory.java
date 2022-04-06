package Random;

public class Konstruktory {
	private int vek;
	private String Jmeno;
	
	public Konstruktory(String jmeno, int vek) {
		this.Jmeno = jmeno;
		this.vek=vek;
	}
	public String toString() {
		return Jmeno +" " + vek;
	}
}
