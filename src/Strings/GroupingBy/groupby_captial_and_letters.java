package Strings.GroupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupby_captial_and_letters {
    public static void main(String[] args)
    {
        String s="hello World";
        Map<Boolean,List<Character>> caseGroups = s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(c ->
                        Character.isUpperCase(c)
                ));
        for(Map.Entry<Boolean, List<Character>> r:caseGroups.entrySet())
        {
            System.out.println(r.getKey()+" "+r.getValue());
        }

        System.out.println("---");

        Map<String, List<Character>> caseGroups2 = s.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.groupingBy(c ->
                        Character.isUpperCase(c) ? "UPPER" : "LOWER"
                ));
        for(Map.Entry<String, List<Character>> r:caseGroups2.entrySet())
        {
            System.out.println(r.getKey()+" "+r.getValue());
        }
    }
}
