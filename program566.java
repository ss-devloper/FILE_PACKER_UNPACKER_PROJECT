// accept the file name from user
// FileWriter ngamed class 
// lets read something 
import java.util.Scanner;
import java.io.*;
class program566
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

            char Buffer[] =new char[50];   // craete a character array 
            frobj.read(Buffer,0,13);
            System.out.println(" data from file :"+(string)Buffer);  //  error

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