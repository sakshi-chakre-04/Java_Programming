interface A
{
    int iNo = 11;
    void fun();
    default void gun()      // can provide concrete method but default keyword req. supported by Java 8+ only...
    {
        System.out.println("Inside gun...");
    }
}


class Demo implements A
{
    public void fun()
    {
        System.out.println("inside fun...");        
    }
}
class InterfaceDemo8
{
    public static void main(String[] args) 
    {
       Demo dobj= new Demo();
       dobj.fun(); 
       dobj.gun();     
    }
}