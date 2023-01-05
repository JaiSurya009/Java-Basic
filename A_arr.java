public class A_arr{
 static void m(int b[]){
   int x = b.length;
   for(int i: b)
   {
      if (i==b[x-1]){
         System.out.print(i+".");
      }
      else{
         System.out.print(i+","+" ");
      }
      
   }
 }
public static void main(String[] args){
   m(new int[] {90,91,98,99});
}
}