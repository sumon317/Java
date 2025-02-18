import java.util.Scanner;

public class Book {

    String[] name; //stores the names of the book
    int point; //stores the index of the topmost book
    int max;  //stores the maximum capacity of the books

    Book (int cap) {
        max = cap;
        point = -1;
        name = new String[max];
    }

    void add (String v) {
        if (point == max-1) {
            System.out.println("SHELF FULL");
        } else {
            point++;
            name[point] = v;
        }
    }

    void tell () {
        if (point == -1) {
            System.out.println("SHELF EMPTY");
        } else {
            String opt = name[point];
           point--;
            System.out.println("The last entered book is : " + opt);
        }
    }

    void display() {
        if (point == -1) {
            System.out.println("No books on the shelf.");
        } else {
            System.out.println("The names of the books are: ");
            for (int i = point; i >= 0; i--) {
                System.out.println(name[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj = new Book(5);

        while (true) {
            System.out.println("Enter the name of the book (or 'exit' to stop):");
            String nameOfBook = sc.nextLine();
            if (nameOfBook.equalsIgnoreCase("exit")) {
                break;
            }
            obj.add(nameOfBook);
        }

        obj.display();
        obj.tell();
        sc.close();
    }
}
