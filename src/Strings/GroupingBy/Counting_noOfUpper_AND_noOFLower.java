package Strings.GroupingBy;

public class Counting_noOfUpper_AND_noOFLower {
    public static void main(String[] args) {
        String s="Hello worlLD jhsdbscjhhjHGGHCGHJ";
        int r=(int) s.chars().mapToObj(c->(char) c)
                .filter(c-> Character.isUpperCase(c)).count();
        int rr=(int) s.chars().mapToObj(c->(char) c)
                .filter(c-> Character.isLowerCase(c)).count();
        System.out.println("Number of Upper case characters: "+r);
        System.out.println("Number of Lower case characters: "+rr);

//      you wan  s.chars() returns an IntStream of Unicode code points (ints), not characters.
//                .boxed() would give you a Stream<Integer>, not Stream<Character>, \n
//        which isn\'t what t when working with Character methods.
    }
}
