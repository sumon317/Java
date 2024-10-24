// a java program to convert a octal number to decimal number.
import java.util.*;
class Octadeci {
    int oct;
    int deci;
    
    Octadeci (int nn) {
        oct = nn;
        deci = 0;
    }
    
    int convert (int n) {
        int s = 0;
        int x = 0;
        while (n!=0) {
            int rem = n % 10;
            s = s + ((int)Math.pow(8,x) * rem);
            x++;
            n = n / 10;
        }
        return s;
    }
    
    void display() {
        deci = convert(oct);
        System.out.println("The decimal equivalent is : " + deci);
    }
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the octal number : ");
        int octal = sc.nextInt();
        Octadeci obj = new Octadeci(octal);
        obj.display();
        sc.close();
    }
}