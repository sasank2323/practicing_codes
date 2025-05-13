package ComparableAndCompuator;

import java.util.ArrayList;
import java.util.Collections;

public class WorkingWithENtityComparable {
    public static void main(String[] args)
    {
        ArrayList<student> h=new ArrayList<>();
        h.add(new student(1000,"sasank","19"));
        h.add(new student(200,"sai","2000"));
        h.add(new student(3000,"max","333"));
        h.stream().forEach(x->System.out.println("id "+x.id+" age "+x.age+" name "+x.name));

        Collections.sort(h);
         System.out.println("after sorthing");
        h.stream().forEach(x->System.out.println("id "+x.id+" age "+x.age+" name "+x.name));

    }
}

// main problem of comparable is we have to define it in the same class and only one we can define
class student implements Comparable<student>
{
    int id;
    String name;
    String age;
    public student(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //this is current o.id lets say it is index 1 is index 2
    @Override
    public int compareTo(student o) {
        return o.id-this.id;
    }

//    //this is for string
//    @Override
//    public int compareTo(student o) {
//        return this.name.compareTo(o.name);
//    }
}