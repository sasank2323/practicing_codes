package lists.NormalQuestions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class mm{
    private String name;
    private int r;
    mm(String name, int r) {
        this.name = name;
        this.r = r;
    }
    public String getName() {
        return name;
    }
    public int getR() {
        return r;
    }
}
public class Playing_with_entity {
    public static void main(String[] args)
    {
        List<mm> list= Arrays.asList(
                new mm("ss",10),
                new mm("maker",20)
        );
        List<mm> h=list.stream().filter(x->x.getR()%2==0)
                .map(hh->new mm(hh.getName().toUpperCase(),hh.getR()))
                .toList();
        System.out.println(h);
        for(mm listobj:h)
        {
            System.out.println(listobj.getName()+" "+listobj.getR());
        }
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> flatList = nestedList.stream()
                .flatMap(li -> li.stream()) // Flatten each inner list
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
}
