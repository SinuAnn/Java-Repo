package superkeyword ;

public class Child1 extends parent1
{
String name="Anu";	

	
	public void display()
	{
		System.out.println(name);
	
	System.out.println(super.name);
	}
	public static void main(String args[])
	{

	Child1 obj1=new Child1();
	obj1.display();

}}// TO REFER THE PARENTS CLASS INSTANCE VARIABLE
