package Faktorial;

public class Faktorial {
	
	/*public int faktorial(int n) {			//bez rekurze
		int vysledek = 1;
		for(int i =1; i<=n;i++) 
			vysledek = vysledek *i;
			return vysledek;
	}*/
	 public int faktorial(int n) {			//s rekurzí
		 int vysledek;
		 if(n ==1)
			 return 1;
		 vysledek = faktorial(n-1)*n;
		 return vysledek;
	 }
	 
	public String reverse(String s) {		//metoda na vypsání stringu pospátku
		String vysledek;
		if(s.isEmpty())
			return s;
		vysledek = reverse(s.substring(1)) + s.charAt(0);
		return vysledek;
	}
	public int fibonacci(int o) {			//fibonacciho poslounost 
		 if(o <2)
			 return o;
		
		 return fibonacci(o-1) + fibonacci(o-2);
		
	}
	
}
