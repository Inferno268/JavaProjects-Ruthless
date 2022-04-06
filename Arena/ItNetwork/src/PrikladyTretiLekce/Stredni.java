package PrikladyTretiLekce;
import java.util.Scanner;
public class Stredni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte èíslo k umocnìní: ");
		String s =sc.nextLine();
		int a = Integer.parseInt(s);
		int vysledek = a*a;
		System.out.println(vysledek);
	}

}
