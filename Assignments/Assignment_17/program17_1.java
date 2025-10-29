class Logic
{
    public int sumOfDigits(int num)
    {
        // Write logic here
        int iSum = 0;
        int iDigit = 0;
        
        if(num < 0)
        {
            num = -num;
        }
        
        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }
        return iSum;
    }
}

class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int ret = obj.sumOfDigits(1234);
        System.out.println("Sum of digits is " + ret);
    }
}
