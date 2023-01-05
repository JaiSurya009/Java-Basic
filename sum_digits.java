public class sum_digits
{
public static void main(String[] args)
{
int a=0,b=23456789,s=0;
while(b!=0)
{
a = b%10;
s = s+a;
b = b/10;
}
System.out.println(s+"Sum of digits");
}
}