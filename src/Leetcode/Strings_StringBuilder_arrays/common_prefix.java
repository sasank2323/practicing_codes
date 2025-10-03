package Leetcode.Strings_StringBuilder_arrays;

import java.util.Arrays;

public class common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.length()>0 ? sb.toString() : "";
    }
    public static void main(String[] args) {
        String[][] strs = {{"flower", "flow", "flight"}, {"dog", "racecar", "car"}};
        for (String[] s : strs) {
            System.out.println(longestCommonPrefix(s));
        }
    }
}



//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters if it is non-empty.