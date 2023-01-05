class Test 
{
static int max = 10; // static variable
int min = 5; // non-static variable
}
public class Main 
{
public static void main(String[] args) 
{
Test obj = new Test();

// access the non-static variable
System.out.println("min + 1 = " + (obj.min + 1));

// access the static variable
System.out.println("max + 1 = " + (Test.max + 1));
}
}
