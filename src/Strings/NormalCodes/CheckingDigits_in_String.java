package Strings.NormalCodes;

public class CheckingDigits_in_String {
    public static void main(String[] args)
    {
        String str="hello123";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                System.out.println(str.charAt(i) +" is a digit");
            }
        }
        long h=str.chars().mapToObj(x->(char) x).filter(rr->Character.isDigit(rr)).count();

        boolean hasDigit = str.chars().anyMatch(c -> Character.isDigit(c));

        System.out.println("hasDigit ?" +" "+hasDigit);
        System.out.println(h);
    }
}
