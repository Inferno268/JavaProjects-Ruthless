package TextoveRetezce;

public class SplitJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wolfgang Amadeus Mozzart".substring(9,16)); 		//substring vr�t� pod�et�zec od dan� po��te�n� pozice do dan� koncov� pozice.
	
		System.out.println("Argentina".compareTo("Barbados"));					//compareTo
		
		// �et�zec, kter� chceme dek�dovat
		String s = ".-.. . --- -. .- .-. -.. ---";
		System.out.printf("P�vodn� zpr�va: %s\n", s);
		// �et�zec s dek�dovanou zpr�vou
		String zprava = "";

		// vzorov� pole
		String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
		String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
		"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
		"...-", ".--", "-..-", "-.--", "--.."};
		
		// rozbit� �et�zce na znaky morzeovky
		String[] znaky = s.split(" ");

		// iterace znaky morzeovky
		for (String morseuvZnak : znaky) {

		}
		
		char abecedniZnak = '?';

		int index = -1;
	/*	for (int i = 0; i < morseovyZnaky.length; i++) {
		    if (morseovyZnaky[i].equals(morseuvZnak))
		        index = i;*		}
*/
		if (index >= 0) { // znak nalezen
		    abecedniZnak = abecedniZnaky.charAt(index);
		}
		zprava += abecedniZnak;
		
	
	}

}
