class sample_switch
{
public static void main(String args[])
{
    int i = 0; 
    for(i=0;i<6;i++)
{
     switch(i)
{
          case 0:
               System.out.println("iiszero.");
               break;
          case 1:
               System.out.println("iisone.");
               break;
          case 2:
               System.out.println("iistwo.");
               break;
          case 3:
               System.out.println("iisthree.");
               break;
          default:
               System.out.println("iisgreaterthan3.");
}
}
}
}
