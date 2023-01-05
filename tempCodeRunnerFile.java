public class A{
	A(){
	int a = 10;int b = 11;int c = 12;
	System.out.println("A is "+a+ " B is "+b+ " C is "+c);
	}
}
public class B extends A{
	B(){
	int a = 13; int b = 12; int c = 15;
	System.out.println("New Values");
	System.out.println("A is "+a+ " B is "+b+ " C is "+c);
	}
}
public class S_L_inhe{
	public static void main(String [] args){
		B K = new B();
    }
}