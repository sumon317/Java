import java.util.*;

class Perfect_rec {
    int num; // to store the number

    // Parameterized constructor to initialize the data member num = nn
    public Perfect_rec(int nn) {
        num = nn;
    }

    // Recursive function to return the sum of factors of the number, excluding itself
    int sum_of_factors(int i) {
        if (i > num / 2) return 0;
        if (num % i == 0) return i + sum_of_factors(i + 1);
        return sum_of_factors(i + 1);
    }

    // Function to check whether the given number is a perfect number
    void check() {
        int sum = sum_of_factors(1);
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    // Main function to create an object and call the functions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a perfect number: ");
        int number = scanner.nextInt();

        Perfect_rec perfect = new Perfect_rec(number);
        perfect.check();
        scanner.close(); 
    }
}