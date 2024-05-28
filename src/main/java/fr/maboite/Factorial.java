package fr.maboite;

public class Factorial {
     
	public Integer compute(int i) {
		
		int[] array = new int[i];
		int facto = 1;
	
		// TODO Auto-generated method stub
		for(int j =1; j< array.length; j++) {
			
			array[j] = j+1;
			
			
			
		}
		
		for(int k =1; k<array.length; k++)
		facto *= array[k];
		return facto;

}};

