package Arrays.NormalCode;

public class allNegitiveATOneSide {
    public static void main(String[] args)
    {
        int[] arr={1,-2,3,-8,-9,4,5};
       // first we wil add all negitive numbers then go to positive numbers then print
        int[] temp=new int[arr.length];
        int index=0;
        for(int a:arr) {
            if(a<0) {
                temp[index++]=a;
            }
        }

        for(int a:arr) {
            if(a>0) {
                temp[index++]=a;
            }
        }

        for(int a:temp)
        {
            System.out.print(a+"  ");
        }

    }
}
