package Assignment_16;

class Logic
{
    public int reverseNumber(int num)
    {
        // Write logic here
        int iRev = 0;
        int iDigit = 0;
        
        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }
        return iRev;
    }
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.reverseNumber(127);
        System.out.println("Reverse is " + ret);
    }
}