package PrikladyTretiLekce;
import java.util.Scanner;
public class Jednoduchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ahoj jak se jmenuješ? ");
		String jmeno = sc.nextLine();
		System.out.println("A jaký jsi?");
		String vlastnosti = sc.nextLine();
		System.out.println(jmeno +" je " + vlastnosti);
		
	}

}
