import java.util.*;

public class Lab307 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a text: ");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println("Text: " + text);
            System.out.println("It is palindrome");
        } else {
            System.out.println("Text: " + text);
            System.out.println("It is not palindrome");
        }
        input.close();
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}