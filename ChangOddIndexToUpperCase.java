package week1.changeOddIndex;

public class ChangOddIndexToUpperCase {

	public static void main(String[] args) {
	    
		String number="cute doll";
		
		StringBuffer newnumber=new StringBuffer(number);
		
		for (int i = 0; i < number.length(); i++) {
			
			if (Character.isLowerCase(number.charAt(i))) {
				
				newnumber.setCharAt(i,Character.toUpperCase(number.charAt(i)));
				
			}
			else if(Character.isUpperCase(number.charAt(i))) {
				newnumber.setCharAt(i,Character.toLowerCase(number.charAt(i)) );
			}
			
		}
		System.out.println("string after convention:"+ newnumber);
	}

}
