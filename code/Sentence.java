// a program to find the frequency of a character 'the' present in the String
import java.util.*;
public class Sentence {
    String st;
    char ch;
    int f;
    Sentence(String str, char c) {
        st = str;
        ch = c;
        f = 0;
    }
    void find() {
        int l = st.length();
        for(int i=0; i<l; i++) {
            if(st.charAt(i) == ch) {
                f++;
            }
        }
        System.out.println("The frequency of the character: " + f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String s = sc.nextLine();
        System.out.println("Enter the character to find.");
        char character = sc.next().charAt(0);
        Sentence obj = new Sentence(s, character);
        obj.find();
        sc.close();
    }
}
