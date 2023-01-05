import java.io.*;
import java.util.*;

public class Sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x[] = sc.split(" ");
        String y = x[0];
        int y1 = x[1];
        if (y1<100){
            String k = String.valueOf(y1);
            k = "0"+k;
            System.out.println(y+"\t"+k);
        }
        else{
            System.out.println(y+"\t"+y1);   
        }
        
    }
}