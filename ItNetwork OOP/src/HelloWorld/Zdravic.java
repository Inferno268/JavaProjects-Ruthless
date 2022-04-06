package HelloWorld;

public class Zdravic {
	public String text;
	
/*	public void pozdrav(String jmeno) {
		System.out.println(text +" "  + jmeno );
	}*/
	public String pozdrav2(String jmeno) {
		return String.format(text +" " + jmeno);
	}
	
}

