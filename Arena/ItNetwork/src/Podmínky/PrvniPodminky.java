package Podm�nky;
import java.util.Scanner;
public class PrvniPodminky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*
		if(15>5) {
			System.out.println("Pravda");
				System.out.println("Program pokra�uje d�l");
		}
		System.out.println("Zadejte ��slo: ");
		int i = Integer.parseInt(sc.nextLine());
		if (i>5) {
			System.out.println("Zadali jste ��slo v�t�� jak 5");
		}
	System.out.println("Zadejte n�jak� ��slo na odmocn�n�:");
	int x = Integer.parseInt(sc.nextLine());
	if (x>0) {
		System.out.println("Zadal jste ��slo v�t�� ne� nula tak poj�me na odmocn�n� !");
		double o = Math.sqrt(x);
		System.out.println("Odmocnina z ��sla "+ x + " je: "+ o);
	}
	else {
		System.out.println("Nem��eme odmoc�ovat ��slo men�� jak nula ");
		
	}*/
	System.out.println("Zadejte ��slo v rozmez� 10-20");
	int k = Integer.parseInt(sc.nextLine());
	if ((k>=10) && (k<=20)) {
		System.out.println("Zadali jste spr�vn� ��slo");
	
		}
	else {
		System.out.println("Va�e ��slo nen� v rozmez� 10-20 zkuste to znovu ");
	}
	
	
	}

}
