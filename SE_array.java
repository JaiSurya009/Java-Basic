public class SE_array {  
    public static void main(String[] args) {  
        int [] arr = {25, 11, 7, 75,900, 56};  
        int min = arr[0];int max = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] <min)  
               min = arr[i];
	   if(arr[i]>max)
	       max = arr[i];
        }  
        System.out.println("Smallest element present in given array: " + min); 
	System.out.println("Largest element present in given array: " + max);
    }  
}  