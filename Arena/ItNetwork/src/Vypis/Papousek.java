package Vypis;
import java.util.Scanner;
public class Papousek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vstup;
		System.out.println("Ahoj jsem virtuální papoušek Zoe a rád opakuji vìci ");
		System.out.println("Øekni nìco:");
		vstup = sc.nextLine();
		String vystup;   // mùžu taky napsat String vstup = sc.netLine;
		vystup = vstup + "," + vstup +"!";
		System.out.println(vystup);
		
	}

}
