package Strings.GroupingBy;
import java.util.*;
import java.util.stream.Collectors;

public class StaticBlockAsFunction {
    public static boolean check(char x)
    {
//        if ("aeiouAEIOU".indexOf(x)) { if expect boolean but it was returning a value
//            return false;}
//        else {
//            return true;}

        return "aeiouAEIOU".indexOf(x) == -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Boolean,List<Character>> result = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
                        StaticBlockAsFunction::check));
        for(Map.Entry<Boolean,List<Character>> rr:result.entrySet())
        {
            System.out.println(rr.getKey()+"  "+rr.getValue());
        }
    }
}
