import java.util.Scanner;

class RowSort {
    private int[][] arr;

    // Default constructor to initialize the 2D array
    public RowSort() {
        arr = new int[3][3]; // Assuming a 3x3 array for simplicity
    }

    // Method to accept the elements into the 2D array
    public void acceptArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    // Method to sort the elements across each row of the 2D array in ascending order
    public void sortRows() {
        for (int i = 0; i < arr.length; i++) {
            // Using Arrays.sort() to sort each row
            java.util.Arrays.sort(arr[i]);
        }
    }

    // Method to display the original and sorted 2D arrays
    public void displayArray() {
        System.out.println("Original Array:");
        printArray(arr);

        sortRows();

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    // Helper method to print the 2D array
    private void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main function to create an object and call the functions accordingly
    public static void main(String[] args) {
        RowSort rs = new RowSort();
        rs.acceptArray();
        rs.displayArray();
    }
}