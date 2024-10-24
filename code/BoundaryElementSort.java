import java.util.Arrays;
import java.util.Scanner;

class BoundaryElementSort {
    private int[][] matrix;
    private int m;
    private int n;

    // Parameterized constructor to initialize the 2D array and dimensions
    public BoundaryElementSort(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }

    // Method to accept the elements into the matrix
    public void acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    // Method to sort the boundary elements of the matrix in ascending order
    public void sortBoundaryElements() {
        int[] boundaryElements = new int[2 * (m + n - 2)];
        int index = 0;

        // Collect boundary elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    boundaryElements[index++] = matrix[i][j];
                }
            }
        }

        // Sort the boundary elements
        Arrays.sort(boundaryElements);

        // Place sorted boundary elements back into the matrix
        index = 0;
        for (int j = 0; j < n; j++) matrix[0][j] = boundaryElements[index++];
        for (int i = 1; i < m; i++) matrix[i][n - 1] = boundaryElements[index++];
        for (int j = n - 2; j >= 0; j--) matrix[m - 1][j] = boundaryElements[index++];
        for (int i = m - 2; i > 0; i--) matrix[i][0] = boundaryElements[index++];
    }

    // Method to display the original and sorted matrix
    public void displayMatrix() {
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sortBoundaryElements();

        System.out.println("Sorted Boundary Elements Matrix:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the BoundaryElementSort class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        BoundaryElementSort bes = new BoundaryElementSort(m, n);
        bes.acceptMatrix();
        bes.displayMatrix();
        scanner.close();
    }
}