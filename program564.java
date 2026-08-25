// accept the file name from user
// FileWriter ngamed class 
import java.util.Scanner;
import java.io.*;
class program564
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        boolean bRet  =false;
        FileReader frobj =null;
       

        System.out.println("Enter the name of file");
        Scanner sobj =new Scanner(System.in);
        FileName =sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
            frobj =new FileReader(FileName);
        }
        else 
        {
            System.out.println("There is no such file");
        }
        if(frobj != null)
        {
            frobj.close();
        }
        sobj.close();
    }
}