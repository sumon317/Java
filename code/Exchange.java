import java.util.Scanner;

public class Exchange {
    String sent;
    String rev;
    int size;

    // Default constructor
    public Exchange() {
        sent = "";
        rev = "";
        size = -1;
    }

    public void readsentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence terminated by a full stop: ");
        sent = scanner.nextLine();
        size = sent.length();
        scanner.close();
    }

    public void exfirstlast() {
        String[] words = sent.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            if (word.endsWith(".")) {
                word = word.substring(0, word.length() - 1);
            }
            if (word.length() > 1) {
                newSentence.append(new StringBuilder(word).reverse().toString());
            } else {
                newSentence.append(word);
            }
            newSentence.append(" ");
        }

        rev = newSentence.toString().trim();
        if (sent.endsWith(".")) {
            rev += ".";
        }
    }

    public void display() {
        System.out.println("Original Sentence: " + sent);
        System.out.println("Modified Sentence: " + rev);
    }

    public static void main(String[] args) {
        Exchange obj = new Exchange();
        obj.readsentence();
        obj.exfirstlast();
        obj.display();
    }
}