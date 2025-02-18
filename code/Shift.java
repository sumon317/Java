import java.util.Scanner;

class Shift {
    int mat[][];
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void cyclic(Shift p) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1) {
                    mat[i][j] = p.mat[0][j];
                } else {
                    mat[i][j] = p.mat[i + 1][j];
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (max 5):");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns (max 5):");
        int cols = sc.nextInt();
        sc.close();
        if (rows > 5 || cols > 5) {
            System.out.println("Rows or columns exceed the maximum limit.");
            return;
        }

        Shift originalMatrix = new Shift(rows, cols);
        originalMatrix.input();

        Shift shiftedMatrix = new Shift(rows, cols);
        shiftedMatrix.cyclic(originalMatrix);

        System.out.println("Original Matrix:");
        originalMatrix.display();

        System.out.println("Shifted Matrix:");
        shiftedMatrix.display();
    }
}