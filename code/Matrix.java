import java.util.Scanner;

class Matrix {
    int arr[][];
    int m, n;
    Matrix(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    Matrix SubMat(Matrix A) {
        Matrix result = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result.arr[i][j] = A.arr[i][j] - this.arr[i][j];
            }
        }
        return result;
    }
    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (max 25):");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns (max 25):");
        int cols = sc.nextInt();
        sc.close();
        if (rows > 25 || cols > 25) {
            System.out.println("Matrix size exceeds the maximum limit.");
            return;
        }

        Matrix matrix1 = new Matrix(rows, cols);
        Matrix matrix2 = new Matrix(rows, cols);

        System.out.println("Enter elements for the first matrix:");
        matrix1.fillarray();

        System.out.println("Enter elements for the second matrix:");
        matrix2.fillarray();

        Matrix resultMatrix = matrix2.SubMat(matrix1);

        System.out.println("The result of subtraction is:");
        resultMatrix.display();
    }
}