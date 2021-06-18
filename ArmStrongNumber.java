package week1.ArmStrongNum;

public class ArmStrongNumber {
	
public static void main(String[] args) {
		
		int num=0;
	    int value=153;
	    int name=num;

	       while (value > 0) {
			num=num/10;
			int rem=num%10;
			value=value +(rem*rem*rem);
			
		}
		if(value==name) {
			
			System.out.println(num +" it is a armstrong number");
		}
		else {
			System.out.println(num +" it is not a armstrong number");
		}
	}
}
