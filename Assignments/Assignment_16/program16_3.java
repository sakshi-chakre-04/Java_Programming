package Assignment_16;

class Logic
{
    public int findFactorial(int num)
    {
        // Write logic here
        int iFact = 1;
        if(num < 0)
        {
            num = -num;
        }
        for(int i = num; i >= 1; i--)
        {
            iFact = iFact * i;
        }
        return iFact;
    }
}

class program16_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.findFactorial(5);
        System.out.println("Factorial is " + ret);
    }
}