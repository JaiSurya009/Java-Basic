public class f{
public static void main(String[] args){
	int a[][] = new int[][] {{1,2,3,0},{4,5,6,0},{7,8,9,0},{10,11,12,13}};
	System.out.print("No.of Rows "+ a[0].length);
	System.out.println("\nNo.of Column "+ a.length);
	if(a.length == a[0].length){
	System.out.println("It is square matrix");
	System.out.println("We now print the diagnol elements: ");
	for(int i =0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++){
			if(i==j){
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
}
}