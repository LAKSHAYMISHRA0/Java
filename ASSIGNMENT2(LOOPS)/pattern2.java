public class pattern2 {
    public static void main(String[] args) {
        int no;
        no = (int)(Math.random() * 10);
        System.out.println("GENERATED NUMBER IS --> " + no);
        
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
