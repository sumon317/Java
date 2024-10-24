//a java program to fin the maximum and minimum value from the row of a given matrix.
import java.util.Scanner;

public class rowMaxAndMinElement {
    int[][] arr;
    int M,N;
    rowMaxAndMinElement(int mm, int nn)
    {
        M = mm;
        N = nn;
        arr = new int[M][N];
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Matrix");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    void row_min_max()
    {
        for (int i = 0; i < M; i++) {
            int max = arr[i][0];
            int min = arr[i][0];
            for (int j = 0; j < N; j++)
            {
                if (arr[i][j] > max)
                {
                        max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
                System.out.println("Minimum value in row " + (i + 1) + ": " + min);
                System.out.println("Maximum value in row " + (i + 1) + ": " + max);
            }
        }
    void display()
    {
        System.out.println("The original Matrix is : ");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int r = sc.nextInt();
        System.out.println("Enter col number : ");
        int c = sc.nextInt();
        rowMaxAndMinElement obj = new rowMaxAndMinElement(r,c);
        obj.input();
        obj.display();
        obj.row_min_max();
        sc.close();
    }
}
