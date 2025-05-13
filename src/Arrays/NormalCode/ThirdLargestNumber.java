package Arrays.NormalCode;
import java.util.*;
public class ThirdLargestNumber {
    public static void main(String[] args)
    {
        int[] arr={20,77,88,66,9999,1000,77777};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
        int m=0,h=0,r=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++) {
             if(arr[i]>h)
             {
                 r=m;
                 m=h;
                 h=arr[i];
             }
            }
        }
        System.out.println(r);
    }
}
