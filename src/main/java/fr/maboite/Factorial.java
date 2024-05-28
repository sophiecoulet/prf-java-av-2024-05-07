package fr.maboite;

public class Factorial {

	public Integer compute(int i) {
		// TODO Auto-generated method stub
		if(i <=1) {
			return 1;
		}
	
		int fact =1;
		for (int j = 1; j <=i ; j++) {
			fact = fact*j;
              }
       
		return fact;
	}

}
