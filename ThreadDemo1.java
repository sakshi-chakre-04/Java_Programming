public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("Inside main method.");

        String name = Thread.currentThread().getName();
        System.out.println("Name of current thread is : " + name);
    }
}
/*
 * Thread.currentThread() returns thread class reference..
 * called with . as static
 */

// Thread.currentThread()
// → Ye ek static method hai jo currently executing thread ka reference (object)
// return karta hai.
// Matlab: "Abhi jo thread run ho raha hai uska object mujhe do."

// .getName()
// → Ye us thread ka name return karta hai (String ke form mein).
// Default main thread ka naam hota hai "main".