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
	
	String si = "Mount Everest";													//Anal�za znak� ve v�t�
	System.out.println(si);
	si = si.toLowerCase();
	
	int pocetSamohlasek= 0;
	int pocetSouhlasek = 0;
	
	String samohlasky ="aeiouy��������";
	String souhlasky ="bc�d�fghjklmnpqr�s�t�vwxz�";
	
	for(char c : si.toCharArray()) {
		if(samohlasky.contains(String.valueOf(c))) {
			pocetSamohlasek++;
		}
		else if (souhlasky.contains(String.valueOf(c)))	{
			pocetSouhlasek++;
		}
	}
	System.out.println("Pocet samohl�sek " + pocetSamohlasek);
	System.out.println("Po�et souhl�sek " + pocetSouhlasek);
	System.out.printf("Po�et nep�semn�ch znak� :%d\n ", si.length() - (pocetSamohlasek + pocetSouhlasek));

		char c; // znak
		int i; // ordin�ln� (ASCII) hodnota znaku
		// p�evedeme znak na jeho ASCII hodnotu
		c = 'a';
		i = (int)c;
		System.out.printf("Znak %c jsme p�evedli na ASCII hodnotu %d\n", c, i);
		// P�evedeme ASCII hodnotu na znak
		i = 98;
		c = (char)i;
		System.out.printf("ASCII hodnotu %d jsme p�evedli na znak %c", i, c);
	
	}
	
}
