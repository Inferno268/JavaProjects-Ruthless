package HelloWorld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Zdravic zdravic = new Zdravic();
		zdravic.text = "Ahoj u�ivateli";
		zdravic.pozdrav("Karel");
		zdravic.pozdrav("Janek");						//zdravic 1
		zdravic.text ="V�t�m t� tu program�tore";
		zdravic.pozdrav("Michal");*/
		
		
		Zdravic zdravic2 = new Zdravic();
		zdravic2.text = "Ahoj u�ivateli";
		System.out.println(zdravic2.pozdrav2("K�ja"));			//zdravic2
		System.out.println(zdravic2.pozdrav2("Rufus"));
		zdravic2.text = "Zdrav�m porgram�tore";
		System.out.println(zdravic2.pozdrav2("Albert"));
	
	
	}


}
