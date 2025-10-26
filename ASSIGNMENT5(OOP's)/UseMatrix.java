public class UseMatrix {
    public static void main(String[] args) {
        Matrix m1=new Matrix();
        m1.set(3, 2);
        System.out.println("The default matrix is");
        m1.show();
        Matrix m2=null;
        try {
            m2=new Matrix(-2,0);
        } 
        catch (InvalidRowsElements e) {
            System.out.println(e.getMessage());
        }
        if(m2 != null){
        System.out.println("The Second matrix is");
        m2.show();
        Matrix m3=new Matrix(m2);
        System.out.println("The Third Matrix is ");
        m3.show();
        Matrix m4,m5,m6,m7;
        m4=m2.add(m3);
        System.out.println("The Matrix After The Addition ");
        m4.show();
        m5=m4.less(m3);
        System.out.println("The Matrix After Subtraction ");
        m5.show();
        m6=m4.multiply(m5);
        System.out.println("The Matrix after Multiplication ");
        m6.show();
        m7=m2.Transpose();
        System.out.println("The Matrix After Transpose ");
        m7.show();
        }
    }

}
