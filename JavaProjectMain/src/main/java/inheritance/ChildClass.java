package inheritance;

public class ChildClass extends ParentSingleClassEx
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
		ChildClass obj=new ChildClass();
		obj.name();
		obj.details();
	}

}
