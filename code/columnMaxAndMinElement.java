//a java program to fin the maximum and minimum value from the column of a given matrix.
import java.util.Scanner;

public class columnMaxAndMinElement {
    int[][] arr;
    int M,N;
    columnMaxAndMinElement(int mm, int nn)
    {
        M = mm;
        N = nn;
        arr = new int[M][N];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Matrix");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    void col_min_max()
    {
        for (int j = 0; j < N; j++)
        {
            int max = arr[0][j];
            int min = arr[0][j];
            for (int i = 0; i < M; i++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum value in column " + (j + 1) + ": " + min);
            System.out.println("Maximum value in column " + (j + 1) + ": " + max);
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
        columnMaxAndMinElement obj = new columnMaxAndMinElement(r,c);
        obj.input();
        obj.display();
        obj.col_min_max();
        sc.close();
    }
}
