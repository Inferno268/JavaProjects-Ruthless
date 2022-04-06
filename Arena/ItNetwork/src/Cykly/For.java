package Cykly;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*	for(int i = 0; i<3 ;i++) {
			System.out.println("Knock");
			
		}System.out.println("Penny");				//Sheldon
		
		for(int i = 1; i <11; i++) {
			System.out.println(i);
		}
	for(int j =1; j<11; j++) {							//násobilka
		
		for(int i = 1;i <11;i++) {
		System.out.print(j * i +" " );	
		}
		System.out.println();
	}*/
		System.out.println("Zadejte èíslo, které chcte mocnit: ");
		int s = Integer.parseInt(sc.nextLine());
		System.out.println("Zadejte èíslo, který chcete mocnit");
		int m = Integer.parseInt(sc.nextLine());
		int vysledek = s;
		for(int i = 0; i<(m-1); i++) {
			vysledek = vysledek *s;
		}
		System.out.println("Vysledek: " + vysledek);
		
		
	}

}