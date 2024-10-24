import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the item.");
        String name = sc.nextLine();
        System.out.println("Total " + name + " in stock");
        int qty = sc.nextInt();
        System.out.println("Per unit rate of " + name);
        int rate = sc.nextInt();
        System.out.println("Number of " + name + " purchased.");
        int pq = sc.nextInt();
        System.out.println("Enter rate per unit of " + name);
        int pr = sc.nextInt();

        Purchase obj = new Purchase(name, qty, rate, pq, pr);
        obj.display();

        sc.close();
    }
}
