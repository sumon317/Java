import java.util.Scanner;

public class Matrix1 {
    int arr[][];
    int m, n;
    
    Matrix1(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    int rdigsum() {
        int sum = 0;
        for (int i = 0; i < m && i < n; i++) {
            sum += arr[i][n - 1 - i];
        }
        return sum;
    }

    void display() {
        System.out.println("The original matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = rdigsum();
        System.out.println("The sum of the right diagonal is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (m):");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns (n):");
        int n = scanner.nextInt();
        scanner.close();
        Matrix1 matrix = new Matrix1(m, n);
        matrix.input();
        matrix.display();
    }
}