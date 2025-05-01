package lists.NormalQuestions;
import java.util.ArrayList;

public class FindingNoNRepeatingValues {
    public static void main(String[] args)
    {
        ArrayList<String> h=new ArrayList<>();
        String[] str={"sasank","make","rrr","make","sasank","maker"};
        for(String st:str){
            h.add(st);
        }
        h.stream()
                .filter(x->h.indexOf(x)==h.lastIndexOf(x))
                        .forEach(System.out::println);
        Long rrr=h.stream()
                .filter(x->h.indexOf(x)==h.lastIndexOf(x)).count();
        System.out.println(rrr);
    }
}
