package Interface;

@FunctionalInterface
interface hh
{
    public int h1h(int r);
}

class imp implements hh{
    public int h1h(int r)
    {
        return r*r;
    }
}
public class lambdaandInterfaceExample{
    public static void main(String[] args)
    {
        hh rr=(a)-> a*a;
       int mm=rr.h1h(10);
       System.out.println(mm);

       imp i=new imp();
       int result=i.h1h(10);
       System.out.println(result);
    }
}
