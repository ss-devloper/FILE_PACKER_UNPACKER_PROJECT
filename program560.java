// accept the file name from user
// delete();
import java.util.Scanner;
import java.io.*;
class program560
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        Scanner sobj =new Scanner(System.in);
        boolean bRet  =false;
        File fobj =null;   // beacuse uninitialised object creat exception 

        System.out.println("Enter the name of file");
        FileName =sobj.nextLine();
        fobj = new File(FileName);
        bRet =fobj.exists();  
        if(bRet == true)
        {
            fobj.delete();
            System.out.println("file gets deleted");
        }
        else 
        {
            System.out.println("Theire is no such file");
        }
        sobj.close();
    }
}