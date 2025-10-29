package Assignment_16;

class Logic
{
    public void checkEvenOdd(int num)
    {
        // Write logic here
        if(num % 2 == 0)
        {
            System.out.println("It is an Even number");
        }
        else
        {
            System.out.println("It is an Odd number");
        }
    }
}

class program16_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(11);
    }
}