package ComparableAndCompuator;
import java.util.*;
public class ConvertingArrayToList {
    public static void main(String[] args)
    {
        int[] a={1,2,1,3,4,5};
        List<Integer> r=new ArrayList<>(Arrays.stream(a).boxed().toList());
        r.forEach(x->System.out.print(" "+x));
        Collections.sort(r);
        System.out.println("before");
        r.forEach(x->System.out.print(" "+x));

    }
}
