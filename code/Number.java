public class Number {
    int n; //to store an integer number

    Number (int nn) {
        n = nn;
    }

    int factorial (int a) {
        int x = 1;
        while (a > 0) {
            x = x * a;
            a--;
        }
        return x;
    }

    void display () {
        int fac = factorial(n);
        System.out.println("The factorial of " + n + " is " + fac);
    }
}
