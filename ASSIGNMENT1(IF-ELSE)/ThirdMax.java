public class ThirdMax {
public static void main(String[] args) {
int a,b,c,d,max,smax,tmax;
a=(int)(Math.random()*100);
b=(int)(Math.random()*100);
c=(int)(Math.random()*100);
d=(int)(Math.random()*100);
System.out.println("a= " +a+ " b="+b+" c="+c+" d="+d);
max=a;
if (a>b && a>c && a>d){
    max=a;
    if (b>c){
        smax=b;
        tmax=c;
    }else{
        smax=c;
        tmax=b;
    }   
}
else if (b>a && b>c && b>d) {
    max=b;
    if (a>c) {
        smax=a;
        tmax=c;
    }else{
        smax=c;
        tmax=a;
    }
}else if(c>a && c>b && c>d)
{
   max=c;
   if (a>b) {
    smax=a;
    tmax=b;
   }else{
    smax=b;
    tmax=a;
   }
}else{
    max=d;
    if (a>b) {
        smax=a;
        tmax=b;
    }else{
        smax=b;
        tmax=a;
    }
}

if (d>max) {
    tmax=smax;
    smax=max;
    
    max=d;
}
else if(d>smax){
    tmax=smax;
    smax=d;
}
else if(d>tmax) {
    tmax=d;
}
System.out.println("THIRD MAXIMUM-->"+tmax);
}
}
