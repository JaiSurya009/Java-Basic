import java.util.Scanner;
public class print_for_each{
    public static void main(String []args){
        int b[] = new int[] {10,15,25,33,45,51};
        System.out.print("The given array is: -");
        System.out.println("");
        for(int i:b){
            System.out.print(i+" ");
        }
        int count = 0;
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        for(int i=0; i < b.length;i++){
            if (a==b[i]){
                System.out.println("The Element is found in index : "+ i);
                count = 1;
            }
        }
        if (count==0){
            System.out.println("The Element is not found" );
        }
    }
}