import java.util.*;
public class Swap
{
public static void main(String[] args)
{
int a,b,temp;
Scanner s= new Scanner(System.in);
System.out.println("Enter the First no:");
a= s.nextInt();
System.out.println("Enter the Second no:");
b= s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("After swapping");
System.out.println("First no:"+a);
System.out.println("Second no:"+b);

}
}


