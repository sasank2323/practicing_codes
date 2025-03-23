package lists;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class New {
        public static void main(String[] args) {
            // Create a stream of strings
            Stream<String> stream = Stream.of("apple", "banana", "cherry");
            Stream<String> stream1 = Stream.of("apple", "banana", "cherry");
            Stream<String> stream2 = Stream.of("apple", "banana", "cherry");

           String h=stream.collect(Collectors.joining(","));
           System.out.println("Joining function output"+h);

           Map<Integer,List<String>> r=stream1.collect(Collectors.groupingBy(s->s.length()));
           System.out.println("Grouping by length"+r);

           Map<Boolean,List<String>> rr=stream2.collect(Collectors.partitioningBy(s->s.length()>5));
           System.out.println("Partitioning by length"+rr);
    }
}
