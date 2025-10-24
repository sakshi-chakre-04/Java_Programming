class Demo extends Thread
{   
    public void run()   // callback
    {   
        System.out.println("Inside run method .");
    }
}

class ThreadUserDefined2
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main thread...");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();  // jvm part i.e worker -> work of scheduling
        dobj2.start();

        System.out.println("End of main thread .");
    }
}
