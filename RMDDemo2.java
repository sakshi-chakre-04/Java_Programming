class Base
{
    public int i, J ;

        public void fun ()
        {
            System.out.println("Inside Base fun()...\n"); 
        }

        public void gun ()
        {
            System.out.println("Inside Base gun()...\n");
        }
 
        
        public void sun ()
        {
            System.out.println("Inside Base sun()...\n");
        }

        public void bun ()
        {
            System.out.println("Inside Base bun()...\n"); 
        }
}

class Derived extends Base
{
    public int x ;

        public void gun ()
        {
            System.out.println("Inside Base gun()...\n"); 
        }

        public void sun ()
        {
            System.out.println("Inside Base sun()...\n");
        }

        public void run ()
        {
            System.out.println("Inside Base run()...\n");
        }

        public void mun ()
        {
            System.out.println("Inside Base mun()...\n"); 
        }
}

public class RMDDemo2 
{
    public static void main(String[] args) 
    {
        Base bp = new Derived();            // Upcasting

        bp.fun();                      // Base fun
        bp.gun();                      // Derived gun
        bp.sun();                      // Derived sun
        // bp->run();                      // ERROR
        // bp->mun();                      // ERROR
        bp.bun();                      // Base bun
    }
}
