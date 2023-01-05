public class hybrid{
public static void main(String args[]){
	D obj = new D();
	obj.L();
	C o = new C();
	o.M();
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
int a = 5;
C(){
	System.out.println("Y "+a);
}
void M(){
	System.out.println("Wt "+b);
}
}
class D extends B{
int a = 4;
D(){
	System.out.println("H "+a);
}
void P(){
	System.out.println("t "+b);
}
}