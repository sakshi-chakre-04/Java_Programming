package Assignment_16;

class Logic
{
    public int countDigits(int num)
    {
        // Write logic here
        int iCount = 0;
        
        if(num == 0)
        {
            return 1;
        }
        
        if(num < 0)
        {
            num = -num;
        }
        
        while(num != 0)
        {
            num = num / 10;
            iCount++;
        }
        return iCount;
    }
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.countDigits(1275);
        System.out.println("Digits are " + ret);
    }
}