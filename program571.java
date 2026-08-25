// accept the file name from user
// FileWriter ngamed class
// 
import java.util.Scanner;
import java.io.*;
class program571
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
            // for reading
           FileInputStream fiobj =new FileInputStream(fobj);
           byte Arr[] =new byte[50];

           fiobj.read();
           System.out.println(Arr);

        }
        else 
        {
            System.out.println("There is no such file");
        }
        
      
        sobj.close();
    }
}