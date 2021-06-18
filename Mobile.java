package week1.day1assignment;

public class Mobile {
	

		
String mobileModel = "Realme";
int mobileWeight = 599;
byte mobileInch = 3;
boolean isFullyCharged = true;



public static void main(String[] args) {
	
	Mobile obj = new Mobile();
	obj.isFullyCharged();
	obj.mobileInch();
	obj.mobileModel();

	
		
}



public void mobileModel() {
	
	System.out.println("mobileModel:"+  " " +mobileModel );
}



public void mobileInch() {
	
	System.out.println("mobileInch:"+ " " +mobileInch );
}



public void isFullyCharged() {

System.out.println("isFullyCharged:"+ " " +  isFullyCharged);
}	

}
