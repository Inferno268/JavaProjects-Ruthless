package PoleZacatek;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
/*	String[] Simpsonovi = {"Homer", "Marge","Bart","Lisa","Maggie"};			//sort - srovná prvky buï podel abecedy nebo podle veliikosti èísla
		Arrays.sort(Simpsonovi);
	for(String s : Simpsonovi) {
		System.out.print(s+" ");
	}
		String[] Simpsonovi = {"Homer", "Marge","Bart","Lisa","Maggie"};		//binarySearch - najde v poli prvek pokoud tam není vrací -1
		System.out.println("Zadejte jméno jednoho ze simpsonù");
		String simpson = sc.nextLine();
	
		Arrays.sort(Simpsonovi);
	int pozice = Arrays.binarySearch(Simpsonovi, simpson); 
		if(pozice >= 0) {
			System.out.println("Váš simpson se nachází v poli");
		}
		else {
			System.out.println("Zadali jste špatné jméno zkuste to znovu");
		}*/
	System.out.println("Zadej poèet známek, které chceš zprùmìrovat");			//length - velikost pole
	int pocet = Integer.parseInt(sc.nextLine());
	int[] cisla = new int[pocet];
	for(int i =0; i<pocet; i++) {
		System.out.println("Zadejte èíslo, která chcete zprùmìrovat : ");
	 cisla[i] = Integer.parseInt(sc.nextLine());
	}
	int soucet =0;
	for(int i :cisla) {
		soucet += i;
	}
	float prumer = soucet/(float)cisla.length;
	
	System.out.println("Prùmìr tvých známek :" + prumer);
	
	}

}
