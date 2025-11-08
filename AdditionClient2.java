import java.util.*;
import java.io.*;
import java.net.*;

public class AdditionClient2
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running...");


        Socket sobj = new Socket("localhost",2100);
        System.out.println("Server sucessfully connected.");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());//(system.in)->keyboard,here->socket 
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
    }
}