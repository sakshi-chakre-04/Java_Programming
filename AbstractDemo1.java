abstract class Base
{
    public int i, J ;

    public int Addition(int A, int B)
    {
        return A + B;
    }

    abstract public int Substraction(int A, int B);
}

public class AbstractDemo1 
{
    public static void main(String[] args) 
    {
        //Base bp = new Base();   //error: Base is abstract; cannot be instantiated
    }
}
