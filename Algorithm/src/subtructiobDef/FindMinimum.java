package subtructiobDef;

public class FindMinimum {

	public static void main(String[] args) {
		int[] x= {3,6,100,-50,5,4,2};
		int mini = 10000;
		for(int i=0;i<x.length;i++) {
			if(mini>=x[i]) mini = x[i];
		}
		System.out.println("minimum number:	" + mini);

	}

}
