class Demo
{

}

public class ObjectClass1 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo();
        System.out.println(dobj.hashCode());
        System.out.println(dobj.getClass());
    }
}
