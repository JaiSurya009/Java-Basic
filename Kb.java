import java.util.Scanner;

public class Kb
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a sentence:");
       String str = in.nextLine();
       str = str + " ";
       String word = "";
       int len = str.length();
       
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
	   System.out.print(ch);
	   if (ch == ' ') {
	       System.out.print("\n");
		}
	}
  }
}