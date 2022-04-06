import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		
		try {
	String path = "C:\\Users\\marek\\eclipse-workspace\\Cenzura-Final\\File.TXT";		//Finds path to the file
    String read = Files.readString(Paths.get(path));    								//Conver file into String
    
    Censor UseMe = new Censor();														//instance of other class
    
    
    String file = read;																	//saves file into String 
    System.out.println("File before censor: ");
    System.out.println();
    System.out.println(file);															//lists the file
    System.out.println();
    //Censor
    file =file.toLowerCase();															//sets all words to lowerCase
    file = (read.replaceAll(UseMe.censor("debil", "idiot","magor", "hovado", "kokot","�ur�k", "��r�k","pi�us", "p��us", "ciz�k","amba��ra","bab�k","bastard","bembe�ice","blbka","blejt","bordel","bordelmam�","brko","buchta","buk","buzerace","buzerant","buzerantsk�","buzerovat","buz�k","buzna","b�t putna","chcanec","chcan�","chcanky","chc�t","chc�pnout","chl�v�k","chuj","chujovina","�okol�da","�uba","�ubi�ka","�ubka","�ur�k","��r�k","��r�k","cyp","debil","debilka","debiln�","d�lat si kozy","d�lat si prdel","dement","dementka","d�ra","do hajzlu","do pi�e","do pi�i","do p��i","do prdele","drbat","drek","dr��ka","dr� hubu","dr�ka","dylina","frant�k","gr�zl","hajzl","hajzlb�ba","hajzld�dek","hajzlpap�r","haur","himlsakra","h�up","homokl�da","honit","ho�et koudel u prdele","hovado","hovno","hovnocuc","hulibrk","idiot","imbecil","jako kdybys to vyt�hl kr�v� z prdele","jeba�ka","jebat","jejejnana","kl�da","klandr","kokot","kokotina","kou�en�","kou�it","kozomrd","kret�n","kripl","ksindl","kulatina","kunda","kun��k","kundi�ka","kundolap","ku�bu�t","kurevn�k","kurevsky","kurva","kurv�","kurvit","kurvit se","kurv�tko","lulin","lul�n","magor","mamrd","mind�a","ml�t hovna","mrd","mrda�ka","mrdat","mrdka","mrdlota","mrdna","mrdn�k","mrdnout","mrdnut�","na hovno","na prd","na py�u","nasran�","nasrat","negr","ob�oustn�k","ocas","ochlasta","o�ur�vat","ojebat","omrdat","oprcat","o�oustat","o�rala","pas�k","p�ro","pi�a","p��a","p�cha�ka","p�chat","pi�ifuk","pi�ovina","p��ovina","pi�us","pitoma","pitoma","pizda","pochcat","poser","posera","posran�","posrat","posrat se","posrat se v kin�","prcat","prd","prdelat�","prdelka","prd�t","prd��ek","prd�k","p�efiknout","prkno","pr�ser","pt�k","�i�opich","ser","�oustat","spermohlt","�prcguma","�prcka","sr��","sra�ka","sran�","sr�t","sr�t se","st�t za hovno","�uk","�uk�n�","�ulda","�ulin","�ul�n","v pi�i","vandr","vo�oust","vyjebat","vysrat","zajeban�","zasran�","zasrat","zjebat","zkurven�","zkurvit","zkurvysyn","zmrd","zmrdat","zprcat"), "*"));
    System.out.println("File after censor: ");
    System.out.println();
    System.out.println(file);
    BufferedWriter writer = new BufferedWriter(new FileWriter("RewitedFile.TXT"));  		//Creating rewrited file 
   
    
    writer.write(file);																		//writing into new file
    writer.newLine();
    writer.write("try to write less vulgarly :(");
    writer.close();																			//closing rewrited file
    
}
catch(IOException ex){																		//Exceptions file wasNt found
	System.out.println("Error, file: " + ex.getLocalizedMessage () + " not found");
}

}
 }

