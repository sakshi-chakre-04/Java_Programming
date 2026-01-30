import java.util.*;
import java.io.*;

/*
 * Question 3: Write a program in Java which accepts file name and integer N 
 * from user and copy last N bytes into a new file.
 */

class Program62_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String name = sobj.nextLine();
        System.out.println("Enter number of bytes (N): ");
        int n = sobj.nextInt();

        File fobj = new File(name);
        long fileSize = fobj.length();

        try (FileInputStream fio = new FileInputStream(name);
             FileOutputStream foo = new FileOutputStream("Last_N_Bytes.txt")) {
            
            // Skip to the start of the last N bytes
            long skipBytes = fileSize - n;
            if (skipBytes > 0) {
                fio.skip(skipBytes);
            }

            int data;
            while ((data = fio.read()) != -1) {
                foo.write(data);
            }
            System.out.println("Last N bytes copied successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}