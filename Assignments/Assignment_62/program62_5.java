import java.io.*;
import java.util.*;

/*
 * Question 5: Write a program in Java which accepts file name from user 
 * and handle all possible file related exceptions properly.
 */

class Program62_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String name = sobj.nextLine();

        try {
            File fobj = new File(name);
            
            // Checking for various exception-prone scenarios
            if (!fobj.exists()) {
                throw new FileNotFoundException("The specified file was not found.");
            }
            if (!fobj.canRead()) {
                throw new IOException("Permission denied: Cannot read the file.");
            }

            FileInputStream fio = new FileInputStream(fobj);
            System.out.println("File opened successfully for reading.");
            fio.close();

        } catch (FileNotFoundException e) {
            System.out.println("Specific Error: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Access Error: Check your permissions.");
        } catch (IOException e) {
            System.out.println("General I/O Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error occurred: " + e.toString());
        } finally {
            System.out.println("Exception handling block execution completed.");
        }
    }
}