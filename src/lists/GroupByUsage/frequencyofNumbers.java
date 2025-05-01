package lists.GroupByUsage;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class frequencyofNumbers {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,4,3,2,4,4};
        ArrayList<Integer> h=new ArrayList<>();
        for(int r:a)
        {
            h.add(r);
        }
       Map<Integer,Long> rr=h.stream()
               .collect(Collectors.groupingBy(x->x, Collectors.counting()));
       rr.forEach((x,y)->System.out.println("key"+x+" value "+y));
    }
}
