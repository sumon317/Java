import java.util.Scanner;

public class ConsChange {
    String word;
    int len;
    static Scanner sc = new Scanner(System.in);

    ConsChange() {
        len = 0;
        word = "";
    }

    void readWord() {
        System.out.println("Enter word in lower case:");
        word = sc.nextLine();
        len = word.length();
    }

    void shiftCons() {
        String s = "";
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                s += c;
            }
        }
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                s += c;
            }
        }
        word = s;
    }

    void changeWord() {
        String s = "";
        char c;
        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                s += (char) (c - 32);
            } else {
                s += c;
            }
        }
        word = s;
    }

    void show() {
        System.out.println("Original word = " + word);
        shiftCons();
        changeWord();
    }

    public static void main(String[] args) {
        ConsChange obj = new ConsChange();
        obj.readWord();
        obj.show();
    }
}