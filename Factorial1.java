import java.util.*;
public class Factorial1
{
public int fact(int n)
{
int total=1;
if(n>=1)
total=n*fact(n-1);
return total;
}
public static void main(String[] args)
{
int num;
System.out.println("Enter the number:");
Scanner s= new Scanner(System.in);
num= s.nextInt();
Factorial1 f= new Factorial1();
System.out.println("Factorial is"+f.fact(num));
}
}
















