public class Student
{
public static void main(String[] args)
{
   int roll;
   String name;
   float fee;
   Student(int roll,String name,float fee)
   {
   roll=roll;
   name=name;
   fee=fee;
   }
   void display()
   {
   System.out.println(roll+""+name+""+fee);
   }
}

public class Test
{
 public static void main(String args[])
 {
  Student x = new Student(101,"chewy",350f);
  Student y = new Student(102,"toes",450f);
  x.display();
  y.display();
  }
}