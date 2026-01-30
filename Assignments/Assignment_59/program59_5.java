import java.util.*;
import java.io.*;

/*
 * Question 5: Write a program in Java which accepts a directory name 
 * from user and display file name along with its absolute path.
 */

class Program59_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name: ");
        String name = sobj.nextLine();

        File fobj = new File(name);
        File[] fileList = fobj.listFiles();

        if(fileList != null) {
            System.out.println("File names with their absolute paths:");
            for(File f : fileList) {
                System.out.println("Name: " + f.getName());
                System.out.println("Path: " + f.getAbsolutePath());
                System.out.println("-----------------------------------");
            }
        }
    }
}