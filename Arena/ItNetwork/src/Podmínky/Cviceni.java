package Podm�nky;
import java.util.Scanner;
public class Cviceni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Rozhodn� te si o tom co chcete d�lat se svou postavou!");
		System.out.println("Zadejte 1 pro �pravu postavy");
		System.out.println("Zadejte 2 pro v�b�r pozice ");
		System.out.println("Zadejte 3 pro v�b�r brn�n�");
		System.out.println("Zadejte 4 pro ukon�en� programu");
		
		String vysledek;
		
		int volba= Integer.parseInt(sc.nextLine());
		/*
		
		int volba2 = Integer.parseInt(sc.nextLine());*/
		switch(volba)
		{
			case 1:
				
				System.out.println("Vybrali jste si �pravu postavy !");			//v�b�r 
				System.out.println("Nyn� si m��te vybrat co chete d�lat!");
				System.out.println();
				System.out.println("Zadejte 1 pro zm�nu classy charakteru");
				System.out.println("Zadejte 2 pro zm�nu pohlav�");
				System.out.println("Zadejte 3 pro zm�nu barvy vlas�");
				System.out.println("Zadejte 4 pro zm�nu v��ky va�� postavvy");
				int volba1= Integer.parseInt(sc.nextLine());
				
						switch(volba1) {
								case 1:
									System.out.println("Vybrali jste si zm�nu classy charakteru!");			//v�b�r classy
									System.out.println("Zadejte 1 pokud si p�ejete aby to byl ORK");
									System.out.println("Zadejte 2 pokud si p�ejete aby to byl M�G");
									System.out.println("Zadejte 3 pokud si pp�ejete aby to byl BERSERKER ");
									System.out.println("Zadete 4 pokud si p�ejte aby to byl LUKOST�ELEC");
									int volba1_1 =Integer.parseInt(sc.nextLine());
								
								switch(volba1_1) {
								case 1:
									System.out.println("Vybrali jste si ORKA");
								
								break;
								case 2 : 
									System.out.println("Vybrali jste si M�GA");
								break;
								case 3 :
									System.out.println("Vybrali jste si BERESREKERA");
								break;
								case 4 :
									System.out.println("Vybrali jste si LUKOST�ELCE");
								break;
									
								
								}
								break;
								case 2 :
									System.out.println("vybrali jste si zm�nu pohlav�!");																			// v�b�r pohlav�
									System.out.println();
									System.out.println("Zadjete 1 pokud si p�ejte aby to byl Mu�");
									System.out.println("Zadejte 2 pokud si p�ejete aby to byla �ena");
									System.out.println("Zadejte 3 pokud si p�ejte aby to bylo cokoli jin�ho nap��klad nebin�rn� bojov� helikopt�ra appache");
									int volba1_2 = Integer.parseInt(sc.nextLine());
							switch(volba1_2) {
							case 1 :
								System.out.println("V�e postava je Mu�!");
								break;
							case 2 :
								System.out.println("va�e postava je �ena");
								break;
							case 3 :
								System.out.println("Pokud toto nebyl p�eklep budu v�s muset poprosit aby jste vypli mou hru :)");
								break;
								}
							break;
								case 3 :
									System.out.println("Vybrali jste si zm�nu barvy vlas� !");														//barva vlas�
									System.out.println();
									System.out.println("Zadejte jakou barvu si p�ejte :");
									String barva = sc.nextLine();
									System.out.println("Barva vlas� va�� postavy: " + barva);
								break;
								case 4 :
									System.out.println("Vybrali jste si zm�nu v��ky postavy ! ");						//vyska
									System.out.println();
									System.out.println("Zadejte pros�m jakou v��ku s p�ejete");
									Double vyska = Double.parseDouble(sc.nextLine());
									System.out.println("V��ka va�� postavy je : " + vyska);
									break;
								}
				
								break;
			case 2:
			 System.out.println("Vybrali jste si v�b�r pozice");			//v�b�r pozice	
			 System.out.println();
			 System.out.println("Zadejte 1 pro jungli");
			 System.out.println("Zadejte 2 pro St�edovou linii");
			 System.out.println("zadejte 3 pro Horn� linii");
			 System.out.println("Zadejte 4 pro Spodn� linii");
			 int volba2 = Integer.parseInt(sc.nextLine());
							 	switch(volba2)
							 	{
							 	case 1: 
							 		System.out.println("Vybrali jste si Jungli");
							 		break;
							 	case 2: 
							 		System.out.println("Vybrali jste si St�edovou linii");
							 		break;
							 	case 3: 
							 		System.out.println("Vybrali jste si Horn� linii");
							 		break;
							 	case 4: 
							 		System.out.println("Vybrali jste si Spodn� linii");
							 		break;
							 	}
							 	
							 break;
			 
			case 3 : 
				System.out.println("Vybrali jste si v�b�r brn�n�");			//v�b�r brn�n�
				System.out.println();
				System.out.println("Zadejte 1 pro ko�enn� brn�n�");
				System.out.println("Zadejte 2 pro �elzen� brn�n�");
				System.out.println("Zadejte 3 pro diamnatov� brn�n�");
				int volba_3 = Integer.parseInt(sc.nextLine());
				
				switch(volba_3)
				{
				case 1 : 
					System.out.println("Vybrali jste si ko�enn� brn�n�");
					break;
				case 2 : 
					System.out.println("Vybrali jste si �elezn� brn�n�");
					break;
				case 3 : 
					System.out.println("Vybrali jste si diamantov� brn�n�");
					break;
				}
				break;
			case 4:
				System.out.println("Program byl ukon�en d�ky za hran�");		//ukon�en� programu
				System.exit(0);
				break;
		}
		}

}
