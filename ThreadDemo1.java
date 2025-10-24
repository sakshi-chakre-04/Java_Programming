public class ThreadDemo1 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main method.");    

        String name = Thread.currentThread().getName();
        System.out.println("Name of current thread."+name);
    }
}
/*
 Thread.currentThread() returns thread class reference..
 called with . as static
 */