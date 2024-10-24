// a java program to convert a decimal number to octal number.
import java.util.*;
class Decioct {
    int deci;
    int oct;
    Decioct (int nn) {
        deci = nn;
        oct = 0;
    }
    
    int convert(int n) {
        String s = "";
        int b;
        while (n!=0) {
            int r = n % 8;
            s = Integer.toString(r) + s;
            n = n/8;
        }
        b = Integer.valueOf(s);
        return b;
    }
    void display() {
        oct = convert(deci);
        System.out.println("The octal equivalent is : " + oct);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int dec = sc.nextInt();
        Decioct obj = new Decioct(dec);
        obj.display();
        sc.close();
    }
}