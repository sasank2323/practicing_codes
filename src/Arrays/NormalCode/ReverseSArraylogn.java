package Arrays.NormalCode;

public class ReverseSArraylogn {
    public static void main(String[] args)
    {
        int[] h=new int[5];
        int r=0;
        int temp;
        int l=h.length-1;
        for(int i=0;i<h.length;i++)
        {
            h[i]=i+1;
        }

        while(r<l)
        {
            temp=h[l];
            h[l]=h[r];
            h[r]=temp;
            l--;
            r++;
        }

        for(int rr:h)
        {
            System.out.println(rr);
        }
    }
}
