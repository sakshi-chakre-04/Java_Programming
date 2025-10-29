class Logic
{
    public int findMax(int a, int b)
    {
        // Write logic here
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}

class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.findMax(20, 15);
        System.out.println("Max is " + ret);
    }
}