package fr.maboite;

public class Factorial {

	public Integer compute(int i) {
		int res=1;
		if(i < 0) {
			return 0;
		}else if(i == 0 || i == 1) {
			return 1;
		}else {
			for (int j = i; j > 1; j--) {
				res*=j;
				System.out.println(res);
			}
		}
		
		return res;
	}

}
