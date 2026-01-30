import java.util.*;
import java.io.*;

/*
 * Question 1: Write a program in Java which accepts file name from user 
 * and display total number of bytes read from that file.
 */

class Program62_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        if (fobj.exists()) {
            // length() returns the total bytes in the file
            System.out.println("Total number of bytes in file: " + fobj.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}