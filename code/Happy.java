import java.util.Scanner;

public class Happy {
    int n;

    Happy() {
        n = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    int sum_sq_digits(int x) {
        if (x == 0) {
            return 0;
        } else {
            int digit = x % 10;
            return digit * digit + sum_sq_digits(x / 10);
        }
    }

    void isHappy() {
        int result = n;
        while (result != 1 && result != 4) {
            result = sum_sq_digits(result);
        }
        if (result == 1) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not a Happy Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int x = sc.nextInt();
        Happy obj = new Happy();
        obj.getnum(x);
        obj.isHappy();
        sc.close();
    }
}
