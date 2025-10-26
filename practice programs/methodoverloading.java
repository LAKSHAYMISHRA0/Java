public class methodoverloading
{
static int sum(int a,int b)
{
return a+b;
}
static int sum(int a,int b,int c)
{
return a+b+c;
}

public static void main(String[] args){
int a=2,b=3,c=2,total;
total=sum(a,b);
System.out.println(total);

total=sum(a, b, c);
System.out.println(total);
}
}

