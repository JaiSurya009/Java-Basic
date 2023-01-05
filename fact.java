import java.util.Scanner;
public class fact{
    public static void main(String[] args){
        System.out.print("Enter number for its factorial: ");
        //Scanner x  = new Scanner(System.in);
        //Integer a = x.nextInt();
        int a = 9;
        int count = 1;
        for(int i=1;i<=a;i++){
            count = count*i;
        }
        System.out.print("Factorial of " +a+ " is: "+ count);
    }
}