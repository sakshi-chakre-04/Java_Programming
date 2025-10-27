class Demo implements Cloneable
{
    public int i , J;

    public Demo(int a,int b )
    {
        this.i = a;
        this.J = b;
    }

    public Object clone()  throws CloneNotSupportedException// clone method can return any type of obj as void *
    {
        return super.clone();
    }
}

public class CloneDemo 
{
    public static void main(String[] args) 
    {
        try
        {
            Demo dobj1 = new Demo(11,21);
            Demo dobj2 = (Demo)dobj1.clone();   //error: incompatible types: Object cannot be converted to Demo so (Demo)

            System.out.println(dobj2.i);
            System.out.println(dobj2.J);
        }
        catch(CloneNotSupportedException cobj)
        {
            
        }
    }
}
