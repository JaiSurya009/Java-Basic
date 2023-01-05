public class p{
public static void main(String args[]){
	int a[] = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	int sum = 0; int count = 0;int k =0;
	System.out.print("\n Printing All numbers");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.print(" "+a[i]);
		k = k+a[i];
	}
	System.out.print("\n ALL No's summation ");
	System.out.print(k + " ");
	System.out.print("\n Printing Even numbers");
	for(int i=0;i<=a.length-1;i++)
	{
	 if(i%2==0){
		System.out.print(" "+a[i]);
		sum =  sum + a[i];
	 }
	}
	System.out.print("\n Even No's summation ");
	System.out.print(sum + " ");
	System.out.print("\n Printing Odd numbers");
	for(int i=0;i<=a.length-1;i++){
		if(i%2!=0){
		System.out.print(" "+a[i]);
		count = count + a[i];
	 }
	}
	System.out.print("\n Odd No's summation ");
	System.out.print(count + " ");
  }
}