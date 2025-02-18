import java.util.Scanner;

public class ASCII
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine();
        int len = str.length();
     
     
        char lowerCaseLow = 255;
        char lowerCaseHigh = 0;
        char upperCaseLow = 255;
        char upperCaseHigh = 0;
        
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                if (ch < lowerCaseLow) {
                    lowerCaseLow = ch;
                }
                
                if (ch > lowerCaseHigh) {
                    lowerCaseHigh = ch;
                }
            }
            else if (Character.isUpperCase(ch)) {
                if (ch < upperCaseLow) {
                    upperCaseLow = ch;
                }
                
                if (ch > upperCaseHigh) {
                    upperCaseHigh = ch;
                }
            }
        }
        
        System.out.println("The character with lowest ASCII code in lower case: " 
        + lowerCaseLow);
        System.out.println("The character with highest ASCII code in lower case: " 
        + lowerCaseHigh);
        System.out.println("The character with lowest ASCII code in upper case: " 
        + upperCaseLow);
        System.out.println("The character with highest ASCII code in upper case: " 
        + upperCaseHigh);

        in.close();
    }
}