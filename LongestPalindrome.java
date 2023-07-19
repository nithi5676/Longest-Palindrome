package longestPalindrome;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String alphabet = scanner.next();
        scanner.close();
        System.out.println(palindrome(alphabet));
    }

    private static String palindrome(String alphabet) {
        int maxLenght = 1, start = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < alphabet.length() && alphabet.charAt(left) == alphabet.charAt(right)) {
                left--;
                right++;
            }
            int lenght = right - left - 1;
            if (lenght > maxLenght) {
                maxLenght = lenght;
                start = left + 1;

            }

        }

        return alphabet.substring(start, start + maxLenght);
    }
}
