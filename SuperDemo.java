class Hello
{
    public int i ;

    public Hello(int no)
    {
        System.out.println("Inside hello construtor...");
        this.i = no + 1 ; // nearest value will be accessed 
    }

    public void Display()
    {
        System.out.println("Inside hello display...");
    }
}

class Demo extends Hello
{
    public int i ;
    
    public Demo(int a)
    {
        super(a);                                               // first use
        System.out.println("Inside demo constructor...");
        this.i = a;                                             
    }

    public void Display()
    {
        System.out.println("Inside display..."+i);      // 0
        System.out.println("Inside display..."+this.i); // 51       
        System.out.println("Inside display..."+super.i);// 52   // second use
        //this.i = a;                                             // third use   
    }
}

public class SuperDemo 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo(51);
        dobj.Display();// child class obj will call its own display
    }
}
/*

if the Hello class doesn't contain the default Hello() constructor as being pen source code
to handle this we use super in inherited parameterized class
 J_23_SuperDemo.java:17: error: constructor Hello in class Hello cannot be applied to given types;
    {
    ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
 */
