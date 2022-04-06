package Vypis;
import java.util.Scanner;
public class Zvìtšovaè {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte èíslo na zdvojnásobení:");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		a = a*2;
		System.out.println(a);
		
	}	

}
