package Podmínky;
import java.util.Scanner;
public class PrvniPodminky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*
		if(15>5) {
			System.out.println("Pravda");
				System.out.println("Program pokraèuje dál");
		}
		System.out.println("Zadejte èíslo: ");
		int i = Integer.parseInt(sc.nextLine());
		if (i>5) {
			System.out.println("Zadali jste èíslo vìtší jak 5");
		}
	System.out.println("Zadejte nìjaké èíslo na odmocnìní:");
	int x = Integer.parseInt(sc.nextLine());
	if (x>0) {
		System.out.println("Zadal jste èíslo vìtší než nula tak pojïme na odmocnìní !");
		double o = Math.sqrt(x);
		System.out.println("Odmocnina z èísla "+ x + " je: "+ o);
	}
	else {
		System.out.println("Nemùžeme odmocòovat èíslo menší jak nula ");
		
	}*/
	System.out.println("Zadejte èíslo v rozmezí 10-20");
	int k = Integer.parseInt(sc.nextLine());
	if ((k>=10) && (k<=20)) {
		System.out.println("Zadali jste správné èíslo");
	
		}
	else {
		System.out.println("Vaše èíslo není v rozmezí 10-20 zkuste to znovu ");
	}
	
	
	}

}
