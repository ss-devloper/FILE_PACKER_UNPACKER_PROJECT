// accept the file name from user
// FileWriter ngamed class
// use two classes 
import java.util.Scanner;
import java.io.*;
class program569
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
            // to werite the data
          FileOutputStream foobj = new FileOutputStream(fobj);
          String str ="JAY ganesh...";
          
          // we have to convert string into byte
          foobj.write(str);  // error

        }
        else 
        {
            System.out.println("There is no such file");
        }
        
      
        sobj.close();
    }
}