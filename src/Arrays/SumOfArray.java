package Arrays;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args)
    {
        int[] a=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
