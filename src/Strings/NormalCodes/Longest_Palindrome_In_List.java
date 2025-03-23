package Strings.NormalCodes;

import java.util.Comparator;
import java.util.List;

public class Longest_Palindrome_In_List {
    public static void main(String[] args)
    {
        List<String> words = List.of("racecar", "apple", "madam", "banana", "civic", "refer");

        String longestPalindrome = words.stream()
                .filter(Longest_Palindrome_In_List::isPalindrome)
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
