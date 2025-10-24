class Demo extends Thread
{   
    public void run()   // callback
    {   
        System.out.println("Inside run method ."+ Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinX
{
    public static void main(String[] args)  throws InterruptedException
    {
        System.out.println("Inside main thread...");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");

        dobj1.start();  // jvm part i.e worker -> work of scheduling
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of main thread .");
    }
}


//e.g.sir 

// i.e. we tell jvm that throws an exception