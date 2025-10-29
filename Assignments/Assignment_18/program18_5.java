package Assignment_18;

class Logic
{
    public void checkSign(int num)
    {
        // Write logic here
        if(num > 0)
        {
            System.out.println("Number is Positive");
        }
        else if(num < 0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}

class program18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkSign(-6);
    }
}