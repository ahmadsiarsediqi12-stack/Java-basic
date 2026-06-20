import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if (isPalindrome(s))
            System.out.println("\"" + s + "\" is a palindrome");
        else
            System.out.println("\"" + s + "\" is not a palindrome");
    }

    public static boolean isPalindrome(String s) {
        String filtered = filter(s);
        return filtered.equals(reverse(filtered));
    }

    public static String filter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                result += Character.toLowerCase(c);
        }
        return result;
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);
        return result;
    }
}
