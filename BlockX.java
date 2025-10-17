class Demo
{
    public int i;               // Instance variable
    static public int j = 21;   // Class variable

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    {
        System.out.println("Inside initializer block");
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11 ;
    }
}

public class BlockX 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main"); // will run

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}
