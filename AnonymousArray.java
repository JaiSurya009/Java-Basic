public class AnonymousArray{
    static void printArray(int b[])
    {  
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);  
    }
    
public static void main(String args[])
{  
printArray(new int[ ]{10,22,44,66});
}
}  