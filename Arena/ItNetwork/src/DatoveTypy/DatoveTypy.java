package DatoveTypy;
import java.util.Scanner;
public class DatoveTypy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
/*	//boolean
		boolean vetsi;
		vetsi = true;
		boolean mensi =(15<5);
		System.out.println(mensi);
		
	//Stringy
		String s =("Heimendingerfrajeris");
		System.out.println(s.startsWith("Heimen"));		//když zaèíná slovem v uvozovkách vypíše se true
		System.out.println(s.contains("dinger"));		//když je slovo v závorce ve stringu pak je to true
		System.out.println(s.endsWith("frajeris"));		//kdyz string konèí sovem z závorce vypíše se true
		
		String a ="";
		String b =" ";
		String c ="Slovo";
		System.out.println(a.isEmpty());		//když není  ve stringu a nic vypíše se true
		System.out.println(b.isEmpty());		//když je ve stringu b alespoò mezera vypíše se false 
		System.out.println(c.isEmpty());		//když je tam cokoli víc vypíše se true 
		
		String konfig =("Budou tam stíny zmìna zvuku a Fullscreen ");
		konfig = konfig.toLowerCase();									//UpperCase nebo LowerCase zaøídí aby se dalo ptát na slova idkyž se zadá opaèná velikost písmene 
		System.out.println("Pobìží hra ve fullscreenu?");
		System.out.println(konfig.contains("fullscreen"));
		System.out.println("Budu si moct zmìnit zvuk ?");
		System.out.println(konfig.contains("zvuk"));
		System.out.println("Budou tam stíny ? ");
		System.out.println(konfig.contains("stíny"));
		System.out.println("Budud si moct zmìnit nastavení hudby ?");
		System.out.println(konfig.contains("hudba"));
		
		System.out.println("Zadejte èíslo:");
		String x = sc.nextLine();
		System.out.println("Zadal jste text: " + x);
		System.out.println("Text pro funkci trim: " +x.trim());
		int a = Integer.parseInt(x.trim());
		System.out.println("Pøevedl jsem zadaný text na èíslo pomocí parse, zadal jste : " + a);
	
		String s = "C# je nejlepší";
		s = s.replace("C#","Java");
		System.out.println(s); 
		
		int o = 20;
		int q = 15;
		int vysledek = o+q;
		String v = String.format("Když seèteme %d a %d vyjde %d", o,q,vysledek);
		System.out.println(v);	*/
		
		System.out.println("Zadejte slovo: ");
		String p = sc.nextLine();
		System.out.println("Vaše slovo: " + p + " ,délka vašeho slova: " + p.length());
		
	}

}
