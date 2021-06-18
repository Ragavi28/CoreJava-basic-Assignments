package week1.FindIntersection;

public class FindIntersection {

	public static void main(String[] args) {
	int[] array1= {23,76,98,89,67};
	int[] array2= {23,65,99,90,65};
	System.out.println("intersection of two arrays:");
	
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array2.length; j++) {
			if (array1[i]==array2[j]) {
				System.out.println(array2[j]);
				
			}
			
		}
		
	}
	}

}
