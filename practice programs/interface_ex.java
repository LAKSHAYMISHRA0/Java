interface shape_i
{
	double pi=3.14; //final static public
	 void peri();
	public void area();

}

class shape
{
	double a,p;
	public void disp()
	{
		System.out.println("Area is: " + a);
		System.out.println("Perimeter is: " + p);
	}
}

class circle extends shape implements shape_i
{
	double radius;
	public circle(double r)
	{
		//pi=2.34;
		radius=r;
	}
	public void peri()
	{
		p=2*pi*radius;
	}
	public void area()
	{
		a=pi*radius*radius;
	}

} 
/*class child extends circle
{
	child()
	{
		super(25);
	}
	public void peri()
	{
		p=2*pi*radius;
	}
}*/
public class interface_ex
{
	public static void main(String[] a)
	{
		circle c=new circle(25);
		c.peri();
		c.area();
		c.disp();
		shape_i i1=new circle(12);
		System.out.println("PI: "+shape_i.pi);
	}
}