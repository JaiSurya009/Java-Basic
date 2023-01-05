import java.util.Scanner;
public class Q_max{
public static void main(String[] args){
	System.out.print("Enter 1st number: ");
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	System.out.print("Enter 2nd number: ");	
	int y = s.nextInt();
	if(x>y) 
		System.out.print(" 1st Number is Big");
	else if(y>x)
		System.out.print(" 2nd Number is Big");
	else
		System.out.print(" Both are equal");
}
}