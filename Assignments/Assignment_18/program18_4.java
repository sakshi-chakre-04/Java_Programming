package Assignment_18;

class Logic
{
    public void sumEvenOddDigits(int num)
    {
        // Write logic here
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;
        
        if(num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
            num = num / 10;
        }
        System.out.println("Sum of even digits: " + iEvenSum);
        System.out.println("Sum of odd digits: " + iOddSum);
    }
}

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}