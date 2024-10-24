// a java program to check if a given number is a Twisted prime number or not.
/**
 * a twisted prime is one which is a prime as well as its reverse is also prime.
 * For example: 19 is prime and 91(reverse of 19) is alo prime.
 */
import java.util.Scanner;

public class TwistedPrime
{
    int n;

    TwistedPrime (int nn)
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
    
    int TwistedPrimeCheck (int n)
    {
        if (Prime(n) == 0)
        {
            return 0;
        }

        int reversed = 0;
        int temp = n;
        while (temp != 0)
        {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (Prime(reversed));
    }

    void display()
    {
        if (TwistedPrimeCheck(n) == 1)
        {
            System.out.println("The given number is a twisted prime number.");
        }
        else
        {
            System.out.println("The given number is not a twisted prime number.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        TwistedPrime number = new TwistedPrime(num);
        number.display();
        sc.close();
    }
}
