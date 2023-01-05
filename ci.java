public class ci
{
public static void main(String args[])
{
int P=100,T=10,N=5;
double R=0.08;
int A = P*(Math.pow(1 + (R / N), N * T));
System.out.println("Compound Interest is = " + (A-P));
}
}