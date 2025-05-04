package ComparableAndCompuator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArraysSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }

        Long r=Arrays.stream(a).count();
        System.out.println(r);

        System.out.println("after sorting");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }


    }
}
