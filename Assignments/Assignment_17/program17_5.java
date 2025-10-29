class Logic
{
    public void printTable(int num)
    {
        // Write logic here
        for(int i = 1; i <= 10; i++)
        {
            System.out.print((num * i) + " ");
        }
        System.out.println();
    }
}

class program17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}