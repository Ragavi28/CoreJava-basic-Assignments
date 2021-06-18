package week1.fibnocciSeries;

public class FibnocciSeries {

	public static void main(String[] args) {
		int firsNum = 0;
		int secondNum = 1;
		
		int nextNum =0;
		for(int i=0; i<= 10; i++) {
			 nextNum =firsNum+secondNum;
			 
            firsNum=secondNum;
            
            secondNum=nextNum;
            
	System.out.println( "  "+ nextNum);
	}
}
}