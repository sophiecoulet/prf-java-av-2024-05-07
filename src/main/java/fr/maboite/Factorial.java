package fr.maboite;

import java.sql.Array;

public class Factorial {

	public Integer compute(int i) {
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

}
