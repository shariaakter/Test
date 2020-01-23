package subtructiobDef;

import java.util.Arrays;

public class WordReverse {

	public static void main(String[] args) {
		String sentence = "CareerHack Offer Information Technology Training";
		String[] MyArray = sentence.split("\\s");
		//System.out.println("original: " + Arrays.toString(MyArray));
		
		for(int i=0; i<MyArray.length; i++) {
			String reverse = "";
			for(int j=MyArray[i].length()-1;j>=0;j--) {
				reverse = reverse + MyArray[i].charAt(j);
			}
			System.out.print(reverse +" \t" );
		}

	}

}
