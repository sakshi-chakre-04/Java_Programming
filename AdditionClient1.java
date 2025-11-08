import java.util.*;
import java.io.*;
import java.net.*;

public class AdditionClient1 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running...");


        Socket sobj = new Socket("localhost",2100);
        System.out.println("Server sucessfully connected.");
    }
}

// connection code
