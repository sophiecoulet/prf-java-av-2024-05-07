package fr.maboite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.maboite.logger.LoggerExample;

public class Factorial {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerExample.class);

	public Integer compute(int i) {
		LOGGER.info("INFO : Demarrage de compute");
		LOGGER.debug("DEBUG : Demarrage de compute");
		LOGGER.error("ERROR : Demarrage de compute");
		int result = 1;
		if(i <= 0){
			result = 1;
		}else{
			for(int index=1; index<=i; index++){
				result = result * index;
			}
		}
		return result;
	}

	public Integer somme(String chaine) {
		String[] tab = chaine.split(",");
		int somme = 0;
		for(int i=0; i<tab.length; i++){
			somme = somme + Integer.valueOf(tab[i]);
		}
		return somme;
	}

public static void main(String[] args) {
	Factorial factorial = new Factorial();
	factorial.compute(2);
}

}
