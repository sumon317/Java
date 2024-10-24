import java.util.Scanner;

class Emrip_req {
    int n;
    int rev;
    int f;

    Emrip_req(int nn) {
        n = nn;
        rev = 0;
        f = 2;
    }

    int isPrime(int x) {
        if (x <= 1) {
            return 0;
        }
        if (f * f > x) {
            return 1;
        }
        if (x % f == 0) {
            return 0;
        }
        f++;
        return isPrime(x);
    }

    void isEmrip() {
        int temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        f = 2; // Reset f to 2 before checking primality of n
        boolean isNPrime = isPrime(n) == 1;
        f = 2; // Reset f to 2 before checking primality of rev
        boolean isRevPrime = isPrime(rev) == 1;

        if (isNPrime && isRevPrime) {
            System.out.println(n + " is an Emrip number.");
        } else {
            System.out.println(n + " is not an Emrip number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Emrip number: ");
        int num = sc.nextInt();
        Emrip_req obj = new Emrip_req(num);
        obj.isEmrip();
        sc.close();
    }
}