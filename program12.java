import java.util.Scanner;
import java.io.*;
class program12
{
     public static void main(String Arg[])
    {
        Scanner sobj =new Scanner(System.in);
        String FileName =null;
        System.out.println("Enter the name of file");
        FileName =sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File name is  : "+fobj.getName());

            System.out.println("File path is  :"+fobj.getAbsolutePath());

            System.out.println("File size is  :"+fobj.length());
        }
        else 
        {
            System.out.println("There is no such file ");
        }
        sobj.close();

    }
}