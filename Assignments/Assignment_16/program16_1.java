package Assignment_16;

class Logic
{
    public int calculateSum(int n)
    {
        // Write logic here
        int iSum = 0;
        for(int i = 1; i <= n; i++)
        {
            iSum = iSum + i;
        }
        return iSum;
    }
}

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.calculateSum(10);
        System.out.println("Sum is " + ret);
    }
}