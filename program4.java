// acceppt file name from user & save in FileName
// if exist : delete that file 

import java.io.File;
import java.io.FileInputStream;
import java.text.ListFormat.Style;
import java.util.Scanner;

class program4
{

    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        boolean bRet = false;
        File fobj = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name of file");
        FileName=sobj.nextLine();

         fobj = new File(FileName);
        
        
        if(fobj.exists())
        {
            System.out.println("File is alredy present");

            fobj.delete();

            System.out.println("File gets deleted");
        }
        else 
        {
            System.out.println("There is no such file");
        }
        
        sobj.close();

    }

}