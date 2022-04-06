package Podmínky;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Zadejte 2 èísla pro kalkulaèku");
		float a = Float.parseFloat(sc.nextLine());
		float b = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte 1 pro sèítání");
		System.out.println("Zadejte 2 pro odèítání");
		System.out.println("Zadejte 3 pro násobení");
		System.out.println("Zadejte 4 pro dìlení");
		
		int volba =Integer.parseInt(sc.nextLine());
		float vysledek =0;
		switch (volba) {
		case 1 :
			vysledek = a+b;
			break;
		case 2 :
			vysledek = a-b;
			break;
		case 3 :
			vysledek =a*b;
			break;
		case 4 :
			vysledek = a/b;
			break;
		}
	if((volba >0 )&& (volba <5)){
		System.out.println("Vısledek : " + vysledek);
		
	}
	else {
		System.out.println("Neplatná volba");
	}
}
	
}
