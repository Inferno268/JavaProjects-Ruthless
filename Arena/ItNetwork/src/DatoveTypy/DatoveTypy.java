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
		System.out.println(s.startsWith("Heimen"));		//kdy� za��n� slovem v uvozovk�ch vyp�e se true
		System.out.println(s.contains("dinger"));		//kdy� je slovo v z�vorce ve stringu pak je to true
		System.out.println(s.endsWith("frajeris"));		//kdyz string kon�� sovem z z�vorce vyp�e se true
		
		String a ="";
		String b =" ";
		String c ="Slovo";
		System.out.println(a.isEmpty());		//kdy� nen�  ve stringu a nic vyp�e se true
		System.out.println(b.isEmpty());		//kdy� je ve stringu b alespo� mezera vyp�e se false 
		System.out.println(c.isEmpty());		//kdy� je tam cokoli v�c vyp�e se true 
		
		String konfig =("Budou tam st�ny zm�na zvuku a Fullscreen ");
		konfig = konfig.toLowerCase();									//UpperCase nebo LowerCase za��d� aby se dalo pt�t na slova idky� se zad� opa�n� velikost p�smene 
		System.out.println("Pob�� hra ve fullscreenu?");
		System.out.println(konfig.contains("fullscreen"));
		System.out.println("Budu si moct zm�nit zvuk ?");
		System.out.println(konfig.contains("zvuk"));
		System.out.println("Budou tam st�ny ? ");
		System.out.println(konfig.contains("st�ny"));
		System.out.println("Budud si moct zm�nit nastaven� hudby ?");
		System.out.println(konfig.contains("hudba"));
		
		System.out.println("Zadejte ��slo:");
		String x = sc.nextLine();
		System.out.println("Zadal jste text: " + x);
		System.out.println("Text pro funkci trim: " +x.trim());
		int a = Integer.parseInt(x.trim());
		System.out.println("P�evedl jsem zadan� text na ��slo pomoc� parse, zadal jste : " + a);
	
		String s = "C# je nejlep��";
		s = s.replace("C#","Java");
		System.out.println(s); 
		
		int o = 20;
		int q = 15;
		int vysledek = o+q;
		String v = String.format("Kdy� se�teme %d a %d vyjde %d", o,q,vysledek);
		System.out.println(v);	*/
		
		System.out.println("Zadejte slovo: ");
		String p = sc.nextLine();
		System.out.println("Va�e slovo: " + p + " ,d�lka va�eho slova: " + p.length());
		
	}

}
