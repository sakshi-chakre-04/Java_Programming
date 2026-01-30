import java.io.*;
import java.util.*;

/*
 * Question 4: Write a program in Java which accepts file name from user 
 * and create a backup copy of it with name original_backup.ext.
 */

class Program62_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name with extension: ");
        String name = sobj.nextLine();

        // Splitting name and extension to insert "_backup"
        int dotIndex = name.lastIndexOf('.');
        String backupName;
        if (dotIndex != -1) {
            backupName = name.substring(0, dotIndex) + "_backup" + name.substring(dotIndex);
        } else {
            backupName = name + "_backup";
        }

        try (FileInputStream fio = new FileInputStream(name);
             FileOutputStream foo = new FileOutputStream(backupName)) {
            
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fio.read(buffer)) != -1) {
                foo.write(buffer, 0, length);
            }
            System.out.println("Backup created successfully: " + backupName);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}