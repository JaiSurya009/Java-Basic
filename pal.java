import java.util.Scanner;
public class pal{
    public static void main(String[] args){
        System.out.print("Enter number to be reversed: ");
        Scanner a = new Scanner(System.in);
        Integer b = a.nextInt();
        int temp=0; int x = b;int s=0;
        while(b!=0){
            temp = b%10;
            s = s*10 +temp;
            b = b/10;
        }
        System.out.print("\n The Number Reversed is: "+s);
        if(s == x){
            System.out.print("\n Number is Pallindrome");
        }
        else{
            System.out.print("\n Number is not Pallindrome");
        }
    }
}