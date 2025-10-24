public class ThreadDemo2 
{
    public static void main(String[] args) 
    {
        System.out.println("Inside main method.");    
        Thread tobj = Thread.currentThread();   // static
        String name = tobj.getName();           // non-static
        System.out.println("Name of current thread."+name);
    }
}