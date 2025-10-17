class Demo
{
    public int i;               // Instance variable
    static public int j = 21;   // Class variable

    static
    {
        System.out.println("Inside static block");
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside constructor");
        this.i = 11 ;
    }
}

public class Blocks 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main"); // will run

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
    }
}

// static block -> anonoymous block
