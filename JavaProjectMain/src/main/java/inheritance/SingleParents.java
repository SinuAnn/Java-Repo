package inheritance;

public class SingleParents {

	
	public void add()
		{
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
		}
		public class child extends SingleParents
		{
			public void sub()
			{
	int a=10;
	int b=20;
	int d=a+b;
	System.out.println(d);
		}
	}

}

