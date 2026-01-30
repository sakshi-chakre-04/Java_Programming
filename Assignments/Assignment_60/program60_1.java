import java.util.*;
import java.io.*;

/*
 * Question 1: Write a program in Java which accepts a directory name 
 * from user and calculate total size of all files from that directory.
 */

class Program60_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();
        long totalSize = 0;

        if(fileList != null) {
            for(File f : fileList) {
                if(f.isFile()) {
                    totalSize = totalSize + f.length();
                }
            }
            System.out.println("Total size of all files is: " + totalSize + " bytes");
        } else {
            System.out.println("Directory not found or is empty.");
        }
    }
}