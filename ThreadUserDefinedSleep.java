class Demo extends Thread
{   
    public void run() 
    {   
        int i = 0;
        for(i = 1 ; i <= 5 ; i++)
        {
            System.out.println("Inside run method ."+ Thread.currentThread().getName());
        }
    }
}

class ThreadUserDefinedSleep
{
    public static void main(String[] args)  
    {
        System.out.println("Inside main thread...");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");

        

        // checked exception
        try
        {
            dobj1.start();  
            dobj2.start();

            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {}

        System.out.println("End of main thread .");
    }
}

// recheck this code 0/p should have 10 hreads