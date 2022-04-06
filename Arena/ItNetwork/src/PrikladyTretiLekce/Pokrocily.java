package PrikladyTretiLekce;
import java.util.Scanner;
public class Pokrocily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte polomìr kruhu: ");
		String s = sc.nextLine();
		Float a = Float.parseFloat(s);
		Float obvod = 2*3.1415F* a;
		Float obsah = 3.1415F*(a*a);
		System.out.println("Obvod je : " + obvod + " a obsah je : " + obsah);
	}

}
