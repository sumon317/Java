// a java program to check if two given number are Twin Prime number or not.

/**
 * twin prime is a pair of two prime number whose difference is 2.
 * For Example: 3 is a prime number, 5 is a prime number and difference of 5 and 3 is 2 (5 - 3 = 2).
 * Hence 3 and 5 [(3,5) or (5,3)] is a pair of twin prime.
 */

import java.util.*;
public class TwinPrime
{
    int n1;
    int n2;

    TwinPrime (int nn, int mm)
    {
        n1 = nn;
        n2 = mm;
    }
    
    int Prime(int n)
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

    void check()
    {
        if (Prime(n1) == 1 && Prime(n2) == 1 && Math.abs(n1 - n2) == 2)
        {
            System.out.println("They are twin prime.");
        }
        else
        {
            System.out.println("They are not twin prime.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number.");
        int a = sc.nextInt();
        System.out.println("Enter second number.");
        int b = sc.nextInt();
        TwinPrime number = new TwinPrime(a,b);
        number.check();
        sc.close();
    }
}
