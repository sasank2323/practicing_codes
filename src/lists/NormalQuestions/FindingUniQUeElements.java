package lists.NormalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FindingUniQUeElements {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> h = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            h.add(r.nextInt(90) + 10);
        }
        System.out.println(h);

        List<Integer> uniqueElements =h.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique elements are by streams: " + uniqueElements);

        Set<Integer> m=new HashSet<>(h);
        System.out.println("this is set"+m);

    }
}
