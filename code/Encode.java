import java.util.Scanner;

class Encode {
    String wrd;
    int len;
    String newWrd;

    public Encode() {
        wrd = new String();
        len = 0;
        newWrd = new String();
    }

    public void acceptWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        wrd = in.next().toUpperCase();
        len = wrd.length();
        in.close();
    }

    public void freqVowCon() {
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if ("AEIOU".indexOf(ch) >= 0)
                count++;
        }
        System.out.println("Vowel frequency: " + count);
    }

    public void nextVowel() {
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            switch (ch) {
                case 'A':
                    newWrd += 'E';
                    break;
                case 'E':
                    newWrd += 'I';
                    break;
                case 'I':
                    newWrd += 'O';
                    break;
                case 'O':
                    newWrd += 'U';
                    break;
                case 'U':
                    newWrd += 'A';
                    break;
                default:
                    newWrd += ch;
            }
        }
    }

    public void disp() {
        System.out.println("Original word: " + wrd);
        System.out.println("Encrypted word: " + newWrd);
    }

    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.acceptWord();
        obj.freqVowCon();
        obj.nextVowel();
        obj.disp();
    }
}