// a java program to check if a given number is a Magic number or not.
import java.util.*;
public class MagicNumber
{
    int n;

    MagicNumber(int nn)
    {
        n = nn;
    }

    int sumOfDigits(int number)
    {
        if (number < 10)
        {
            return number;
        }
        else
        {
            int sum = 0;
            while (number != 0)
            {
                sum += number % 10;
                number /= 10;
            }
            return sumOfDigits(sum);
        }
    }

     void check()
    {
        int result = sumOfDigits(n);
        if (result == 1)
        {
            System.out.println("The given number is a Magic Number");
        }
        else
        {
            System.out.println("The given number is not a Magic Number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        MagicNumber obj = new MagicNumber(num);
        obj.check();
        sc.close();
    }
}
