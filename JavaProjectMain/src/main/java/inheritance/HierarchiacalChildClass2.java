package inheritance;

public class HierarchiacalChildClass2 extends HierachialParent
{
	
		public void add()
		{
		int a =10;
		int b=12;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchiacalChildClass2 obj=new HierarchiacalChildClass2();
		
		obj.name();
		obj.add();
		
		
	}
	
	}


