class Demo extends Thread
{   
    public void run() 
    {   
        System.out.println("Inside run method ."+ Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinXX
{
    public static void main(String[] args)  
    {
        System.out.println("Inside main thread...");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj1.setName("second");

        dobj1.start();  
        dobj2.start();

        // checked exception
        try
        {
            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {}

        System.out.println("End of main thread .");
    }
}

// to remove -> throws InterruptedException, call inside try

// Q. can you achieve multithreading using synchronization