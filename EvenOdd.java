import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (size): ");
        int size = sc.nextInt();

        if (size % 2 == 0) {
            System.out.println("The number " + size + " is Even.");
        } 
        else 
        {
            System.out.println("The number " + size + " is Odd.");
        }

    }
}
