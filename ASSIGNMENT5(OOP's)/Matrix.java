class InvalidRowsElements extends Exception{
    public InvalidRowsElements(String s){
        super(s);
    }
}
class Matrix {
    private int[][] arr;
    public Matrix() {   // default
        arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0; 
            }
        }
    }
    public Matrix(int row, int element)throws InvalidRowsElements{  //parameterized
        arr=new int[row][element]; 
        if(row>0 && element >=0){ 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;  
            }
        }
        }else{
            throw new InvalidRowsElements("Row and column can't be negative or zero !!");
        }
    }
    public Matrix(Matrix m){   //copy
        arr=new int[m.arr.length][m.arr[0].length];
        for (int i = 0; i < m.arr.length; i++) {
            for (int j = 0; j < m.arr[i].length; j++) {
               arr[i][j]=m.arr[i][j];
            }
        }
    }
    public Matrix add(Matrix m)throws InvalidRowsElements{
        Matrix result=new Matrix(arr.length,arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.arr[i][j]=arr[i][j]+m.arr[i][j];
            }
        }
        return result;
    
    }
    public Matrix less(Matrix m)throws InvalidRowsElements{
        Matrix result=new Matrix(arr.length,arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.arr[i][j]=arr[i][j]-m.arr[i][j];
            }
        }
        return result;
    }
    public Matrix multiply(Matrix m)throws InvalidRowsElements{
        Matrix result=new Matrix(arr.length,arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m.arr[i].length; j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    result.arr[i][j]+=arr[i][k]*m.arr[k][j];
                }
            }
        }
        return result;
    
    }
    public Matrix Transpose()throws InvalidRowsElements{
        Matrix result= new Matrix(arr[0].length,arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.arr[j][i]=arr[i][j];
            }
        }
        return result;
    }
    public void set(int row, int element) {
        int new_arr[][]=new int[row][element];
        arr =new_arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;  
            }
        }
    }
    public void show() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



