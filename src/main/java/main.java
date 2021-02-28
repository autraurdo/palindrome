import java.util.*;

public class main {
    public static boolean isPalindrome(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        if (word.equals(reverseWord)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int summPalindrome = 0, size = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = reader.nextLine();
        String[] words = text.split(" ");
        int min = words[0].length(), secondMin = 0;
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                if (words[i].length() < min) {
                    secondMin = min;
                }
                summPalindrome++;
            }
        }
        System.out.println("Words palindromes " + summPalindrome + "\r\nSecondary minimum " + secondMin);
    }
}
