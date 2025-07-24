import java.util.Scanner;

public class Fibo 
{
public static void main(String args[]) 
{
int a = 0, b = 1, n, c;
Scanner s = new Scanner(System.in);

System.out.println("Enter the number of terms in Fibonacci series:");
n = s.nextInt();

if (n <= 0) 
{
System.out.println("Enter a positive number.");
} 
else if (n == 1) 
{
System.out.println(a);

} 
else 
{
System.out.println(a);
System.out.println(b);
for (int i = 2; i < n; i++) 
{
c = a + b;
System.out.println(c);
a = b;
b = c;
}
}
}
}
