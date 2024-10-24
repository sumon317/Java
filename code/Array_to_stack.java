import java.util.Scanner;

public class Array_to_stack {
    int[] m; //to store the marks
    int[] st; //to store the stack elements
    int cap; //maximum capacity of the array and stack
    int top; //to point the index of the top-most elements of the stack

    Array_to_stack(int n) {
        cap = n;
        top =-1;
        m = new int[cap];
        st = new int[cap];
    }

    void input_marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks.");
        for (int i = 0; i < cap; i++) {
            m[i] = sc.nextInt();
            push_marks(m[i]);
        }
        sc.close();
    }

    void push_marks(int v) {
        if (top == cap-1) {
            System.out.println("Not Possible");
        } else {
            top++;
            st[top] = v;
        }
    }

    void pop_marks() {
        int b;
        if(top == 0) {
            System.out.println("-999");
        } else {
            b = st[top];
            top--;
            System.out.println("Popped value: " + b);
        }
    }

    void display() {
        System.out.println("The marks are:");
        for (int i = 0; i <= top; i++) {
            System.out.print(st[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int array_length = sc.nextInt();
        Array_to_stack obj = new Array_to_stack(array_length);
        obj.input_marks();
        obj.pop_marks();
        obj.display();
        sc.close();
    }
}
