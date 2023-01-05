public class single{
public static void main(String args[]){
	B j = new B();
	j.K();j.L();
}
}
class A{
int a = 30; int b = 33;
A(){
	System.out.println("hello peter "+b);
}
void K(){
	System.out.println("Hi "+a);
}
}
class B extends A{
int a = 45;
B(){
	System.out.println("WHY "+a);
}
void L(){
	System.out.println("What "+b);
}
}