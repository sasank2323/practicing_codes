package Strings.NormalCodes;

import java.util.List;
import java.util.stream.Collectors;

public class stringToCharacter_AND_CharacterToString {
    public static void main(String[] args)
    {
        String s="sasank";
        String rim="";
        char[] ss=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ss[i]=s.charAt(i);
        }
        String rr=s.chars().mapToObj(a->String.valueOf((char) a)).collect(Collectors.joining());

        List<Character> list=s.chars().mapToObj(a-> (char) a).collect(Collectors.toList());
        System.out.println(list);
        //.mapToObj(c -> String.valueOf((char) c)) converts each integer to a char and then to a String.
        System.out.println(rr);

        char[] charArray = {'s', 'a', 's', 'a', 'n', 'k'};
        String str = String.valueOf(charArray);
        System.out.println(str);

        char[] charArray1 = {'s', 'a', 's', 'a', 'n', 'k'};
        String str1 = new String(charArray); // Convert char array to string
        System.out.println(str);
    }
}
