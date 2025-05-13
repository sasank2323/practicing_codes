package Strings.NormalQuestions2;

import java.util.*;

public class anagram {

    public static void main(String[] args)
    {
        String r="silent";
        String f="ilents";

        char[] s1=r.toCharArray();
        char[] s2=f.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1,s2))
        {
            System.out.println("anagarm");
        }
        else{
            System.out.println("not a anangram");
        }



    }
}
