public class k{
    public static void main(String args[])
    {
        int arr[]= new int []{2,3,4,5,6};
        int even = 0 ; 
 
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            
        }
 
        System.out.println("Sum of even index positions : " + even);
       
    }
}