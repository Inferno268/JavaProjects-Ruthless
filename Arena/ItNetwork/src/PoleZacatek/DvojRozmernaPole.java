package PoleZacatek;

public class DvojRozmernaPole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] kinosal= new int[5][5];
	kinosal[2][2] =1; //prostøedek pole 
	for( int i =1; i<4; i++) {
		kinosal[i][3] =1; //4. øádek  
	}
	for(int i=0; i <5; i++) {
		kinosal[i][4] =1; // poslední øádek
	}
	for(int j =0; j <kinosal[0].length; j++) {
		for (int i =0; i< kinosal.length; i++) {
			System.out.print(kinosal[i][j]);
		}
		System.out.println();
	}

	int[][] kinosal2 = new int[5][];		//zubaté pole 
	
	for( int i=0; i <kinosal2.length; i++) {
		kinosal2[i] = new int [5];
	}
	int sloupcu = kinosal2.length;
	int radku = 0;
	if (sloupcu != 0)
	    radku = kinosal2[0].length;

	kinosal2[4][2] = 1; // Obsazujeme sedadlo v 5. sloupci a 3. øadì

		
	}

}
