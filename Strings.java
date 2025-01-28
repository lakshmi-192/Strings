import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // 1. Convert to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        // 2. Find length
        int length = str.length();
        System.out.println("Length: " + length);
        // 3. Replace a character
        System.out.print("Enter a character to replace: ");
        char replaceChar = 'a';
        System.out.print("Enter a replacement character: ");
        char replacement = 'x';
        String replaced = str.replace(String.valueOf(replaceChar), String.valueOf(replacement));
        System.out.println("Replaced: " + replaced);
        // 4. Extract a substring
        System.out.print("Enter a start index: ");
        int startIndex = 2;
        System.out.print("Enter an end index: ");
        int endIndex = 5;
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Substring: " + substring);
    }
}
