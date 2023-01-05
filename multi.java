class multi{                                                                                                                                            
public static void main(String args[]){                                                                                                                 
B d=new B();                                                                                                                                            
d.w();d.k();d.t();                                                                                                                                                  
}                                                                                                                                                       
}
class A{  
	int a = 30; int b = 25;
A(){
	System.out.println("what");
}
void t() {
	System.out.println("hi "+a+" k "+b);
	}                                                                                                                     
}                                                                                                                                                       
class D extends A{
	//int a = 45;
	int b = 50;
D(){
	System.out.println("why");
}
void k(){
	System.out.println("hey "+a+" oh "+b);
	}                                                                                                                    
}                                                                                                                                                       
class B extends D{  
	int a = 20;
B(){
	System.out.println("when");
}
void w(){
	System.out.println("kk "+a+" okay "+b);
	}                                                                                                                     
}                                                                                                                                                       