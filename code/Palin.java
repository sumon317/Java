import java.util.*;

class Palin {
    int num; // integer to store the number
    int revnum; // integer to store the reverse of the number

    // Constructor to initialize data members with legal initial values
    Palin() {
        num = 0;
        revnum = 0;
    }

    // Method to accept the number
    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Palindrome number: ");
        num = scanner.nextInt();
        scanner.close();
    }

    // Method to reverse the parameterized argument 'y' and store it in 'revnum' using recursive technique
    int reverse(int y) {
        if (y == 0) return revnum;
        revnum = revnum * 10 + y % 10;
        return reverse(y / 10);
    }

    // Method to check whether the number is a Palindrome by invoking the function reverse() and display the result
    void check() {
        revnum = 0; // Reset revnum before calling reverse
        reverse(num);
        if (num == revnum) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
    }

    // Main function to create an object and call the functions
    public static void main(String[] args) {
        Palin palin = new Palin();
        palin.accept();
        palin.check();
    }
}