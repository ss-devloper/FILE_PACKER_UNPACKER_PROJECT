// accept the file name from user
// FileWriter ngamed class 
import java.util.Scanner;
import java.io.*;
class program563
{
    public static void main(String A[]) throws Exception
    {
        String FileName =null;
        boolean bRet  =false;
       

        System.out.println("Enter the name of file");
        Scanner sobj =new Scanner(System.in);
        FileName =sobj.nextLine();

        
        FileReader frobj = new FileReader(FileName);  // if file not present gets filenot found exception 

        frobj.close();
        sobj.close();
    }
}