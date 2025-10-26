class parent 
{ 
    private String nm, fnm,addre; 
    public void getdata(String nm,String fnm,String addre) 
    { 
        this.nm=nm; this.fnm=fnm; this.addre=addre; 
    } 
    public void putdata() 
    { System.out.println("Name: "+ nm);
     System.out.println("FName: "+fnm); 
     System.out.println("Address: "+addre);
     } 
    } 
    class child extends parent 
    { 
        double m1,m2,m3;
         public void getdata(String nm,String fnm,String addr,double m1,double m2,double m3) 
         {
             super.getdata(nm,fnm,addr); 
             this.m1=m1; 
             this.m2=m2;
              this.m3=m3; 
            } 
            public void putdata() 
            {
                super.putdata();
                 System.out.println("Marks1 : " +m1);
                  System.out.println("Marks2 : " +m2); 
                  System.out.println("Marks3 : " +m3); 
                  System.out.println("Total Marks : " +(m1+m2+m3));
                   System.out.println("Percentage : " +((m1+m2+m3)/3)); 
                } 
            }
             public class inherit_exm 
             {
                 public static void main(String[] a) 
                 { 
                    parent p1=new parent(); 
                    p1.getdata("XXX","YYY","Jaipur"); 
                    child c1=new child(); 
                    c1.getdata("Childname","Child fname","Child addr",78,67,78);
                     p1.putdata(); 
                     c1.putdata(); 
                    } 
                }