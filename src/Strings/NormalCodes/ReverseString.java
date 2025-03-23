package Strings.NormalCodes;

public class ReverseString {
    public static void main(String[] args) throws Exception {
        String s="hello";
        String m="";
        for(int i=s.length()-1;i>=0;i--)
        {
            m=m+s.charAt(i);
        }
        System.out.println(m);
        StringBuilder sb = new StringBuilder(s);
        String r=sb.reverse().toString();
        System.out.println(r);
    }
}
