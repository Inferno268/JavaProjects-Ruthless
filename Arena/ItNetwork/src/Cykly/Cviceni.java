package Cykly;
import java.util.Scanner;
public class Cviceni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadejte slovo, které chcete v cyklu");
		String slovo = sc.nextLine();
		System.out.println("Zadejte poèet opakování");
		int opakovani = Integer.parseInt(sc.nextLine());

	for(int i=0;i<opakovani;i++) {
		System.out.println(slovo);
	}
	System.out.println("Zadejte kolik èísel by se mìlo vypsat");
	int pocet = Integer.parseInt(sc.nextLine());
	int cislo = 0;
	
	while(cislo<pocet) {
		System.out.println(cislo);
		cislo++;
	}
	}

}
