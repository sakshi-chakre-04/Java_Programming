interface Demo
{
    int iNo = 11;           //public,final,static
    void Display();         //by default public and abstract
}

// class Hello implements Demo      // ERROR
// {

// } 

class InterfaceDemo1
{
    public static void main(String[] args) 
    {
        Hello hobj = new Hello();
    }
}