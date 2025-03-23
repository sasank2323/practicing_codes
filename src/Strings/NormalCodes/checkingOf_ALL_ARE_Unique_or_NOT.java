package Strings.NormalCodes;

public class checkingOf_ALL_ARE_Unique_or_NOT {
    public static void main(String[] args)
    {
        String s="hello";

        boolean r=s.chars().distinct().count()==s.length();

    }
}
