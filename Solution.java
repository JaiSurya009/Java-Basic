import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] b = a.toCharArray();
        int k = a.length();
        char[] x = new char[k];
        int j =0;
        for(int i=k-1;i>=0;i--){
            x[j]=b[i];
            j+=1;
        }
        String y = String.valueOf(x);
        if(a==y){
            System.out.print("Yes");
        }
        else if (y!=a){
            System.out.print("No");
        }
    }
}