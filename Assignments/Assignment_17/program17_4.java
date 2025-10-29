class Logic
{
    public int findMax(int a, int b, int c)
    {
        // Write logic here
        if(a >= b && a >= c)
        {
            return a;
        }
        else if(b >= a && b >= c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}

class program17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.findMax(7, 2, 8);
        System.out.println("Max is " + ret);
    }
}