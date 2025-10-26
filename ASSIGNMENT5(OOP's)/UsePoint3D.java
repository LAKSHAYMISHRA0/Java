import finance.Point3D;
public class UsePoint3D {
    public static void main(String[] args) {
        Point3D p1=new Point3D(2,3,4);
        System.out.println("First Point is ");
        p1.show();
        Point3D p2=new Point3D(5, 6);
        System.out.println("Second Point is ");
        p2.show();
        Point3D p3=new Point3D(2);
        System.out.println("Third Point is ");
        p3.show();
        Point3D p4=new Point3D(p1);
        System.out.println("Forth Point is ");
        p4.show();

    }
}
