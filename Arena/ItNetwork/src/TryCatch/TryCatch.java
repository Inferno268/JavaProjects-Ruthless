package TryCatch;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte 2 ��sla, kter� chcete d�lit");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		try {
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Nelze d�lit nulou");
			
		}
	}

}
