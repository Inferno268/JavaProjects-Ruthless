import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 Random rd = new Random();
 System.out.println("Zadejte po�et p��klad�: ");
 int pocet = sc.nextInt();
 System.out.println("Zadejte 1 pro po��t�n� cel�ch ��sel");
 System.out.println("Zadejte 2 pro po��t�n� zlomk�");
 System.out.println("Zadejte 3 pro p�evod mezi soustavami");
 int vyber = sc.nextInt();
 int body = 0;
 switch (vyber) {
 case 1:
     System.out.println("Po��t�n� cel�ch ��sel:");
     System.out.println("Zadejte 0 pro s��t�n�, 1 pro od��t�n�, 2 pro d�len� a 3 pro n�soben�");
     switch(sc.nextInt()) {
     case 0:
    	 try {
         for(int i = 0; i < pocet;i++) {
             int cislo1 = rd.nextInt(101);
             int cislo2 = rd.nextInt(101);
             System.out.println("Spo��tejte: " + cislo1 + " + " + cislo2 + " = ");
             int vysledekUzivatele = sc.nextInt();
             if(cislo1 + cislo2 == vysledekUzivatele) {
                 System.out.println("Spr�vn� ");
                 body++;
             }else { 
                 System.out.println("�patn�");
             }
         }
         break;
    	 }catch(Exception e) {
    		 System.out.println("Error zkuste to znovu");
    	 }break;
    	 case 1:
    		 try {
         for(int i = 0; i < pocet;i++) {
             int cislo1 = rd.nextInt(101);
             int cislo2 = rd.nextInt(101);
             System.out.println("Spo��tejte: " + cislo1 + " - " + cislo2 + " = ");
             int vysledekUzivatele = sc.nextInt();
             if(cislo1 - cislo2 == vysledekUzivatele) {
                 System.out.println("Spr�vn� ");
                 body++;
             }else { 
                 System.out.println("�patn�");
             }break;
         }
       
    		 }catch(Exception e) {
        		 System.out.println("Error zkuste to znovu");
        	 }break;
     case 2:
    	 try {
         for(int i = 0; i < pocet;i++) {
             int cislo1 = rd.nextInt(21);
             int cislo2 = rd.nextInt(21);
             System.out.println("Spo��tejte: " + cislo1 + " / " + cislo2 + " = ");
             Double vysledekUzivatele = sc.nextDouble();
             int vysledek =cislo1/cislo2;
             Math.round(vysledek);
             if(vysledek == vysledekUzivatele) {
                 System.out.println("Spr�vn� ");
                 body++;
             }else { 
                 System.out.println("�patn�");
             }
         }
         break;
    	 }catch(Exception e) {
    		 System.out.println("Error zkuste to znovu");
    	 }break;
     case 3:
    	 try {
    	 for(int i =0; i <pocet;i++) {
    		 int cislo1 = rd.nextInt(101);
    		 int cislo2 = rd.nextInt(101);
    		 System.out.println("Spo��tejte: " + cislo1 + " * " + cislo2 + " = ");
    		 Double vysledekUzivatele = sc.nextDouble();
    		 if(cislo1 * cislo2 == vysledekUzivatele) {
    			 System.out.println("Spr�vn�");
    			 body++;
    			 }
    		 else {
    			 System.out.println("�patn�");
    		 }
    	 }
         break;
    	 }catch(Exception e) {
    		 System.out.println("Error zkuste to znovu");
    	 }break;
     }
     break;
 case 2:
	
	 System.out.println("Po��t�n� zlomk�");
	 System.out.println("Zadejte 0 pro s��t�n�, 1 pro od��t�n�, 2 pro d�len� a 3 pro n�soben�");
	 switch(sc.nextInt()) {
	 case 0:
		 try {
	 for(int i=0; i <pocet; i++) {
		 int jmenovatel = rd.nextInt(20)+1;
		 int citatel1 = rd.nextInt(21);
		 int citatel2 = rd.nextInt(21);
	System.out.println("Spo��tejte: " + citatel1 + " / " + jmenovatel + " + " + citatel2 + " / " + jmenovatel);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1 + citatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == jmenovatel) {
		System.out.println("Spr�vn�");
		body++;
	 }
	else {
		System.out.println("�patn�");
	}
	 }
  break;
		 }catch(Exception e) {
    		 System.out.println("Error zkuste to znovu");
    	 }break;
	 case 1:
	  try {
	 for(int i=0; i <pocet; i++) {
		 int jmenovatel = rd.nextInt(20)+1;
		 int citatel1 = rd.nextInt(21);
		 int citatel2 = rd.nextInt(21);
	System.out.println("Spo��tejte: " + citatel1 + " / " + jmenovatel + " - " + citatel2 + " / " + jmenovatel);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1 - citatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == jmenovatel) {
		System.out.println("Spr�vn�");
		body++;
	}
	else {
		System.out.println("�patn�");
	}
	 	}
	 break;
	  }catch(Exception e) {
 		 System.out.println("Error zkuste to znovu");
 	 }break;
  case 2:
	  try { 
	  for(int i =0; i<pocet; i++) {
		int jmenovatel1 = rd.nextInt(20)+1;
		int jmenovatel2 = rd.nextInt(20)+1;
		int citatel1 = rd.nextInt(21);
		int citatel2 = rd.nextInt(21);
	System.out.println("Spo��tejte: " + citatel1 + " / " + jmenovatel1 + " */* " + citatel2 + " / " + jmenovatel2);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1*jmenovatel2;
	int vysledek2 = jmenovatel1*citatel2;
	if( vysledekCitatel == vysledek && vysledekJmenovatel == vysledek2 ) {
		System.out.println("Spr�vn�");
		body++;
	}
	else {
		System.out.println("�patn�");
	}
	  }
	break;
	  }catch(Exception e) {
 		 System.out.println("Error zkuste to znovu");
 	 }break;
  case 3:
	  try {
	  for(int i =0; i<pocet; i++) {
		int jmenovatel1 = rd.nextInt(20)+1;
		int jmenovatel2 = rd.nextInt(20)+1;
		int citatel1 = rd.nextInt(21);
		int citatel2 = rd.nextInt(21);
	System.out.println("Spo��tejte: " + citatel1 + " / " + jmenovatel1 + " * " + citatel2 + " / " + jmenovatel2);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1*citatel2;
	int vysledek2 = jmenovatel1 * jmenovatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == vysledek2) {
		System.out.println("Spr�vn�");
		body++;
	}else {
		System.out.println("�patn�");
	}
	  }
	  break;
	  }catch(Exception e) {
 		 System.out.println("Error zkuste to znovu");
 	 }break;
	 }
	 break;
 case 3:
	 System.out.println("Zadejte 0 pro p�evod do �tn�ctkov� soustavy, 1 pro p�evod do des�tkov�, 2 pro p�evod do dvojkov� soustavy");
	 switch(sc.nextInt()) {
	 case 0:
		 for(int i =0; i<pocet;i++) {
			 int cislo = rd.nextInt(100);
			 System.out.println("P�eve�te " + cislo + " do �estn�ctkov� soustavy");
			 String vysledek = Integer.toHexString(cislo);
			 String vysledekUzivatele = sc.next();
			 if(vysledekUzivatele.equalsIgnoreCase(vysledek)) {
				 System.out.println("Spr�vn�");
				 body++;
			 }
			 else {
				 System.out.println("�patn�");
			 }
		 }
		 break;
	 
 case 1:
	 try {
	 for(int i =0; i<pocet; i++) {
		 int cislo = rd.nextInt(101);
		 System.out.println("P�ev�te " + cislo + " do des�tkov� soustavy");
		 int vysledekUzivatele = sc.nextInt();
		 if(vysledekUzivatele == cislo) {
			 System.out.println("Spr�vn�");
			 body++;
		 }else {
			 System.out.println("�patn�");
		 }
		
	 }

	 break;
	 }catch(Exception e) {
		 System.out.println("Error zkuste to znovu");
	 }break;
 case 2:
	 try {
     for (int i = 0; i < pocet; i++) {
         int cislo = rd.nextInt(101);
         System.out.println("P�eve�te " + cislo + " do dvojkov� soustavy");
         String vysledek = Integer.toBinaryString(cislo);
         System.out.println(vysledek);
         String vysledekUzivatele = sc.next();
         if (vysledekUzivatele.equalsIgnoreCase(vysledek)) {
             System.out.println("Spr�vn�");
             body++;
         } else {
             System.out.println("�patn�");
         }
     }

     break;	
	 }catch(Exception e) {
		 System.out.println("Error zkuste to znovu");
	 }break;
	 }
 }
 System.out.println("Va�e body :" + body);
	}
}
	