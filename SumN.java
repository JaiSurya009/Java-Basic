import java.util.Scanner;
public class SumN  
{  
public static void main(String[] args)   
{  
int i, sum = 0,sq=0,cu=0; 
Scanner s = new Scanner(System.in);
Integer n = s.nextInt(); 
for(i = 1; i <= n; i++)  
{   
sum = sum + i;
sq = sq + i*i;
cu = cu +i*i*i;  
}
System.out.println("Sum of First "+ n+ "Natural Numbers is = " + sum); 
System.out.println("Sum of First "+ n+ "Natural Numbers is = " + sq);
System.out.println("Sum of First "+ n+ "Natural Numbers is = " + cu);
}  
}  