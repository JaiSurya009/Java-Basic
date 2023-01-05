import util.java.*;
public class e{
public static void main(String[] args){
 int a [][] = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
 int row = a.length; int column =a[0].length;
 System.out.println("We now print the first element from first row & column: " + a[0][0]);
 System.out.println("We now print the first element from last column: " + a[column-1][0]);
 System.out.println("We now print the last element from first row: " + a[0][row-1]);
 System.out.println("We now print the last element from last column: " + a[column-1][row-1]);
}
}