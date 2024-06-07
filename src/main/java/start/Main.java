package start;

import utility.FileUtility;
import utility.StringUtility;
import javax.xml.bind.*;

public class Main {

	public static void main(String[] args) throws JAXBException{ 
		System.out.println("Soluzione 1: Per Stampare i dati del Json");
		byte[] array = FileUtility.getFileFromInternalResources("user.json");
		String string = new String(array);
		System.out.println(string);
		System.out.println("Souzione 2: Prendere i dati Json, trasformarli in Oggetti Java e poi stamparli in XML");
		StringUtility.fromJson();
		System.out.println("Soluzione 3: Convertire Oggetti Java in Json e XML");	//per far sì che JSON non rilevi eta inserire transient nella classe Utente
		StringUtility.toJson();
		StringUtility.toXML();
	}

}
