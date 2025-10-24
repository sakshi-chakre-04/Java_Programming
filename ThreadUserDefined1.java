class Demo extends Thread
{   
    public void run()   // callback
    {   
        System.out.println("Inside run method .");
    }
}

class ThreadUserDefined1 
{
    public static void main(String[] args) 
    {
        Demo dobj = new Demo();
        dobj.start();
    }
}
