package Faktorial;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Faktorial f = new Faktorial();
		System.out.println(f.faktorial(2));
		String s = "Ahoj troubo";
		String reversed = f.reverse(s);
		System.out.println(reversed);
		
	//	System.out.println(f.fibonacci(13));
		
		
	/*	int[] pole = new int[10];
		for(int i =0; i<pole.length; i++) {
			pole[i] = i+1;
			System.out.print(pole[i]+ " " );
		}
		System.out.println();
		int pole2[] = {0,1,1,2,3,5,8,13,21,34};
		pole[1] = 1;
		System.out.println(f.fibonacci(pole2[rd.nextInt(10)]));*/
	
		int x= f.fibonacci(9);
		System.out.println(x);
	
	
	
	}

}
