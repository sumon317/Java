import java.util.Scanner;

class Admission {
    int[] Adno; // Array to store admission numbers

    // Constructor to initialize the array
    Admission() {
        Adno = new int[100];
    }

    // Method to accept the elements of the array in ascending order
    void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 100 admission numbers in ascending order:");
        for (int i = 0; i < 100; i++) {
            Adno[i] = scanner.nextInt();
            scanner.close();
        }
    }

    // Method to search for a particular admission number using binary search
    int binSearch(int l, int u, int v) {
        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (Adno[mid] == v) {
                return 1; // Element found
            }
            if (Adno[mid] < v) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return -1; // Element not found
    }

    // Main method to create an object and call the functions
    public static void main(String[] args) {
        Admission admission = new Admission();
        admission.fillArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the admission number to search: ");
        int searchNumber = scanner.nextInt();

        int result = admission.binSearch(0, 99, searchNumber);
        if (result == 1) {
            System.out.println("Admission number found.");
        } else {
            System.out.println("Admission number not found.");
        }
        scanner.close();
    }
}