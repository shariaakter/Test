package subtructiobDef;

public class FindMaxTwoNumber {

	public static void main(String[] args) {
		int[] x = {10,32,17,47,5,72,7};
		int max1 = 0;
		int max2 = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i]> max1) {
				max2= max1;
				max1 = x[i];
			}
			else if (x[i]>max2) {
				max2 = x[i];
			}
		}
		System.out.println("maximum number: " + max1);
		System.out.println("maximum number: " + max2);

	}

}
