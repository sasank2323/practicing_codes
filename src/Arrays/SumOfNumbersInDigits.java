package Arrays;
import java.util.*;
public class SumOfNumbersInDigits {
    public static void son(int h)
    {
        int sum=0;
        int m;
        while(h>0)
        {
            m=h%10;
            sum+=m;
            h=h/10;
        }
        System.out.println("the sum of numbers in a digit for"+h+"  is "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            son(a[i]);
        }

    }
}
