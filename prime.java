public class prime
{
public static void main(String[] args)
{
int i,a=0,b=0;
int c=23;
a = c/2;
if(c==0||c==1)
{
System.out.println(c+ "is not a Prime number");
}
else
{
for(i=2;i<c;i++)
{
if(c%i==0)
{
System.out.println(c+"is not a Prime number");
b=1;
break;
}
}
if(b==0) { System.out.println(c+"is a prime number");}
}
}
}