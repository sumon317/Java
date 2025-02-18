import java.util.Scanner;

public class BtoD {
    int bin;
    int dec;

    public BtoD(int binaryNumber) {
        this.bin = binaryNumber;
        this.dec = 0;
    }

    public void convert() {
        int temp = bin;
        int power = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            dec += lastDigit * Math.pow(2, power);
            temp /= 10;
            power++;
        }
    }

    public void display() {
        System.out.println("Binary Number: " + bin);
        System.out.println("Decimal Number: " + dec);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binaryNumber = scanner.nextInt();

        BtoD converter = new BtoD(binaryNumber);
        converter.convert();
        converter.display();

        scanner.close();
    }
}