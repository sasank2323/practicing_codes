package HashMAp11;

import java.util.HashMap;
import java.util.Map;

public class mapIntro {
    public static void main(String[] args)
    {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"one");
        h.put(2,"sasank");
        h.put(2,"ss");
        //in hashset duplicates are not allowed so if you try to add duplicate the value got updated
        for(Map.Entry<Integer,String> r:h.entrySet())
        {
            System.out.println(r.getKey()+" "+r.getValue());
        }
        System.out.println(" ");
        System.out.println("here first we pass object so it got removed after matching");
        System.out.println("here second we pass key as well as value both should match but value not matched so not get removed");
        System.out.println(" ");
        h.remove(2);
        h.remove(1,"two");
        for(Map.Entry<Integer,String> r:h.entrySet())
        {
            System.out.println(r.getKey()+" "+r.getValue());
        }

    }
}
