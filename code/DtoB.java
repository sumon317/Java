import java.util.Scanner;

public class DtoB {
    int dec;
    int bin; 
    public DtoB(int dec) {
        this.dec = dec;
        this.bin = 0; // bin initialized to 0
    }

    void convert() {
        int temp = dec;
        int place = 1;
        while (temp > 0) {
            int remainder = temp % 2;
            bin += remainder * place;
            temp /= 2;
            place *= 10;
        }
    }

    void display() {
        System.out.println("Decimal Number: " + dec);
        System.out.println("Binary Equivalent: " + bin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int inputDec = scanner.nextInt();

        DtoB dtoB = new DtoB(inputDec);
        dtoB.convert();
        dtoB.display();

        scanner.close();
    }
}