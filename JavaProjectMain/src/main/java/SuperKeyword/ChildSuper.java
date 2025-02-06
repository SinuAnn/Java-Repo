package SuperKeyword;


public class ChildSuper extends ParentSuper
{
	public void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("Difference is "+z);
		super.add();
		
	}
		public static void main(String[] args) 
		{
			ChildSuper obj=new ChildSuper();
			obj.sub(50,10);
			
		}}
