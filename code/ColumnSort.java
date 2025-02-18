import java.util.Scanner;

class ColumnSort {
    private int[][] arr;

    // Default constructor to initialize the 2D array
    public ColumnSort() {
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

    // Method to sort the elements down each column of the 2D array in ascending order
    public void sortColumns() {
        for (int j = 0; j < arr[0].length; j++) {
            // Create a temporary array to store the column elements
            int[] column = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                column[i] = arr[i][j];
            }
            // Sort the column
            java.util.Arrays.sort(column);
            // Place the sorted elements back into the column
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = column[i];
            }
        }
    }

    // Method to display the original and sorted 2D arrays
    public void displayArray() {
        System.out.println("Original Array:");
        printArray(arr);

        sortColumns();

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
        ColumnSort cs = new ColumnSort();
        cs.acceptArray();
        cs.displayArray();
    }
}