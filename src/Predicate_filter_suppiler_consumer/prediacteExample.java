package Predicate_filter_suppiler_consumer;

import java.util.function.Predicate;

public class prediacteExample {

    public static void main(String[] args) {
        Predicate<Integer> h=x->x >5;
        Predicate<Integer> m = x -> (x % 2) == 0;
        Predicate<Integer> r=h.and(m);
        System.out.println(r.test(8)); // true
    }
}
