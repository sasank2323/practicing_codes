package lists.NormalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class listPlusStreams {
    public static void main(String[] args)
    {
        Random r=new Random();
        List<Integer> h=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            h.add(r.nextInt(90)+10);
        }
        System.out.println(h);

        int maxx=h.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println("Maximum value: "+maxx);
    }
}
