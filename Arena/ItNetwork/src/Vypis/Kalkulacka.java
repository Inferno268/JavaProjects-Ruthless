package Vypis;
import java.util.Scanner;
public class Kalkulacka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte dv� ��sla do kalkula�ky");
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		int a = Integer.parseInt(s);
		int a2 =Integer.parseInt(s2);
		System.out.println("S��t�n�: "+ (a+a2));
		System.out.println("Od��t�n�: "+ (a-a2));
		System.out.println("N�soben�: "+(a*a2));
		System.out.println("D�len�: "+(a/a2));
		
		
	/*kalkula�ka podle ItNetwork*/
		
		
		System.out.println("V�tejte v kalkula�ce");
		System.out.println("Zadejte prvn� ��slo:");
		float z = Float.parseFloat(sc.nextLine());
		System.out.println("Zadejte druh� ��slo:");
		float b = Float.parseFloat(sc.nextLine());
		float soucet = z + b;
		float rozdil = z - b;
		float soucin = z * b;
		float podil = z / b;
		System.out.println("Sou�et: " + soucet);
		System.out.println("Rozd�l: " + rozdil);
		System.out.println("Sou�in: " + soucin);
		System.out.println("Pod�l: " + podil);
		System.out.println("D�kuji za pou�it� kalkula�ky, aplikaci ukon��te libovolnou kl�vesou.");
	
	
	
	}

}
