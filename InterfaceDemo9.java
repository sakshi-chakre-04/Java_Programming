interface A
{
    int iNo = 11;
    void fun();
    private void Display()
    {
        System.out.println("Inside private display method...");
    }
    default void gun()     
    {
        System.out.println("Inside gun...");
        Display();
    }
}


class Demo implements A
{
    public void fun()
    {
        System.out.println("inside fun...");        
    }
}
class InterfaceDemo9
{
    public static void main(String[] args) 
    {
       Demo dobj= new Demo();
       dobj.fun(); 
       dobj.gun();    
       // dobj.Display();       // ERROR as private 
    }
}