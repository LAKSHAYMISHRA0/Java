interface i1
{
	int j=10; //final,static & public
	public void disp();
	public void get();
}

interface i2
{
	public void disp2();
	public void get2();
}

interface i3 extends i1,i2
{
	double PI=3.14;
}
abstract class xxx implements i3
{
	public void disp()
	{
	}
	public void get()	
	{
	}
}
class xxx_child extends xxx
{
	public void disp2()
	{
	}
	public void get2()	
	{
	}
}


// extends c1,c2 no multiple inheritance in classes
//extends i1,i2 multiple inher is there in case of interfaces

class inter_ex
{
	public static void main(String[] a)
	{
		xxx x1=new xxx_child();
	}
}