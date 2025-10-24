class Demo extends Thread
{   
    public void run()   // callback
    {   
        System.out.println("Inside run method ."+ Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoin
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main thread...");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj1.setName("second");

        dobj1.start();  // jvm part i.e worker -> work of scheduling
        dobj2.start();

        System.out.println("End of main thread .");
    }
}
/*
 only main method has its own name, others need a name 
 */