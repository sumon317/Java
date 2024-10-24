// a java program to find the maximum and minimum value from a given matrix.
import java.util.Scanner;

public class matrix_maximumAndMinimumElement {
    int[][] arr;
    int M,N;

    matrix_maximumAndMinimumElement(int mm, int nn)
    {
        M = mm;
        N = nn;
        arr = new int [M][N];
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    int max()
    {
        int mx = 0;
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (arr[i][j] > mx)
                {
                    mx = arr[i][j];
                }
            }
        }
        return mx;
    }

    int min()
    {
        int mn = arr[0][0];
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (arr[i][j] < mn)
                {
                    mn = arr[i][j];
                }
            }
        }
        return mn;
    }

    void display()
    {
        System.out.println("The original matrix is : ");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int min = min();
        int max = max();
        System.out.println("The maximum elements is : " + max);
        System.out.println("The minimum element is : " + min);
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int r = sc.nextInt();
        System.out.println("Enter column number : ");
        int c = sc.nextInt();
        matrix_maximumAndMinimumElement obj = new matrix_maximumAndMinimumElement(r,c);
        obj.input();
        obj.display();
        sc.close();
    }
}
