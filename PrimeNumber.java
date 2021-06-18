package week1.primeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		int value=0;
		
		for (int i = 1; i <=num; i++) {
			if (num % i ==0) {
				value++;
				
				
			}
			}
			
			if(value==2)
					 {
				System.out.println( num +  "it is a prime number");
			} else {
                  System.out.println( num +  "not a prime number");
			}
		}
		
		
	

}
