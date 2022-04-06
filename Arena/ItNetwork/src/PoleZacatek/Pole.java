package PoleZacatek;

public class Pole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pole = new int[10];
		pole[0] =1;
		for(int i =0; i<10;i++) {
			pole[i] = i+1;
		}
		for(int i=0; i<pole.length; i++) {
			System.out.print(pole[i]+" ");
		}
		String[] Simpsonovi = {"Homer", "Marge" , "Bart", "Lisa", "Meggie"};
		System.out.println(Simpsonovi);
	}

}
