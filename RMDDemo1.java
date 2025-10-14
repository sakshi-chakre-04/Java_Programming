class Base
{
    public int i, J ;
}

class Derived extends Base
{
    public int x ;
}

class RMDDemo1
{
    public static void main(String[] args) 
    {
        Base bp1 = new Base() ;                 // No casting
        Derived dp1 = new Derived() ;           // No casting
        Base bp2 = new Derived() ;              // Upcasting
        //Derived dp2 = new Base() ;              // Downcasting  // ERROR

    }
}
// interview Q : runtime method displatch 
// do u know the concept of RMD ?