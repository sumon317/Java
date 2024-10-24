import java.util.*;

class Rearrange {
    String word; // to store a word
    String newword; // to store the rearranged word

    // Default constructor
    Rearrange() {
        word = "";
        newword = "";
    }

    // Method to accept the word in UPPER case
    void readword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word in UPPER case: ");
        word = scanner.nextLine();
        scanner.close();
    }

    // Method to find the frequency of vowels and consonants in the word and display them
    void freq_vow_con() {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "AEIOU";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Frequency of vowels: " + vowelCount);
        System.out.println("Frequency of consonants: " + consonantCount);
    }

    // Method to rearrange the word by bringing the vowels at the beginning followed by consonants
    void arrange() {
        String vowels = "AEIOU";
        StringBuilder vowelPart = new StringBuilder();
        StringBuilder consonantPart = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelPart.append(ch);
            } else {
                consonantPart.append(ch);
            }
        }

        newword = vowelPart.toString() + consonantPart.toString();
    }

    // Method to display the original word along with the rearranged word
    void display() {
        System.out.println("Original word: " + word);
        System.out.println("Rearranged word: " + newword);
    }

    // Main function to create an object and call the functions
    public static void main(String[] args) {
        Rearrange rearrange = new Rearrange();
        rearrange.readword();
        rearrange.freq_vow_con();
        rearrange.arrange();
        rearrange.display();
    }
}