package Strings.NormalCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class list_of_palindromes {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("racecar", "level", "madam", "hello", "world");
        List<String> rr=words.stream().filter(c->c.equals(new StringBuilder(c).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(rr);
    }
}
