import java.util.*;
import java.io.*;

/*
 * Question 3: Write a program in Java which accepts a directory name 
 * from user and display only sub-directories from that directory.
 */

class Program59_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();

        if(fileList != null) {
            System.out.println("Sub-directories in the directory:");
            for(File f : fileList) {
                if(f.isDirectory()) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}