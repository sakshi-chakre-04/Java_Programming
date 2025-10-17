interface Demo
{
    int iNo = 11;           
    void Display();         
}

abstract  class Hello implements Demo      
{

} 

class InterfaceDemo2
{
    public static void main(String[] args) 
    {
        //Hello hobj = new Hello();     // ERROR
    }
}