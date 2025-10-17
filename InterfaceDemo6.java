interface A
{
    int iNo = 11;
    void fun();
}
interface B
{
    int iNo = 21;
    void fun();
}
class Demo implements A, B
{
    public void fun()
    {
        //System.out.println("inside fun..."+iNo);        //iNo generates ERROR
    }
}
class InterfaceDemo6
{
    public static void main(String[] args) 
    {
       Demo dobj= new Demo();
       dobj.fun();      // this is for both
    }
}