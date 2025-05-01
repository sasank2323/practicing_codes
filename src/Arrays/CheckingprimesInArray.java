package Arrays;
import java.util.*;

public class CheckingprimesInArray {

     static void checkPrime(int h)
    {
        int flag=0;
        for(int i=2;i<h/2+1;i++) {
            if(h==2 || h%i==0) {
              flag=1;
            }
        }
        if(flag==0) {
            System.out.println("it is prime"+" "+h);
        }

    }
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,44,55,22,77,88,564};

//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
        for (int i = 0; i < a.length; i++) {
            checkPrime(a[i]);
        }
    }
}
