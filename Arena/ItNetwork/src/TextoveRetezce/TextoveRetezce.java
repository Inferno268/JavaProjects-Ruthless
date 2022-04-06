package TextoveRetezce;
import java.util.Scanner;
public class TextoveRetezce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "Java";
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("v"));
	
	String si = "Mount Everest";													//Analıza znakù ve vìtì
	System.out.println(si);
	si = si.toLowerCase();
	
	int pocetSamohlasek= 0;
	int pocetSouhlasek = 0;
	
	String samohlasky ="aeiouyáéìíóúùı";
	String souhlasky ="bcèdïfghjklmnpqrøsštvwxz";
	
	for(char c : si.toCharArray()) {
		if(samohlasky.contains(String.valueOf(c))) {
			pocetSamohlasek++;
		}
		else if (souhlasky.contains(String.valueOf(c)))	{
			pocetSouhlasek++;
		}
	}
	System.out.println("Pocet samohlásek " + pocetSamohlasek);
	System.out.println("Poèet souhlásek " + pocetSouhlasek);
	System.out.printf("Poèet nepísemnıch znakù :%d\n ", si.length() - (pocetSamohlasek + pocetSouhlasek));

		char c; // znak
		int i; // ordinální (ASCII) hodnota znaku
		// pøevedeme znak na jeho ASCII hodnotu
		c = 'a';
		i = (int)c;
		System.out.printf("Znak %c jsme pøevedli na ASCII hodnotu %d\n", c, i);
		// Pøevedeme ASCII hodnotu na znak
		i = 98;
		c = (char)i;
		System.out.printf("ASCII hodnotu %d jsme pøevedli na znak %c", i, c);
	
	}
	
}
