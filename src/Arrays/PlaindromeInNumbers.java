package Arrays;

public class PlaindromeInNumbers {
    static void palindrome(int r)
    {
        String original=Integer.toString(r);
        String rev=new StringBuilder(original).reverse().toString();
        if(original.equals(rev)){
            System.out.println("YES IT IS PLAINDROME"+"  "+rev);
        }
        else{
            System.out.println("NO IT IS NOT PLAINDROME"+"  "+rev);
        }

    }
    public static void main(String[] args)
    {
        int h=101;
        int m=102;
        palindrome(h);
        palindrome(m);

    }
}
