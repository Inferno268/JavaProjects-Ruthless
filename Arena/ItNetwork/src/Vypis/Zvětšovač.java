package Vypis;
import java.util.Scanner;
public class Zv�t�ova� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte ��slo na zdvojn�soben�:");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		a = a*2;
		System.out.println(a);
		
	}	

}
