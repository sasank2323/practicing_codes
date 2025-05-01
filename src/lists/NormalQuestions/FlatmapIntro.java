package lists.NormalQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapIntro {
    public static void main(String[] args)
    {
        List<List<Integer>> h=Arrays.asList(Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );
       List<Integer> m=h.stream().flatMap(r->r.stream()).collect(Collectors.toList());
       for(Integer rrr:m)
       {
           System.out.println(rrr);
       }
    }
}
