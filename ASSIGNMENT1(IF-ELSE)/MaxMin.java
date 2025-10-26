class MaxMin{
public static void main(String[] args){
int a,b,c,d,max,min;
a=(int)(Math.random()*100);
b=(int)(Math.random()*100);
c=(int)(Math.random()*100);
d=(int)(Math.random()*100);
System.out.println("a= " +a+ " b="+b+" c="+c+" d="+d);
max=a;
min=a;
if (b>max) {
    max=b;
}else
if (b<min) {
    min=b;
}
if (c>max) {
    max=c;
}
else{
    if (c<min) {
        min=c;
    }
}
if(d>max) {
    max=d;
}else{
    if (d<min) {
        min=d;
    }
}
System.out.println("MAXIMUM-->"+max+" "+"MINIMUM-->"+min);
}
}