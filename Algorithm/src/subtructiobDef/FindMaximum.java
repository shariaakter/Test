package subtructiobDef;

public class FindMaximum {

	public static void main(String[] args) {
		int[] x= {3,615,100,-50,500,4,2};
		int mini = Integer.MIN_VALUE;
		for(int i=0;i<x.length;i++) {
			//just switch condition from >= to <=. 
			if(mini<=x[i]) mini = x[i];
		}
		System.out.println("maximum number:	" + mini);

	}

}
