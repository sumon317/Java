// a java program to calculate the sum of all the boundary elements of a given matrix.
import java.util.Scanner;

public class SumOfBoundaryElement {
    int [][] arr;
    int s,M;
    SumOfBoundaryElement(int mm) {
        M = mm;
        s = 0;
        arr = new int[M][M];
    }
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the matrix elements.");
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
    }
    void outerSum() {
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                if((i == 0) || (j == 0) || (i == (M-1)) || (j == (M-1))) {
                    s = s + arr[i][j];
                }
            }
        }
    }
    void display() {
        System.out.println("The original Matrix is : ");
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The boundary elements sum is " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows.");
        int n = sc.nextInt();
        SumOfBoundaryElement obj = new SumOfBoundaryElement(n);
        obj.input();
        obj.outerSum();
        obj.display();
        sc.close();
    }
}

