package Strings.NormalCodes;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstnonReptingChar {
    public static void main(String[] args)
    {
        String d="google in mac";
        List<Character> c=d.chars()
                .mapToObj(ch->(char) ch)
                .filter(ch->d.indexOf(ch)!=d.lastIndexOf(ch))
                .collect(Collectors.toList());
        System.out.println("found " + c);

        for(char m:d.toCharArray())
        {
            if(d.indexOf(m)!=d.lastIndexOf(m)) {
                System.out.println("First non-repeating character is: " + m);
                break;
            }

        }

    }
}
