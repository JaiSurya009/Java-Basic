public class Ax{
public static void main(String[] args){
int a[] = {1,2,3,4,4,5};
int s = 0;
for(int i=0;i<a.length;i++){
if(s<a[i]){ 
    s=a[i];
}
}
System.out.println("Max is "+s);
}
}