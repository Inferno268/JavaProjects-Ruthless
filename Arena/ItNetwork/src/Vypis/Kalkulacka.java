package Vypis;
import java.util.Scanner;
public class Kalkulacka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte dvì èísla do kalkulaèky");
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		int a = Integer.parseInt(s);
		int a2 =Integer.parseInt(s2);
		System.out.println("Sèítání: "+ (a+a2));
		System.out.println("Odèítání: "+ (a-a2));
		System.out.println("Násobení: "+(a*a2));
		System.out.println("Dìlení: "+(a/a2));
		
		
	/*kalkulaèka podle ItNetwork*/
		
		
		System.out.println("Vítejte v kalkulaèce");
		System.out.println("Zadejte první èíslo:");
		float z = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte druhé èíslo:");
		float b = Float.parseFloat(sc.nextLine());
		float soucet = z + b;
		float rozdil = z - b;
		float soucin = z * b;
		float podil = z / b;
		System.out.println("Souèet: " + soucet);
		System.out.println("Rozdíl: " + rozdil);
		System.out.println("Souèin: " + soucin);
		System.out.println("Podíl: " + podil);
		System.out.println("Dìkuji za použití kalkulaèky, aplikaci ukonèíte libovolnou klávesou.");
	
	
	
	}

}
