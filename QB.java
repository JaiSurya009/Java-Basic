import java.util.Scanner;
public class QB{
public static void main(String[] args){
	System.out.print("Enter no.of elements in Array: ");
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int a[] = new int[x];
	System.out.println("Enter elements of Array");
	for(int i=0; i<x;i++){
		Scanner y = new Scanner(System.in);
		a[i] = y.nextInt();
	}
	for(int j=0;j<a.length;j++){
		System.out.print(a[j]+" ");
	}
}
}