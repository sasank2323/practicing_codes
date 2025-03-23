package Strings.GroupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency_of_charcters {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("hello","hello","world","sasank","sasank","sasank");
        Map<String,Long> rr=str.stream()
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        for(Map.Entry<String,Long> e : rr.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue());
        }


    }
}
