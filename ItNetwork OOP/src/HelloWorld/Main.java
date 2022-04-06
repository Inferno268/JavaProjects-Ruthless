package HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Zdravic zdravic = new Zdravic();
		zdravic.text = "Ahoj uživateli";
		zdravic.pozdrav("Karel");
		zdravic.pozdrav("Janek");						//zdravic 1
		zdravic.text ="Vítám tì tu programátore";
		zdravic.pozdrav("Michal");*/
		
		
		Zdravic zdravic2 = new Zdravic();
		zdravic2.text = "Ahoj uživateli";
		System.out.println(zdravic2.pozdrav2("Kája"));			//zdravic2
		System.out.println(zdravic2.pozdrav2("Rufus"));
		zdravic2.text = "Zdravím porgramátore";
		System.out.println(zdravic2.pozdrav2("Albert"));
	
	
	}


}
