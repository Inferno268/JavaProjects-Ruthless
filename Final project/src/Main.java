import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 Random rd = new Random();
 System.out.println("Zadejte poèet pøíkladù: ");
 int pocet = sc.nextInt();
 System.out.println("Zadejte 1 pro poèítání celých èísel");
 System.out.println("Zadejte 2 pro poèítání zlomkù");
 System.out.println("Zadejte 3 pro pøevod mezi soustavami");
 int vyber = sc.nextInt();
 int body = 0;
 switch (vyber) {
 case 1:
     System.out.println("Poèítání celých èísel:");
     System.out.println("Zadejte 0 pro sèítání, 1 pro odèítání, 2 pro dìlení a 3 pro násobení");
     switch(sc.nextInt()) {
     case 0:
    	 try {
         for(int i = 0; i < pocet;i++) {
             int cislo1 = rd.nextInt(101);
             int cislo2 = rd.nextInt(101);
             System.out.println("Spoèítejte: " + cislo1 + " + " + cislo2 + " = ");
             int vysledekUzivatele = sc.nextInt();
             if(cislo1 + cislo2 == vysledekUzivatele) {
                 System.out.println("Správnì ");
                 body++;
             }else { 
                 System.out.println("Špatnì");
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
             System.out.println("Spoèítejte: " + cislo1 + " - " + cislo2 + " = ");
             int vysledekUzivatele = sc.nextInt();
             if(cislo1 - cislo2 == vysledekUzivatele) {
                 System.out.println("Správnì ");
                 body++;
             }else { 
                 System.out.println("Špatnì");
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
             System.out.println("Spoèítejte: " + cislo1 + " / " + cislo2 + " = ");
             Double vysledekUzivatele = sc.nextDouble();
             int vysledek =cislo1/cislo2;
             Math.round(vysledek);
             if(vysledek == vysledekUzivatele) {
                 System.out.println("Správnì ");
                 body++;
             }else { 
                 System.out.println("Špatnì");
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
    		 System.out.println("Spoèítejte: " + cislo1 + " * " + cislo2 + " = ");
    		 Double vysledekUzivatele = sc.nextDouble();
    		 if(cislo1 * cislo2 == vysledekUzivatele) {
    			 System.out.println("Správnì");
    			 body++;
    			 }
    		 else {
    			 System.out.println("Špatnì");
    		 }
    	 }
         break;
    	 }catch(Exception e) {
    		 System.out.println("Error zkuste to znovu");
    	 }break;
     }
     break;
 case 2:
	
	 System.out.println("Poèítání zlomkù");
	 System.out.println("Zadejte 0 pro sèítání, 1 pro odèítání, 2 pro dìlení a 3 pro násobení");
	 switch(sc.nextInt()) {
	 case 0:
		 try {
	 for(int i=0; i <pocet; i++) {
		 int jmenovatel = rd.nextInt(20)+1;
		 int citatel1 = rd.nextInt(21);
		 int citatel2 = rd.nextInt(21);
	System.out.println("Spoèítejte: " + citatel1 + " / " + jmenovatel + " + " + citatel2 + " / " + jmenovatel);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1 + citatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == jmenovatel) {
		System.out.println("Správnì");
		body++;
	 }
	else {
		System.out.println("Špatnì");
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
	System.out.println("Spoèítejte: " + citatel1 + " / " + jmenovatel + " - " + citatel2 + " / " + jmenovatel);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1 - citatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == jmenovatel) {
		System.out.println("Správnì");
		body++;
	}
	else {
		System.out.println("Špatnì");
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
	System.out.println("Spoèítejte: " + citatel1 + " / " + jmenovatel1 + " */* " + citatel2 + " / " + jmenovatel2);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1*jmenovatel2;
	int vysledek2 = jmenovatel1*citatel2;
	if( vysledekCitatel == vysledek && vysledekJmenovatel == vysledek2 ) {
		System.out.println("Správnì");
		body++;
	}
	else {
		System.out.println("Špatnì");
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
	System.out.println("Spoèítejte: " + citatel1 + " / " + jmenovatel1 + " * " + citatel2 + " / " + jmenovatel2);
	int vysledekCitatel = sc.nextInt();
	int vysledekJmenovatel = sc.nextInt();
	int vysledek = citatel1*citatel2;
	int vysledek2 = jmenovatel1 * jmenovatel2;
	if(vysledekCitatel == vysledek && vysledekJmenovatel == vysledek2) {
		System.out.println("Správnì");
		body++;
	}else {
		System.out.println("Špatnì");
	}
	  }
	  break;
	  }catch(Exception e) {
 		 System.out.println("Error zkuste to znovu");
 	 }break;
	 }
	 break;
 case 3:
	 System.out.println("Zadejte 0 pro pøevod do štnáctkové soustavy, 1 pro pøevod do desítkový, 2 pro pøevod do dvojkové soustavy");
	 switch(sc.nextInt()) {
	 case 0:
		 for(int i =0; i<pocet;i++) {
			 int cislo = rd.nextInt(100);
			 System.out.println("Pøeveïte " + cislo + " do šestnáctkové soustavy");
			 String vysledek = Integer.toHexString(cislo);
			 String vysledekUzivatele = sc.next();
			 if(vysledekUzivatele.equalsIgnoreCase(vysledek)) {
				 System.out.println("Správnì");
				 body++;
			 }
			 else {
				 System.out.println("Špatnì");
			 }
		 }
		 break;
	 
 case 1:
	 try {
	 for(int i =0; i<pocet; i++) {
		 int cislo = rd.nextInt(101);
		 System.out.println("Pøevïte " + cislo + " do desítkové soustavy");
		 int vysledekUzivatele = sc.nextInt();
		 if(vysledekUzivatele == cislo) {
			 System.out.println("Správnì");
			 body++;
		 }else {
			 System.out.println("Špatnì");
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
         System.out.println("Pøeveïte " + cislo + " do dvojkové soustavy");
         String vysledek = Integer.toBinaryString(cislo);
         System.out.println(vysledek);
         String vysledekUzivatele = sc.next();
         if (vysledekUzivatele.equalsIgnoreCase(vysledek)) {
             System.out.println("Správnì");
             body++;
         } else {
             System.out.println("Špatnì");
         }
     }

     break;	
	 }catch(Exception e) {
		 System.out.println("Error zkuste to znovu");
	 }break;
	 }
 }
 System.out.println("Vaše body :" + body);
	}
}
	