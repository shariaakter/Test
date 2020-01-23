package subtructiobDef;

public class arrayPrime {

	public static void main(String[] args) {
		int[] p = {3,9,5,7,19,10,6,15};
		for(int j=0; j<=p.length-1; j++) {
			boolean isPrime = true;
			System.out.println("");
			for(int i=2;i<=j/2;i++) {
				if(p[j]%2 == 0) {
					isPrime = false;
					//System.out.println(p[j]);
					break;
				}
			}
			if(isPrime == true) System.out.println(p[j] + "is prime");
			else System.out.println(p[j] + "not prime");
		}

	}

}
