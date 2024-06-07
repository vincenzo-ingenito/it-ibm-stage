package utility;

import java.util.ArrayList;
import javax.xml.bind.JAXB;

import com.google.gson.Gson;

import model.Utente;

public class StringUtility{
	public static String toJson(){
		Utente u = new Utente("Antonio", "Lamberti", "M");		//Creare oggetto utente
		Gson gson = new Gson();									
		String json = gson.toJson(u);							//Conversione da Oggetto a Json
		System.out.println(json + "\n");
		return "";
	}
	
	public static String fromJson() {
		ArrayList <Utente> arr = new ArrayList<Utente>();
		Utente uProprio;
		String json1 = "{\"nome\":\"Antonio\", \"cognome\":\"Lamberti\", \"sesso\":\"M\"}";		//Presi i dati da JSON
		String json2 = "{\"nome\":\"Gianluigi\", \"cognome\":\"Sperti\", \"sesso\":\"M\"}";
		String json3 = "{\"nome\":\"Marco\", \"cognome\":\"Ferrante\", \"sesso\":\"M\"}";
		Gson gson = new Gson();
		Utente u1 = gson.fromJson(json1, Utente.class);											//Trasformare i dati da JSON a Oggetti in Java
		Utente u2 = gson.fromJson(json2, Utente.class);
		Utente u3 = gson.fromJson(json3, Utente.class);
		arr.add(u1);																			//Inserire i dati da Oggetti in un Array
		arr.add(u2);
		arr.add(u3);
		for(int i = 0; i<arr.size(); i++) {
			if(arr.get(i).getNome().equals("Antonio")) {										//Individuare il nome proprio
				uProprio = arr.get(i);
				uProprio.setEta(25);															//Aggiungere l'età
				JAXB.marshal(uProprio, System.out);												//Conversione da Array a XML con stampa
			}
		}
		System.out.println();
		return "";
	}
	
	public static String toXML(){
		Utente u = new Utente("Antonio", "Lamberti", 25);										//Creazione Oggetto Java
		JAXB.marshal(u, System.out);															//Conversione Oggetto Java in XML
		return "";
	}
}
