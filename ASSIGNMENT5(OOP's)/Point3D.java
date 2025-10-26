package finance;
public class Point3D {
    private int x,y,z;

    public Point3D(int a,int b,int c){
        x=a;
        y=b;
        z=c;
    }
    public Point3D(int a,int b){
        this(a, b, 0);
    }
    public Point3D(int a){
        this(0, 0, 0);
    }
    public Point3D(Point3D p){
        this(p.x, p.y, p.z);
    }
    public void show(){
        System.out.print("X="+x+" Y="+y+" Z="+z);
        System.out.println();
    }
}
