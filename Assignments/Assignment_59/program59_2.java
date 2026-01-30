import java.util.*;
import java.io.*;

/*
 * Question 2: Write a program in Java which accepts a directory name 
 * from user and display only regular files (ignore directories).
 */

class Program59_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();

        if(fileList != null) {
            System.out.println("Regular files in the directory:");
            for(File f : fileList) {
                if(f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}