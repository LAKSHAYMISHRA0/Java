import java.util.Scanner;  

class input_ex 
{

  	public static void main(String[] args) 
	{
  	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
       		String name = sc.nextLine();
		System.out.println("Enter Gender ");
  	        char gender = sc.next().charAt(0);
		System.out.println("Enter Age ");
    	        int age = sc.nextInt();
		System.out.println("Enter Mobile Number ");
  		long contact = sc.nextLong();
		System.out.println("Enter Percentage ");
        	double m = sc.nextDouble();
  
  
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+contact);
        System.out.println("Marks: "+m);
    }
}

