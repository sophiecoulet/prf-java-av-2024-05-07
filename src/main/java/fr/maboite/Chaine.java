package fr.maboite;

public class Chaine {
	
	static boolean isNumber(String input) {
		return input.matches(".*\\d.*");
	}
	
	
	
	public int calcResultNumberInChaine(String strung) {
		for(int i =0; i<strung.length(); i++) {
			isNumber(strung(i));
		}
	}
	
	

}




