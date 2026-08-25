// accept the file name from user
import java.util.Scanner;
import java.io.*;
class program557
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        Scanner sobj =new Scanner(System.in);
        

        System.out.println("Enter the name of file");
        FileName =sobj.nextLine();

        File fobj = new File(FileName);
        boolean bRet =fobj.createNewFile();   // now file gets created in current directory
        if(bRet == true)
        {
            System.out.println("The file gets succssfully created");
        }
        else 
        {
            System.out.println("Unable to creat file");
        }

        sobj.close();
    }
}