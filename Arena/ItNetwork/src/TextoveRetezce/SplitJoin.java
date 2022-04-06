package TextoveRetezce;

public class SplitJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wolfgang Amadeus Mozzart".substring(9,16)); 		//substring vrátí podøetìzec od dané poèáteèní pozice do dané koncové pozice.
	
		System.out.println("Argentina".compareTo("Barbados"));					//compareTo
		
		// øetìzec, který chceme dekódovat
		String s = ".-.. . --- -. .- .-. -.. ---";
		System.out.printf("Pùvodní zpráva: %s\n", s);
		// øetìzec s dekódovanou zprávou
		String zprava = "";

		// vzorová pole
		String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
		String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
		"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
		"...-", ".--", "-..-", "-.--", "--.."};
		
		// rozbití øetìzce na znaky morzeovky
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
