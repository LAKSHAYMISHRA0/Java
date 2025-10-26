class parent
{
	public int m=10;
	int bill;
	public parent()
	{
		//m=10;
	}
	void calc(int j)
	{
		System.out.println("In Parent");
		bill=m*j;
		System.out.println("Bill Amount : " +bill); 
	}
}

class child extends parent
{
	int m=100;//variable shadowing
	int bill;
	public child()
	{
		//m=100;
	}
	 void calc(int j)
	{
		System.out.println("In Child");
		bill=m*j;
		System.out.println("Bill Amount : " +bill);
	}
}
public class inherit2
{
	public static void main(String[] a)
	{
		child c=new child();
		parent p=new parent();
		//child d=new parent();
		parent m1=new child();
		System.out.println("Child's m :"+ c.m); 
		System.out.println("Parent's m :"+ m1.m);
		System.out.println("Parent with child ref m :"+ m1.m);
		c.calc(20); //200
		p.calc(20); //20
		m1.calc(20); //2000 or 200

	}
}

