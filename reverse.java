public class reverse
{
public static void main(String[] args)
{
int a=0,b=23432,i=1;
System.out.println(b+"is the given number");
int c=b;
while(b!=0)
{
i = b%10;
a = a*10 + i;
b = b/10;
}
System.out.println(a+"is the reversed number");
if(a==c)
{ 
System.out.println("Number is a pallindrome");
}
else
{
System.out.println("Number is not pallindrome");
}
}
}