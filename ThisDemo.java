class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }
    
    public Demo()
    {
        System.out.println("Inside default...");
        this.i = 0;                                             // first use
    }

    public Demo(int a)
    {//this concept on in java - to go from 1 constructor to other
        this();                                                 // second use
        System.out.println("Inside parameterized...");
        // this();  -->if not written on 1st line it will throw an error 
    }

    public void Display()
    {
        System.out.println("Inside display..."+this.i);         // third use
    }
}

public class ThisDemo 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }    
}

/*
 call to this must be first statement in constructor
        this();
 */