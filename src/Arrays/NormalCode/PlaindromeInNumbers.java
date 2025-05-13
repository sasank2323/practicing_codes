package Arrays.NormalCode;

public class PlaindromeInNumbers {

    static void palindrome2(int h)
    {
        int initial=h;
        int rr=0;
        int rrr=0;
        while(h>0) {
            rrr=h%10;
            rr=(rr*10)+rrr;
            h=h/10;
        }
        if(initial==rr)
        {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
    static void palindrome(int r)
    {
        String original=Integer.toString(r);
        int i=Integer.parseInt(original);
        System.out.println("converting to int  "+i);
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
        palindrome2(h);
        palindrome2(m);

    }
}
