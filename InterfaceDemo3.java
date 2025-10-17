interface Demo
{
    int iNo = 11;           
    void Display();         
}

class Hello implements Demo      
{
    public void Display()
    {
        System.out.println("Inside display...");
    }
} 

class InterfaceDemo3
{
    public static void main(String[] args) 
    {
        System.out.println(Demo.iNo);       // to show iNo is public and static
        //Demo.iNo = 12;                      // to show iNo is final -> ERROR

        Hello hobj = new Hello();

        hobj.Display();
    }
}