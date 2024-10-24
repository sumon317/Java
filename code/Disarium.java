// a java program to check if a given number is a Disarium number or not.
import java.util.*;

public class Disarium {
    static int n;
    
    Disarium (int nn) {
        n = nn;
    }
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sc.close();
    }
    
    int count_digit(int a) {
        int c = 0;
        while (a!=0) {
            a = a / 10;
            c++;
        }
        return c++;
    }
    
    boolean check() {
        int l = n;
        int s = 0;
        int x = count_digit(n);
        while (l!=0) {
            int d = l % 10;
            s = s + (int)Math.pow(d,x);
            x--;
            l = l / 10;
        }
        if (s == n) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String args[]) {
        boolean y = false;
        input();
        Disarium obj = new Disarium(n);
        y = obj.check();
        if(y == true) {
            System.out.println("The number is a Disarium number");
        }
        else {
            System.out.println("The number is not a Disarium number");
        }
    }
}
