import java.util.Scanner;
import java.io.*;
class program557
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Demo.txt");  // object creation of file named class
        boolean bRet =fobj.createNewFile();   // now file gets created in current directory
        if(bRet == true)
        {
            System.out.println("The file gets succssfully created");
        }
        else 
        {
            System.out.println("Unable to creat file");
        }
    }
}