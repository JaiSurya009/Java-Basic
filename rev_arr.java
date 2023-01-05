public class rev_arr{
  public static void main(String args[]){
	int a[] = new int[] {15,20,25,30,35};
	int b[] = new int[5];
	System.out.println("Original Array");
	for(int i=0;i<=a.length-1;i++){
	 System.out.print(a[i]+" ");
	}
	System.out.println("\nReversed Array");
	for(int i=a.length-1;i>=0;i--)
	{
	 System.out.print(a[i]+" ");
	}
  }
}
	  
	  