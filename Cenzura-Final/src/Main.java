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
    file = (read.replaceAll(UseMe.censor("debil", "idiot","magor", "hovado", "kokot","èurák", "èùrák","pièus", "píèus", "cizák","ambaúra","babák","bastard","bembeøice","blbka","blejt","bordel","bordelmamá","brko","buchta","buk","buzerace","buzerant","buzerantskı","buzerovat","buzík","buzna","bıt putna","chcanec","chcaní","chcanky","chcát","chcípnout","chlívák","chuj","chujovina","èokoláda","èuba","èubièka","èubka","èurák","èúrák","èùrák","cyp","debil","debilka","debilní","dìlat si kozy","dìlat si prdel","dement","dementka","díra","do hajzlu","do pièe","do pièi","do píèi","do prdele","drbat","drek","drška","dr hubu","drka","dylina","frantík","grázl","hajzl","hajzlbába","hajzldìdek","hajzlpapír","haur","himlsakra","hòup","homokláda","honit","hoøet koudel u prdele","hovado","hovno","hovnocuc","hulibrk","idiot","imbecil","jako kdybys to vytáhl krávì z prdele","jebaèka","jebat","jejejnana","kláda","klandr","kokot","kokotina","kouøení","kouøit","kozomrd","kretén","kripl","ksindl","kulatina","kunda","kunïák","kundièka","kundolap","kuøbuøt","kurevník","kurevsky","kurva","kurvì","kurvit","kurvit se","kurvítko","lulin","lulín","magor","mamrd","minda","mlít hovna","mrd","mrdaèka","mrdat","mrdka","mrdlota","mrdna","mrdník","mrdnout","mrdnutı","na hovno","na prd","na pyèu","nasranı","nasrat","negr","obšoustník","ocas","ochlasta","oèurávat","ojebat","omrdat","oprcat","ošoustat","orala","pasák","péro","pièa","píèa","píchaèka","píchat","pièifuk","pièovina","píèovina","pièus","pitoma","pitoma","pizda","pochcat","poser","posera","posranı","posrat","posrat se","posrat se v kinì","prcat","prd","prdelatı","prdelka","prdìt","prdíèek","prdík","pøefiknout","prkno","prùser","pták","øiopich","ser","šoustat","spermohlt","šprcguma","šprcka","sráè","sraèka","sraní","srát","srát se","stát za hovno","šuk","šukání","šulda","šulin","šulín","v pièi","vandr","vošoust","vyjebat","vysrat","zajebanı","zasranı","zasrat","zjebat","zkurvenı","zkurvit","zkurvysyn","zmrd","zmrdat","zprcat"), "*"));
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

