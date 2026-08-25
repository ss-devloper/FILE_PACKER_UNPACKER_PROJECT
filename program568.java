// accept the file name from user
// FileWriter ngamed class
import java.util.Scanner;
import java.io.*;
class program568
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        boolean bRet  =false;
        
       

        System.out.println("Enter the name of file");
        Scanner sobj =new Scanner(System.in);
        FileName =sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
            System.out.println("File name is :"+fobj.getName());
            System.out.println("file path : "+fobj.getAbsolutePath());
            System.out.println("File size :"+fobj.length());

        }
        else 
        {
            System.out.println("There is no such file");
        }
        
      
        sobj.close();
    }
}