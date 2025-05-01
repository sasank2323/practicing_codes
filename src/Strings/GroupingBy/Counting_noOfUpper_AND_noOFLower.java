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
    }
}
