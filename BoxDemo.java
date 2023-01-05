class Box 
{
int width;
int height;
int depth;
}

class BoxDemo
{
public static void main(String args[]) 
{
Box mb = new Box();
int vol;
mb.width = 10;
mb.height = 20;
mb.depth = 15;

vol = mb.width * mb.height * mb.depth;
System.out.println("Volume is " + vol);
}
}