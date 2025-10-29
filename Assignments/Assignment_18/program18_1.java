package Assignment_18;

class Logic
{
    public void checkPrime(int num)
    {
        // Write logic here
        int i = 0;
        boolean bFlag = true;

        if (num <= 1)
        {
            bFlag = false;
        }
        else
        {
            for (i = 2; i <= num / 2; i++)
            {
                if (num % i == 0)
                {
                    bFlag = false;
                    break;
                }
            }
        }
        
        if(bFlag == true)
        {
            System.out.println("It is a Prime number");
        }
        else
        {
            System.out.println("It is not a Prime number");
        }
    }
}

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(13);
    }
}