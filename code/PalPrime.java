// a java program to check if a given number is a Prime number as well as Pallindrome or not.
import java.util.Scanner;

public class PalPrime
{
    int n;
    PalPrime (int nn)
    {
        n = nn;
    }
    
    int Prime (int n)
    {
        if (n <= 1)
        {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }

    int reverseNumber(int n)
    {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
    
    void check()
    {
        if (Prime(n) == 0)
        {
            System.out.println("Given number is not prime number.");
        }

        int reverse = reverseNumber(n);

        if (n == reverse)
        {
            System.out.println("Given number is a pal prime number.");
        } else
        {
            System.out.println("Given number is not a pal prime number.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = sc.nextInt();
        PalPrime number = new PalPrime(num);
        number.check();
        sc.close();
    }
}
