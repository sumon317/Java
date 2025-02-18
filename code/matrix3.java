import java.util.Scanner;

public class matrix3 {
    int arr[][];
    int m, n;

    matrix3(int mm, int nn) {
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

    int ldigsum() {
        int sum = 0;
        for (int i = 0; i < m && i < n; i++) {
            sum += arr[i][i];
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
        int sum = ldigsum();
        System.out.println("The sum of the left diagonal is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (m):");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns (n):");
        int n = scanner.nextInt();

        matrix3 matrix = new matrix3(m, n);
        matrix.input();
        matrix.display();

        scanner.close();
    }
}