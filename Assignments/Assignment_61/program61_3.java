import java.io.*;
import java.util.*;

/*
 * Question 3: Write a program in Java which accepts file name and one string 
 * from user and append that string at the end of file.
 */

class Program61_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String name = sobj.nextLine();
        System.out.println("Enter string to append: ");
        String str = sobj.nextLine();

        // Passing 'true' to FileOutputStream enables append mode
        try (FileOutputStream foo = new FileOutputStream(name, true)) {
            byte[] data = str.getBytes();
            foo.write(data);
            System.out.println("String appended successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}