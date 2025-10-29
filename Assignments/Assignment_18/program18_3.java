package Assignment_18;

class Logic
{
    public void printOddNumbers(int n)
    {
        // Write logic here
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class program18_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}