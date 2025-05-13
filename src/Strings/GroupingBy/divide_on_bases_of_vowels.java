package Strings.GroupingBy;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class divide_on_bases_of_vowels {
    public static void main(String[] args)
    {
        String str = "Hello, World!";
        String[] vowels = {"a", "e", "i", "o", "u"};
        Map<Boolean, List<Character>> rr=str.chars()
                .mapToObj(c->(char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(c-> "aeiouAEIOU".indexOf(c)!=-1));

        for(Map.Entry<Boolean, List<Character>> entry: rr.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }}
