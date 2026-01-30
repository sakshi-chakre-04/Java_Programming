import java.io.*;
import java.util.*;

/*
 * Question 2: Write a program in Java which copies a file using normal streams 
 * and buffered streams and displays the time required for both.
 */

class program63_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String src = sobj.nextLine();

        // 1. Normal Stream Copy
        long startNormal = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream("normal_copy.txt")) {
            int data;
            while ((data = fis.read()) != -1) { fos.write(data); }
        } catch (Exception e) {}
        long endNormal = System.currentTimeMillis();

        // 2. Buffered Stream Copy
        long startBuffer = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_copy.txt"))) {
            byte[] b = new byte[1024];
            int len;
            while ((len = bis.read(b)) != -1) { bos.write(b, 0, len); }
        } catch (Exception e) {}
        long endBuffer = System.currentTimeMillis();

        System.out.println("Time taken by Normal Streams: " + (endNormal - startNormal) + " ms");
        System.out.println("Time taken by Buffered Streams: " + (endBuffer - startBuffer) + " ms");
    }
}