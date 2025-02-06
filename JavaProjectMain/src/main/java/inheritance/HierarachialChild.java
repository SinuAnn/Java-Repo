package inheritance;

public class HierarachialChild extends HierachialParent {
	public void details() 
	 {
		 String age ="24yrs";
		 String contactnumber="7566653533";
		 System.out.println("age :"+age);
		 System.out.println("contactnumber:"+contactnumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarachialChild obj1=new HierarachialChild();
		obj1.name();
		obj1.details();
}}
