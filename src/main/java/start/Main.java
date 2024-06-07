package start;

import utility.FileUtility;

public class Main {

	public static void main(String[] args) { 
		byte[] array = FileUtility.getFileFromInternalResources("user.json");
		String string = new String(array);
		System.out.println(string);
	}

}
