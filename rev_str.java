import java.util.Scanner;
public class rev_str{
    public static void main(String[] args){
        System.out.print("Enter string to be reversed: ");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.print(b.reverse()+" ");
        /*
        char[] c = b.toCharArray();
        char[] d = new d[c.length];
        for(int i=c.length-1;i>=0;i--){
            d.add(c[i]);
        }
        System.out.print(d[]+"");
        */
    }
}