package subtructiobDef;

//find all prime number in a range 1 to 500
public class allPrimeNumber {

	public static void main(String[] args) {
		int[] arr = {6,7,8,12,11,15,19,20,47,40};
		for(int i = 0; i<=arr.length-1; i++) {
			boolean isPrime=true;
			for(int j = 2; j<(arr.length/2); j++) {
				if((i%j)==0) {
					isPrime=false;
					break;
				}	
			}
			if(isPrime==true) System.out.println(arr[i]+"prime");
			else if(isPrime==false) System.out.println(arr[i]+"not prime");
		}
		
		
	}//end main

}
//find a prime number from an array
