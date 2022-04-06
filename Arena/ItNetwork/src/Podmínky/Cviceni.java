package Podmínky;
import java.util.Scanner;
public class Cviceni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Rozhodnì te si o tom co chcete dìlat se svou postavou!");
		System.out.println("Zadejte 1 pro úpravu postavy");
		System.out.println("Zadejte 2 pro výbìr pozice ");
		System.out.println("Zadejte 3 pro výbìr brnìní");
		System.out.println("Zadejte 4 pro ukonèení programu");
		
		String vysledek;
		
		int volba= Integer.parseInt(sc.nextLine());
		/*
		
		int volba2 = Integer.parseInt(sc.nextLine());*/
		switch(volba)
		{
			case 1:
				
				System.out.println("Vybrali jste si úpravu postavy !");			//výbìr 
				System.out.println("Nyní si mùžte vybrat co chete dìlat!");
				System.out.println();
				System.out.println("Zadejte 1 pro zmìnu classy charakteru");
				System.out.println("Zadejte 2 pro zmìnu pohlaví");
				System.out.println("Zadejte 3 pro zmìnu barvy vlasù");
				System.out.println("Zadejte 4 pro zmìnu výšky vaší postavvy");
				int volba1= Integer.parseInt(sc.nextLine());
				
						switch(volba1) {
								case 1:
									System.out.println("Vybrali jste si zmìnu classy charakteru!");			//výbìr classy
									System.out.println("Zadejte 1 pokud si pøejete aby to byl ORK");
									System.out.println("Zadejte 2 pokud si pøejete aby to byl MÁG");
									System.out.println("Zadejte 3 pokud si ppøejete aby to byl BERSERKER ");
									System.out.println("Zadete 4 pokud si pøejte aby to byl LUKOSTØELEC");
									int volba1_1 =Integer.parseInt(sc.nextLine());
								
								switch(volba1_1) {
								case 1:
									System.out.println("Vybrali jste si ORKA");
								
								break;
								case 2 : 
									System.out.println("Vybrali jste si MÁGA");
								break;
								case 3 :
									System.out.println("Vybrali jste si BERESREKERA");
								break;
								case 4 :
									System.out.println("Vybrali jste si LUKOSTØELCE");
								break;
									
								
								}
								break;
								case 2 :
									System.out.println("vybrali jste si zmìnu pohlaví!");																			// výbìr pohlaví
									System.out.println();
									System.out.println("Zadjete 1 pokud si pøejte aby to byl Muž");
									System.out.println("Zadejte 2 pokud si pøejete aby to byla Žena");
									System.out.println("Zadejte 3 pokud si pøejte aby to bylo cokoli jiného napøíklad nebinární bojová helikoptéra appache");
									int volba1_2 = Integer.parseInt(sc.nextLine());
							switch(volba1_2) {
							case 1 :
								System.out.println("Váše postava je Muž!");
								break;
							case 2 :
								System.out.println("vaše postava je Žena");
								break;
							case 3 :
								System.out.println("Pokud toto nebyl pøeklep budu vás muset poprosit aby jste vypli mou hru :)");
								break;
								}
							break;
								case 3 :
									System.out.println("Vybrali jste si zmìnu barvy vlasù !");														//barva vlasù
									System.out.println();
									System.out.println("Zadejte jakou barvu si pøejte :");
									String barva = sc.nextLine();
									System.out.println("Barva vlasù vaší postavy: " + barva);
								break;
								case 4 :
									System.out.println("Vybrali jste si zmìnu výšky postavy ! ");						//vyska
									System.out.println();
									System.out.println("Zadejte prosím jakou výšku s pøejete");
									Double vyska = Double.parseDouble(sc.nextLine());
									System.out.println("Výška vaší postavy je : " + vyska);
									break;
								}
				
								break;
			case 2:
			 System.out.println("Vybrali jste si výbìr pozice");			//výbìr pozice	
			 System.out.println();
			 System.out.println("Zadejte 1 pro jungli");
			 System.out.println("Zadejte 2 pro Støedovou linii");
			 System.out.println("zadejte 3 pro Horní linii");
			 System.out.println("Zadejte 4 pro Spodní linii");
			 int volba2 = Integer.parseInt(sc.nextLine());
							 	switch(volba2)
							 	{
							 	case 1: 
							 		System.out.println("Vybrali jste si Jungli");
							 		break;
							 	case 2: 
							 		System.out.println("Vybrali jste si Støedovou linii");
							 		break;
							 	case 3: 
							 		System.out.println("Vybrali jste si Horní linii");
							 		break;
							 	case 4: 
							 		System.out.println("Vybrali jste si Spodní linii");
							 		break;
							 	}
							 	
							 break;
			 
			case 3 : 
				System.out.println("Vybrali jste si výbìr brnìní");			//výbìr brnìní
				System.out.println();
				System.out.println("Zadejte 1 pro koženné brnìní");
				System.out.println("Zadejte 2 pro želzené brnìní");
				System.out.println("Zadejte 3 pro diamnatové brnìní");
				int volba_3 = Integer.parseInt(sc.nextLine());
				
				switch(volba_3)
				{
				case 1 : 
					System.out.println("Vybrali jste si koženné brnìní");
					break;
				case 2 : 
					System.out.println("Vybrali jste si železné brnìní");
					break;
				case 3 : 
					System.out.println("Vybrali jste si diamantové brnìní");
					break;
				}
				break;
			case 4:
				System.out.println("Program byl ukonèen díky za hraní");		//ukonèení programu
				System.exit(0);
				break;
		}
		}

}
