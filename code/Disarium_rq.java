import java.util.Scanner;

class Disarium_rq {
    int num;
    int size;

    Disarium_rq(int nn) {
        num = nn;
        size = 0;
    }

    void countDigit() {
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            size++;
        }
    }

    int sumofDigits(int r, int p) {
        if (r == 0) {
            return 0;
        } else {
            return (int) Math.pow(r % 10, p) + sumofDigits(r / 10, p - 1);
        }
    }

    void check() {
        countDigit();
        int sum = sumofDigits(num, size);
        if (sum == num) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Disarium number: ");
        int n = sc.nextInt();
        Disarium_rq obj = new Disarium_rq(n);
        obj.check();
        sc.close();
    }
}