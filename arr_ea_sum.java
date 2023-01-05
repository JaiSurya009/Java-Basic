public class arr_ea_sum{
public static void main(String[] args){
  int a[][] = new int [][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  int r = 0;int c=0; 
  for(int i=0;i<a.length;i++){
   r = 0;
   for(int j=0;j<a[0].length;j++){
     r = r+a[i][j];
    }
   System.out.println(i+"th Row elements sum: "+ r);
  }
  for(int k=0;k<a[0].length;k++){
   c = 0;
   for(int l=0;l<a.length;l++){
     c = c+a[l][k];
    }
   System.out.println(k+ "th Column elements sum: "+ c);
  }
}
}