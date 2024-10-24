// a java program to find the sum of left and right diagonal of a matrix.

import java.util.*;
class Matrix2
{
    int arr[][];
    int M; int N;
    
    Matrix2 (int mm, int nn)
    {
        M = mm;
        N = nn;
        arr = new int[M][N];
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    int ldsum()
    {
        int s = 0;
        if (M == N)
        {
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (i == j)
                    {
                        s = s + arr[i][j];
                    }
                }
            }
        }
        return s;
    }
    
    int rdsum()
    {
        int s1 = 0; int k = N-1;
         if (M == N)
        {
            for (int i = 0; i < M; i++)
            {
                 s1 = s1 + arr[i][k];
                 k--;
            }
        }
        return s1;
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
        int x = ldsum();
        int y = rdsum();
        System.out.println("The left diagonal sum of the matrix is : " + x);
        System.out.println("The right diagonal sum of the matrix is : " + y);
    }
    
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int r = sc.nextInt();
        System.out.println("Enter column number : ");
        int c = sc.nextInt();
        Matrix2 obj = new Matrix2(r,c);
        obj.input();
        obj.display();
        sc.close();
    }
}