package Podm?nky;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Zadejte 2 ??sla pro kalkula?ku");
		float a = Float.parseFloat(sc.nextLine());
		float b = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte 1 pro s??t?n?");
		System.out.println("Zadejte 2 pro od??t?n?");
		System.out.println("Zadejte 3 pro n?soben?");
		System.out.println("Zadejte 4 pro d?len?");
		
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
		System.out.println("V?sledek : " + vysledek);
		
	}
	else {
		System.out.println("Neplatn? volba");
	}
}
	
}
