package Arrays.NormalCode;

public class AmstrongNumber {
    static void amstrong(int r)
    {
        int m;
        int sum=0;
        int mul=1;
        int rrr=r;
        String str=String.valueOf(r);
        int length=str.length();
        while(r>0) {
            m=r%10;
            mul=(int) Math.pow(m,length);
            sum=sum+mul;
            r=r/10;
        }
        if(sum==rrr) {
            System.out.println("yes it is amstrong   "+rrr);
        }
    }

    public static void main(String[] args)
    {
         int[] m={371,303,404};
         for(int i=0;i<m.length;i++) {
            amstrong(m[i]);
        }
    }
}
