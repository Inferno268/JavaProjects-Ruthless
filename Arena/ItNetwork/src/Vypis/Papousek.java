package Vypis;
import java.util.Scanner;
public class Papousek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String vstup;
		System.out.println("Ahoj jsem virtu�ln� papou�ek Zoe a r�d opakuji v�ci ");
		System.out.println("�ekni n�co:");
		vstup = sc.nextLine();
		String vystup;   // m��u taky napsat String vstup = sc.netLine;
		vystup = vstup + "," + vstup +"!";
		System.out.println(vystup);
		
	}

}
