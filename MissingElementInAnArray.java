package week1.MissingElementAnArray;

import java.util.Arrays;

public class MissingElementInAnArray {

	

	public static void main(String[] args) {
		int[] numbers= {1,2,4,5,6};
		
	Arrays.sort(numbers);
		
		for(int i =0;i<numbers.length;i++) {
			
		int	j=i+1;
		
		if( j!=numbers[i]) {
			System.out.println(i);
			break;
		}

	}

}
}