class Demo
{
    public int iNo1;//require to specify for each member
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default constructor");
    }

    public Demo(int i, int j)
    {
        System.out.println("Inside Parameterized constructor");
    }

    protected void finalize()// ~Demo()  ,  //deprecated in java (but asked in interview)
    {
        System.out.println("Inside finalize() !");
    }
}
public class ConstructorDestructor 
{
    public static void main(String[] args) 
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

        dobj1=null;
        dobj2=null;//ethics forks

        System.gc(); //static ->System

        System.out.println("End of main");
    }
}
