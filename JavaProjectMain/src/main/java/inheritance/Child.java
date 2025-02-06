package inheritance;

public class Child extends SingleParents
{
	
	public void sub()
		{
int a=10;
int b=20;
int d=a+b;
System.out.println(d);
	}
public static void main(String[] args)
{
	Child obj=new Child();
	obj.add();
	obj.sub();
}
}

