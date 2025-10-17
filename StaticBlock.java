class Demo
{
    public int i;               // Instance variable
    static public int j = 21;   // Class variable

    public Demo()
    {
        this.i = 11 ;
    }

    static
    {
        j = 21;
    }

    public void fun()           // Instance Method 
    {
        System.out.println("fun i : " + this.i);
        System.out.println("fun j : " + Demo.j);
    }
    
    static public void gun()           // Class Method 
    {
        //System.out.println("fun i : " + this.i);  // NA as static method can't access non static
        System.out.println("fun j : " + Demo.j); 
    }
}

public class StaticBlock
{
    public static void main(String[] args) 
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();

        System.out.println(dobj.i);
        dobj.fun();
    }
}
