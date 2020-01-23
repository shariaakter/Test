package subtructiobDef;
//given a specific number, verify it is prime or not
public class isPrimeNumber {
	

	public static void main(String[] args) {
		int x=7;
		boolean isPrime = true;
		for(int i=2;i<x;i++) {
			if((x%i)==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime==true) System.out.println(" prime ");
		if(isPrime==false) System.out.println(" not prime ");
	}

}
