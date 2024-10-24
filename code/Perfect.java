// a java program to check if a given number is a Perfect number or not.
import java.util.*;
public class Perfect
{
    int n;
    Perfect (int nn)
    {
        n = nn;
    }

    int perfect (int n)
    {
        if (n <= 1)
        {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        if (sum == n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    void display()
    {
        if (perfect(n) == 1)
        {
            System.out.println("The provided number is a perfect number.");
        }
        else
        {
            System.out.println("The provided number is not a perfect number.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();
        Perfect number = new Perfect(n);
        number.display();
        sc.close();
    }
}
