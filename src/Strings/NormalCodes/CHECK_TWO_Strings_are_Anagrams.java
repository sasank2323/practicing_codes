package Strings.NormalCodes;

import java.util.Arrays;

public class CHECK_TWO_Strings_are_Anagrams {
    public static boolean areAnagrams(String s1, String s2) {
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
    }
}
