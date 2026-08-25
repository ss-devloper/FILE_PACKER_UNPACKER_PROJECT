// accept the file name from user
// FileWriter ngamed class 
// lets read something 
import java.util.Scanner;
import java.io.*;
class program565
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
            System.out.println((char)frobj.read());  // 74 J : ascii value : // (char ) : J comes via converting 
            System.out.println((char)frobj.read());
            System.out.println((char)frobj.read());

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