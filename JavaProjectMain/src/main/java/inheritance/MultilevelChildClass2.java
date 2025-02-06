package inheritance;

public class MultilevelChildClass2 extends MultilevelChildClass

{
		public void details() 
		 {
			 String age ="24yrs";
			 String contactnumber="7566653533";
			 System.out.println("age :"+age);
			 System.out.println("contactnumber:"+contactnumber);
		 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultilevelChildClass2 obj=new MultilevelChildClass2();
			
			obj.add();
			obj.sub();
			obj.details();
		}}
