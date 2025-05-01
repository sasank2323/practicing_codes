package lists.GroupByUsage;

import java.util.*;
import java.util.stream.Collectors;

public class settingUpByUsingACcordingToLength {
    public static void main(String[] args)
    {
        List<String> r=Arrays.asList("sasank","make","bike","carr","ss");
        Map<Integer,List<String>> map=r.stream()
                .collect(Collectors.groupingBy(String::length));
        map.forEach((x,y)->System.out.println("key "+x+" value "+y));

    }
}
