// a java program to check if a given number is Armstrong or not.
import java.util.*;
public class ArmNum {
    int n,l;
    ArmNum(int nn) {
        n = nn;
        l = Integer.toString(n).length();
    }
    int sum_pow(int i) {
        if (i == 0) {
            return 0;
        }
        else {
            return (int)(Math.pow(i%10, l)) + sum_pow(i/10);
        }
    }
    void isArmstrong() {
        int a = sum_pow(n);
        if (a == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is not an Armstrong Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int x = sc.nextInt();
        ArmNum obj = new ArmNum(x);
        obj.sum_pow(x);
        obj.isArmstrong();
        sc.close();
    }
}
