package PoleZacatek;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
/*	String[] Simpsonovi = {"Homer", "Marge","Bart","Lisa","Maggie"};			//sort - srovn� prvky bu� podel abecedy nebo podle veliikosti ��sla
		Arrays.sort(Simpsonovi);
	for(String s : Simpsonovi) {
		System.out.print(s+" ");
	}
		String[] Simpsonovi = {"Homer", "Marge","Bart","Lisa","Maggie"};		//binarySearch - najde v poli prvek pokoud tam nen� vrac� -1
		System.out.println("Zadejte jm�no jednoho ze simpson�");
		String simpson = sc.nextLine();
	
		Arrays.sort(Simpsonovi);
	int pozice = Arrays.binarySearch(Simpsonovi, simpson); 
		if(pozice >= 0) {
			System.out.println("V� simpson se nach�z� v poli");
		}
		else {
			System.out.println("Zadali jste �patn� jm�no zkuste to znovu");
		}*/
	System.out.println("Zadej po�et zn�mek, kter� chce� zpr�m�rovat");			//length - velikost pole
	int pocet = Integer.parseInt(sc.nextLine());
	int[] cisla = new int[pocet];
	for(int i =0; i<pocet; i++) {
		System.out.println("Zadejte ��slo, kter� chcete zpr�m�rovat : ");
	 cisla[i] = Integer.parseInt(sc.nextLine());
	}
	int soucet =0;
	for(int i :cisla) {
		soucet += i;
	}
	float prumer = soucet/(float)cisla.length;
	
	System.out.println("Pr�m�r tv�ch zn�mek :" + prumer);
	
	}

}
