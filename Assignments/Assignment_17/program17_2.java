class Logic
{
    public boolean checkPalindrome(int num)
    {
        // Write logic here
        int iRev = 0;
        int iDigit = 0;
        int iOriginal = num;
        
        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }
        
        return iOriginal == iRev;
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        boolean ret = obj.checkPalindrome(121);
        if(ret == true)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}