package TahovýBoj;

public class Bojovnik {
	/** Jméno bojovníka */
	private String jmeno;
	/** Život v HP */
	private int hp;
	/** Maximální zdraví */
	private int maxHp;
	/** Útok v HP */
	private int utok;
	/** Obrana v HP */
	private int obrana;
	 /** Instance hrací kostky */
	private Kostka kostka;
	
	private String zprava;
	
	public Bojovnik(String jmeno, int hp, int utok, int obrana, Kostka kostka) {			// konstruktor pro základní atributy
		this.jmeno = jmeno;
		this.hp=hp;
		this.maxHp = hp;
		this.utok = utok;
		this.obrana = obrana;
		this.kostka = kostka;
	}
	public boolean nazivu() {																// metoda pro zjištìní jestli je bojovník naživu 
		if(hp >0 ){
		return true;
		}else {
			return false;	
		}
		
	}
	public String grafickyZivot() {
		String s ="[";
		int celkem =20;
		double pocet = Math.round(((double)hp/maxHp)* celkem);
		if((pocet ==0) && (nazivu())) {
			pocet = 1;
		}
		for(int i =0; i< pocet;i++) {
			s+= "#";
		}
		for(int i=0; i< celkem - pocet; i++) {
			s +=" ";
		}
		s +="]";
		return s;
		}
	public void branSe(int uder) {
		int zraneni = uder -(obrana +kostka.hod());
		if(zraneni >0) {
			hp-= zraneni;
			 zprava = String.format("%s utrpìl poškození %s hp", jmeno, zraneni);
			if(hp <=0) {
				hp =0;
				zprava += " a zemøel";
			}
		}
		else 
			zprava = String.format("%s odrazil útok", jmeno);
	    	nastavZpravu(zprava);
	}
	
	public void utoc(Bojovnik souper) {
		int uder = utok + kostka.hod();
		nastavZpravu(String.format(jmeno + " útoèí s úderem za " + utok + " hp" ));
		souper.branSe(uder);
	}
	public void nastavZpravu(String zprava) {
		this.zprava = zprava;
	}
	public String vratPosledniZpravu() {
		return zprava;
	}
	
	public String toString() {																// metoda pro vypsání jména bcs je private
		return jmeno;
	}
}
