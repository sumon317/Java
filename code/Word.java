
import java.util.Scanner;

public class Word {
    String str;
    String word;
    int f;

    Word(String st, String w) {
        str = st;
        word = w;
        f = 0;
    }

    void find() {
        String[] words = str.split(" ");
        for (String s : words) {
            if (s.equals(word)) {
                f++;
            }
        }
        System.out.println("The frequency of the word '" + word + "' is: " + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String s = sc.nextLine();
        System.out.println("Enter the word to find.");
        String w = sc.next();
        Word obj = new Word(s, w);
        obj.find();
        sc.close();
    }
}
