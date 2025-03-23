package lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfNumbers {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        double avg=numbers.stream().collect(Collectors.averagingInt(n->n));
        double sum1=numbers.stream().collect(Collectors.summingInt(n->n));
        double sum12=numbers.stream().collect(Collectors.summingDouble(n->n));
        System.out.println("average"+"  " +avg);
        System.out.println("Sum of numbers: " + sum1+" "+sum12);
    }
}
