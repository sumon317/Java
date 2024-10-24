import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = sc.nextInt();
        Series obj = new Series(number);
        obj.calsum();
        obj.display();
        sc.close();
    }
}
