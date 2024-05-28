package fr.maboite;


public class Factorial {
	public Integer compute(int i) {
		if (i <= 1) {
			return 1;
		}
		for (int k = i-1; k > 0; k--) {
			i *= k;

		}
		System.out.println(i);
		return i;
	}

	
}