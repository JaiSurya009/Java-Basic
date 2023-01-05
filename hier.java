interface DAD{  
//class DAD{                                                                                                                                              
default void D(){
	System.out.println("Hello Peter");
}                                                                                                                     
}                                                                                                                                                       
interface MOM{
//class MOM {                                                                                                                                      
default void M(){
	System.out.println("In a Min");}                                                                                                                    
}                                                                                                                                                       
/*
interface Son implements DAD,MOM{
//class Son extends DAD,MOM{                                                                                                                                      
default void S(){
	System.out.println("Perfectly Balanced");}                                                                                                                     
} 
*/ 
class hier implements DAD,MOM{                                                                                                                                                     
// class hier{                                                                                                                                            
public static void main(String args[]){   
System.out.println("Point Break");                                                                                                              
Son d=new Son();
public void H(){
	DAD.super.d();
	MOM.super.d();
/* 
d.M();d.S();d.D();    
*/     
}
d.H();                                                                                                                                  
}                                                                                                                                                       
}                                                         
//interface , implements in java , constructor in interface                                                                                               