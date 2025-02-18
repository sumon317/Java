import java.util.*;

class Special {
    private int n;

    // Default constructor
Special() {
        n = 0;
    }

    // Method to accept the number
void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        scanner.close();
    }

    // Method to return the factorial of a number
int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if the number is a Special number
boolean isSpecial() {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    // Method to display the result
void display() {
        if (isSpecial()) {
            System.out.println(n + " is a Special number.");
        } else {
            System.out.println(n + " is not a Special number.");
        }
    }

    // Main method to create an object and call the member functions
    public static void main(String[] args) {
        Special obj = new Special();
        obj.read();
        obj.display();
    }
}