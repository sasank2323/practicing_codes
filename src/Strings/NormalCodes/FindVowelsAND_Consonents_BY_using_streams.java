package Strings.NormalCodes;

import java.util.List;
import java.util.stream.Collectors;

public class FindVowelsAND_Consonents_BY_using_streams {
    public static void main(String[] args)
    {
        String r="sasank";

        long vowels=r.chars().mapToObj(c -> (char) c)
                .filter(h -> "aeiouAEIOU".indexOf(h)!=-1).count();

        List<Character> consonets=r.chars().mapToObj(c -> (char) c)
                .filter(h->"aeiouAEIOU".indexOf(h)>=0).collect(Collectors.toList());

        for(Character s: consonets)
        {
            System.out.println(s);
        }
        System.out.println(vowels);

    }
}
