import java.util.*;
import java.io.*;

/*
 * Question 1: Write a program in Java which accepts a directory name 
 * from user and display names of all files from that directory.
 */

class Program59_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);

        if(fobj.exists() && fobj.isDirectory()) {
            String[] list = fobj.list();
            System.out.println("Contents of the directory are:");
            for(String s : list) {
                System.out.println(s);
            }
        } else {
            System.out.println("Invalid directory name or directory does not exist.");
        }
    }
}