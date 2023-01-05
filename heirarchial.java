public class heirarchial{
public static void main(String args[]){
	B obj = new B();
	C obj2 = new C();
	obj.L(); obj2.M();
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
class C extends A{
int a = 45;
C(){
	System.out.println("Y "+a);
}
void M(){
	System.out.println("Wt "+b);
}
}