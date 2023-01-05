import java.util.*;
public class fib{
    public static void main(String[] args){
        System.out.println("Enter the no.of terms: ");
        Scanner y = new Scanner(System.in);
        Integer x = y.nextInt();
        int A=0; int B =1;int temp = 0;
        if(x==1){
            System.out.print(""+ A);
        }
        else if(x>1){
            System.out.print(A+" "+B+" ");
            for(int i=0;i<x-2;i++){
                temp = A+B;
                System.out.print(""+temp+" ");
                A = B;
                B = temp;
            }
        }
        else{
            System.out.print("Provide Number greater than 0");
        }
    }
}