class Shape  
  {
	double a,p;
    	 void disp()
	{
		System.out.println("Area: "+ a);
		System.out.println("Perimeter: "+ p);
	}
  }
  class Rectangle extends Shape 
   {                            
     double length, width;
     Rectangle(double length , double width)
      { 
        this.length = length;
        this.width = width;
      }
   void area()
    {
      a= length*width;
    }
     void perimeter()
     {
      p= 2*(length +width);
      }
    }
  class Square extends Shape 
     {
       double s;

        Square(double side)
       {
          s=side;
       }
      void area()
       {
	a= s*s;
       }
      void perimeter()
      {
	 p= 4*s;
      }
     }
 
  class Circle extends Shape
   {
     double radius;
     Circle(double radius)
     {
       this.radius = radius;
     }
    void area()
    {
     a=Math.PI*radius*radius;
	
    }
/*public void disp()
{
		System.out.println("In child Area: "+ a);
		System.out.println("Perimeter: "+ p);
		super.disp();

}*/
   void perimeter()
  {
    p=2*Math.PI*radius;
  }
}

	
public class inherit4
	{
		public static void main(String[] a)
		{
			Circle c=new Circle(23);
			/*Rectangle r=new Rectangle(12.5,15.5);
			Square s=new Square(23);*/
			c.area();
			//r.area();
			//s.area();
			c.perimeter();
			//r.perimeter();
			//s.perimeter();
			c.disp();
			//r.disp();
			//s.disp();
		}
	}
  